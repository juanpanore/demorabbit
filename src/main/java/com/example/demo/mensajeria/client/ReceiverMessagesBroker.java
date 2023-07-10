package com.example.demo.mensajeria.client;


import com.example.demo.domain.client.Client;
import com.example.demo.service.client.ClientService;
import com.example.demo.util.gson.MapperJsonObjeto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ReceiverMessagesBroker {

    @Autowired
    private ClientService clientService;

    private final MapperJsonObjeto mapperJsonObjeto;

    public ReceiverMessagesBroker(MapperJsonObjeto mapperJsonObjeto) {
        this.mapperJsonObjeto = mapperJsonObjeto;
    }


    @RabbitListener(queues = "${client.queue-recibir.cliente.queue-name}")
    public void receiveMessageProcessClient(String message) {
        try {
            clientService.save(obtenerObjetoDeMensaje(message).get());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private Optional<Client> obtenerObjetoDeMensaje(String mensaje) {
        return mapperJsonObjeto.ejecutar(mensaje, Client.class);
    }


}
