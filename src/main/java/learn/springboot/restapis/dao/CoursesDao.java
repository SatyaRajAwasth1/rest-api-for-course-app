package learn.springboot.restapis.dao;

import learn.springboot.restapis.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesDao extends JpaRepository <Course, String> {

}
