package service;

import model.StudentGroupe;
import model.Teacher;
import model.Type;
import model.User;
import model.Student;
import java.util.List;

public class StudentGroupeService {
    public StudentGroupe getStudentGroupe(Teacher teacher, List<Student> students){
        StudentGroupe studentGroupe = new StudentGroupe(teacher, students);
        return studentGroupe;
    }
}