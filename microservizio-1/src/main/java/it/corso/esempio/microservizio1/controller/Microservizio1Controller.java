package it.corso.esempio.microservizio1.controller;

import it.corso.esempio.microservizio1.response.Microservizio1Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/microservizio1")
public class Microservizio1Controller {

	@Value("${server.port}")
	private int randomServerPort;

	@RequestMapping(value="/status", method= RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE )
	public Microservizio1Response getStatus() {
		Microservizio1Response res = new Microservizio1Response();
		res.setStatus("OK" + this.randomServerPort);

		return res;
	}
}
