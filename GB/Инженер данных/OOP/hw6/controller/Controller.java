package controller;

import java.util.List;

import model.Student;
import model.StudentGroupe;
import model.Teacher;
import service.StudentGroupeService;

public class Controller {
    public StudentGroupe createStudentGroupe(Teacher teacher, List<Student> students){
        StudentGroupeService studentGroupeService = new StudentGroupeService();
        StudentGroupe studentGroupe = studentGroupeService.getStudentGroupe(teacher, students);
        return studentGroupe;
        
    }
}