package learn.springboot.restapis.services;
import learn.springboot.restapis.dao.CoursesDao;
import learn.springboot.restapis.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServicesImpl implements CoursesService{

   // List<Course> list;
    @Autowired
    CoursesDao coursesDao;

    public CourseServicesImpl() {
        /*
        list = new ArrayList<Course>();
        list.add(new Course("110","Eng. Physics","physcis for engineering student of 1st year."));
        list.add(new Course("210","WT","web technology for SE"));
         */
    }

    @Override
    public List<Course> getCourses() {
       // return list; // will return courses list
        return coursesDao.findAll(); // returns
    }
    @Override
    public Course getCourseById(String id){
     /*
     for(Course course : list ){
            if (course.getCourseId().equals(id)){
                return course;
            }
        }
        return  null;
        */
        return coursesDao.getReferenceById(id);
    }

    @Override
    public Course addCourse(Course course) {
       // list.add(course);
       // return course;
        coursesDao.save(course); // saves / adds a course
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
      /*
        list.forEach ( inCourse -> {
            if (inCourse.getCourseId().equals(course.getCourseId())){
                inCourse.setCourseName(course.getCourseName());
                inCourse.setCourseDetails(course.getCourseDetails());
            }
                }
        );
        return course;
        */
        coursesDao.save(course); // update the course if it already exists as it will be taking PUT request assigned
        return course;
    }

    @Override
    public void deleteCourse(String courseId) {
        /*
        for (Course course: list) {
            if (course.getCourseId().equals(courseId)){
                list.remove(course);
            }
        }
        */
        coursesDao.deleteById(courseId);
    }
}
