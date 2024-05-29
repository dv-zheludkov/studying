package hw3;

import java.util.List;

public class Controller {
    private CourseServis courseServis;

    public Controller(CourseServis courseServis){
        this.courseServis = courseServis;
    }
    public void sortCourses(List<Course> courses){
        courseServis.sortCourses(courses);
    }
}