package com.example.demo.mensajeria.client;


import com.example.demo.config.ClientQueueConfig;
import com.example.demo.domain.client.Client;
import com.example.demo.util.MessageSender;
import com.example.demo.util.gson.MapperJsonObjeto;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.core.MessagePropertiesBuilder;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MessageSenderBroker implements MessageSender<Client> {

    private final RabbitTemplate rabbitTemplate;
    private final MapperJsonObjeto mapperJsonObjeto;
    private final ClientQueueConfig clientQueueConfig;

    public MessageSenderBroker(RabbitTemplate rabbitTemplate, MapperJsonObjeto mapperJsonObjeto, ClientQueueConfig clientQueueConfig) {
        this.rabbitTemplate = rabbitTemplate;
        this.mapperJsonObjeto = mapperJsonObjeto;
        this.clientQueueConfig = clientQueueConfig;
    }

    @Override
    public void execute(Client message, String idMessage) {
        MessageProperties propiedadesMensaje = generarPropiedadesMensaje(idMessage);

        Optional<Message> cuerpoMensaje = obtenerCuerpoMensaje(message, propiedadesMensaje);
        if (!cuerpoMensaje.isPresent()) {
            return;
        }
        rabbitTemplate.convertAndSend(clientQueueConfig.getExchangeName(), clientQueueConfig.getRoutingKeyName(), cuerpoMensaje.get());
    }

    private MessageProperties generarPropiedadesMensaje(String idMessageSender ) {
        return MessagePropertiesBuilder.newInstance()
                .setContentType(MessageProperties.CONTENT_TYPE_JSON)
                .setHeader("idMensaje", idMessageSender)
                .build();
    }

    private Optional<Message> obtenerCuerpoMensaje(Object mensaje, MessageProperties propiedadesMensaje) {
        Optional<String> textoMensaje = mapperJsonObjeto.ejecutarGson(mensaje);

        return textoMensaje.map(msg -> MessageBuilder
                .withBody(msg.getBytes())
                .andProperties(propiedadesMensaje)
                .build());

    }


}
