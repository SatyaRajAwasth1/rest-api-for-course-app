package learn.springboot.restapis.controller;

import learn.springboot.restapis.entities.Course;
import learn.springboot.restapis.services.CourseServicesImpl;
import learn.springboot.restapis.services.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class ApplicationController {

    @Autowired
    private CoursesService coursesService = new CourseServicesImpl();


    @GetMapping("/hi")
    String welcome(){
        return "Hello";
    }

    @GetMapping("/error")
    String error(){
        return "it gets hang to the error. Try enjoying surfing.";
    }

    @CrossOrigin
    // get all the courses
    @GetMapping("courses")
    List<Course> getCourses(){
       return coursesService.getCourses();
    }

    // get a course by ID
    @GetMapping("courses/{courseId}")
    Course getCourseById(@PathVariable String courseId){

        return coursesService.getCourseById(courseId);
    }

    // adding a course
    @PostMapping("courses") // takes course by default in JSON Format
    Course addCourse( @RequestBody Course course){ // content resides in body in POST method

        return coursesService.addCourse(course);
    }

    // updating /editing a course using the id
    @PutMapping("courses")
    Course updateCourse(@RequestBody Course course){

        return coursesService.updateCourse(course);
    }

}
