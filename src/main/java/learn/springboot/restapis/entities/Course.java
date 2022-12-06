package learn.springboot.restapis.entities;

public class Course {
    private String courseId;
    private String courseName;
    private String courseDetails;

    // constructor from all the entities
    public Course(String courseId, String courseName, String courseDetails) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDetails = courseDetails;
    }
// default constructor-> not mandatory as one constuctor is automatically made by default
    public Course() {
    }

    //getters and setters
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDetails() {
        return courseDetails;
    }

    public void setCourseDetails(String courseDetails) {
        this.courseDetails = courseDetails;
    }

    // to string method

    @Override
    public String toString() {
        return "Courses{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", courseDetails='" + courseDetails + '\'' +
                '}';
    }
}
