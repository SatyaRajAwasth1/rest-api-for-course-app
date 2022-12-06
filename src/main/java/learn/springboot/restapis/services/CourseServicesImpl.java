package learn.springboot.restapis.services;
import learn.springboot.restapis.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServicesImpl implements CoursesService{

    List<Course> list;

    public CourseServicesImpl() {
        list = new ArrayList<Course>();
        list.add(new Course("110","Eng. Physics","physcis for engineering student of 1st year."));
        list.add(new Course("210","WT","web technology for SE"));
    }

    @Override
    public List<Course> getCourses() {
        return list; // will return courses list
    }
    @Override
    public Course getCourseById(String id){
        for(Course course : list ){
            if (course.getCourseId().equals(id)){
                return course;
            }
        }
        return  null;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);

        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        list.forEach ( inCourse -> {
            if (inCourse.getCourseId().equals(course.getCourseId())){
                inCourse.setCourseName(course.getCourseName());
                inCourse.setCourseDetails(course.getCourseDetails());
            }
                }
        );
        return course;
    }
}
