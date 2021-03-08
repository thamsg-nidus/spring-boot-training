package com.opennidus.training.Topic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return topicService.getAllTopics();
		
	}

//	@RequestMapping("/topics")
//	public List<Topic> getAllTopics(){
//		return topicService.getAllTopics();
//		
//	}
	
	@RequestMapping("/topics/{id}")
	public Optional<Topic> getTopic(@PathVariable(value= "id")int id){
		return topicService.getTopic(id);
		
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/topics")
	public Topic createTopic(@RequestBody Topic topic) {
		return topicService.createTopic(topic);
	}

	@RequestMapping(method = RequestMethod.PUT, value="/topics")
	public Topic updateTopic(@RequestBody Topic topic) {
		return topicService.updateTopic(topic);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
	public String deleteTopic(@PathVariable(value= "id")int id){
		return topicService.deleteTopic(id);
		
	}


}