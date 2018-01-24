package com.itsme.springBootTutor.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return Arrays.asList(
				new Topic("Spring", "Spring Framework", "Spring Framework description"),
				new Topic("JAva", "Java core", "Java Core description"),
				new Topic("Adv Java", "JAva Advance", "Advance Java description")
				);
	}
}
