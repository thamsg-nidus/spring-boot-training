package com.opennidus.training.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opennidus.training.Entity.Subscriber;
import com.opennidus.training.Repository.Subscriber_repository;

@Service
public class Subscriber_service {
	
	@Autowired
	private Subscriber_repository subscriberrepo;

	public List<Subscriber> getSubAllDetails(){
		//return subscriberrepo.findAll();
		return subscriberrepo.getAllSubscriber();
	}

	public Optional<Subscriber> getSubinfo (int id){
		return subscriberrepo.findById(id);
				
	}

	public Subscriber createSubscriber(Subscriber subscriber) {
		return subscriberrepo.save(subscriber);
	}

	public Subscriber updateSubscriber(Subscriber subscriber) {
		return subscriberrepo.save(subscriber);
	}

	public void deleteSubscriber(int id) {
		subscriberrepo.deleteSubscriber(id);
//		Subscriber s = subscriberrepo.getOne(id);
//		subscriberrepo.delete(s);
//		return "Record has been Deleted";
	}

	public Optional<Subscriber> getSubsbyemail(String email) {
		return subscriberrepo.getSubsbyemail(email);
	}

}
