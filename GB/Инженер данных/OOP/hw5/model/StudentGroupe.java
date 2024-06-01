package model;

import java.util.List;

public class StudentGroupe {
    private Teacher teacher;


    public Teacher getTeacher() {
        return teacher;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public StudentGroupe(Teacher teacher, List<Student> students){
        this.teacher = teacher;
        this.students = students;
    }
}