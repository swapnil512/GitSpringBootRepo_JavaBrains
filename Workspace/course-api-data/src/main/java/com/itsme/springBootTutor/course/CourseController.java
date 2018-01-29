package com.itsme.springBootTutor.course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;

	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllcourses(@PathVariable String id) {
		return courseService.getAllCourses(id);
	}

	@RequestMapping("/topics/{topicId}/courses/{id}")
	public Optional<Course> getCourse(@PathVariable("id") String id) {
		return courseService.getCourse(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/courses")
	public void addCourse(@RequestBody Course course) {
		courseService.addCourse(course);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/courses/{id}")
	public void updateCourse(@RequestBody Course course) {
		courseService.updateCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value="/courses/{id}")
	public void deleteCourse(@PathVariable("id") String id) {
		courseService.deleteCourse(id);
	}

}
