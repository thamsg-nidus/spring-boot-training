package com.opennidus.training.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.opennidus.training.Entity.Subscriber;
import com.opennidus.training.Service.Subscriber_service;

@RestController
public class Subscriber_Controller {

	@Autowired
	private Subscriber_service subscriberService;
	
	@RequestMapping("/subscribers")
	public List<Subscriber> getSubAllDetails(){
		return subscriberService.getSubAllDetails();
		
	}

	@RequestMapping("/subscribers/{id}")
	public Optional<Subscriber> getSubinfo (@PathVariable(value= "id")int id){
		return subscriberService.getSubinfo (id);
		
	}
	
	@RequestMapping("/subscribersbymail/{email}")
	public Optional<Subscriber> getSubsbyemail(@PathVariable(value= "email")String email){
		return subscriberService.getSubsbyemail(email);
		
	}

	@RequestMapping(method = RequestMethod.POST, value="/subscribers/new")
	public Subscriber createSubscriber(@RequestBody Subscriber subscriber) {
		return subscriberService.createSubscriber(subscriber);
	}

	@RequestMapping(method = RequestMethod.PUT, value="/subscribers/exists")
	public Subscriber updateSubscriber(@RequestBody Subscriber subscriber) {
		return subscriberService.updateSubscriber(subscriber);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/subscribers/{id}")
	public void deleteSubscriber(@PathVariable(value= "id")int id){
		subscriberService.deleteSubscriber(id);
		
	}

}
