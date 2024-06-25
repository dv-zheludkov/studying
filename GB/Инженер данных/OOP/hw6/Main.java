import model.Student;
import model.StudentGroupe;
import model.Teacher;
import view.ViewStudentGroupe;

import java.util.ArrayList;
import java.util.List;

import controller.Controller;

public class Main {
    public static void main(String[] args){
        Teacher teacher = new Teacher("Иванов", "Иван" , "Иванович", "1");
        List<Student> students = new ArrayList<>();

        students.add(new Student("Петров", "Петр", "Петрович", "2"));
        students.add(new Student("Сидоров", "Сидор", "Сидорович", "3"));

        Controller controller = new Controller();

        StudentGroupe studentGroupe = controller.createStudentGroupe(teacher, students);

        
        ViewStudentGroupe viewStudentGroupe = new ViewStudentGroupe();
        viewStudentGroupe.view(studentGroupe);
    }
}