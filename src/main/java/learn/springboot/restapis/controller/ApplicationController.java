package learn.springboot.restapis.controller;

import learn.springboot.restapis.entities.Course;
import learn.springboot.restapis.services.CourseServicesImpl;
import learn.springboot.restapis.services.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
    @GetMapping("courses")
    List<Course> getCourses(){
       return coursesService.getCourses();
    }

    @GetMapping("courses/{courseId}")
    Course getCourseById(@PathVariable String courseId){

        return coursesService.getCourseById(courseId);
    }


}
