package it.corso.esempio.microservizio2.controller;


import it.corso.esempio.microservizio2.response.Microservizio2Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping(value="/api/microservizio1")
//public class Microservizio1Controller {
//
//	@Value("${server.port}")
//	private int randomServerPort;
//
//	@RequestMapping(value="/status", method= RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE )
//	public Microservizio1Response getStatus() {
//		Microservizio1Response res = new Microservizio1Response();
//		res.setStatus("OK" + this.randomServerPort);
//
//		return res;
//	}
//}


@RestController
@RequestMapping(value="/api")
public class Microservizio2Controller {

	@Value("${server.port}")
	private int port;

	@Value("${spring.application.name}")
	private String microservice;

	@RequestMapping(value="/address", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Microservizio2Response getPort(){
		Microservizio2Response res = new Microservizio2Response();
		res.setPort(this.port);
		res.setName(this.microservice);
		return res;
	}

//	@RequestMapping(value="/data", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//	public Microservizio2Response getDataFromOtherService(){
//		Microservizio2Response res = new Microservizio2Response();
//		RestTemplate restTemplate = new RestTemplate();
//		res.setPort(this.port);
//		res.setName(this.microservice);
//		String microservice2 = "http://localhost:8762/microservizio2/api/address";
//		res.setResponseFromOtherServices(restTemplate.getForEntity(microservice2, String.class));
//		return res;

	}