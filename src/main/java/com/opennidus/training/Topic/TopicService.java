package com.opennidus.training.Topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getAllTopics() {
		List<Topic> top = new ArrayList<>();
		topicRepository.findAll()
		.forEach(top::add);
		return top;
	}
    
	public Optional<Topic> getTopic(int id){
		return topicRepository.findById(id);
				
	}

	public Topic createTopic(Topic topic) {
		return topicRepository.save(topic);
	}

	public Topic updateTopic(Topic topic) {
		return topicRepository.save(topic);
	}

	public String deleteTopic(int id) {
		Topic t = topicRepository.getOne(id);
		topicRepository.delete(t);
		return "Record has been Deleted";
	}
	

}