package learn.springboot.restapis.services;

import learn.springboot.restapis.entities.Course;

import java.util.List;

public interface CoursesService {
    /*
    * Generally the service is interface as it is just a blueprint
     */
    public List<Course> getCourses();
    Course getCourseById(String id);

    Course addCourse(Course course);

    Course updateCourse(Course course);
}
