package com.example.demo.service.client;

import com.example.demo.domain.client.Client;

import com.example.demo.util.MessageSender;
import org.springframework.stereotype.Service;


/**
 *
 * @author chefcompany.co
 */
@Service
public class ClientService {


	private final MessageSender<Client> messageSenderClient;

	public ClientService(MessageSender<Client> messageSenderClient) {
		this.messageSenderClient = messageSenderClient;
	}



	public void save(Client client) {

		System.out.println("Messages completed delivery");

	}


}
