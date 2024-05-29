package hw3;

import java.util.List;

public class CourseServis {
    public void sortCourses(List<Course> courses){
        courses.sort(new StreamComparator());
    }
}