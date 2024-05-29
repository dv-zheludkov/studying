package hw3;

import java.util.Comparator;

public class StreamComparator implements Comparator<Course>{
    public int compare(Course course1, Course course2){
        int resultGroupe1 = course1.getGroups().size();
        int resultGroupe2 = course2.getGroups().size();

        return Integer.compare(resultGroupe1, resultGroupe2);

    }
}