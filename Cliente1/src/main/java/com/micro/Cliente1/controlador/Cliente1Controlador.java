package com.micro.Cliente1.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.micro.Cliente1.config.Cliente1Config;
import com.micro.Cliente1.modelo.Cliente1Properties;

@RestController
public class Cliente1Controlador {
 

	@Autowired
	private Cliente1Config cliente1Config;

	@GetMapping("/client1/read/properties")
	public String getPropertiesClient1() throws JsonProcessingException{
		ObjectWriter owj = new ObjectMapper().writer().withDefaultPrettyPrinter();
		Cliente1Properties propHotels = new Cliente1Properties(cliente1Config.getMsg() , cliente1Config.getBuildVersion() , cliente1Config.getMailDetails());
		String jsonString = owj.writeValueAsString(propHotels);
		return jsonString;
	}
}
