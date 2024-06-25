package view;

import model.Student;
import model.StudentGroupe;


public class ViewStudentGroupe {
    public void view(StudentGroupe studentGroupe){
        System.out.println("Преподаватель: " + studentGroupe.getTeacher().getTeacherId());
        System.out.println("Студенты: ");
        for (Student student : studentGroupe.getStudents()){
            System.out.println(student.getStudentId());
        }
    }
}