package hw3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Course implements Iterable<StudentGroupe> {

    
    private List<StudentGroupe> groups;

    public Course(){
        groups = new ArrayList<>();
    }

    public void addGroupe(StudentGroupe groupe){
        groups.add(groupe);

    }

    @Override
    public Iterator<StudentGroupe> iterator(){
        return groups.iterator();
    }
    public List<StudentGroupe> getGroups(){
        return groups;
    }
  
}