import java.util.List;

public class TeacherController implements UserController<Teacher>{
     private final StudentGroupeServis studentGroupeServis = new StudentGroupeServis();

    
    public void removeStudentByFIO(String firstName, String lastName, String middleName){
        studentGroupeServis.removeStudentByFIO(firstName, lastName, middleName);
    }

    private final StudentView studentView = new StudentView();

    
    public List<Teacher> getSortedStudentList(){
        List<Teacher> studentList = studentGroupeServis.getSortedStudentList();
        studentView.sendOnConsole(studentList);
        return studentList;

    }

    public List<Teacher> getSortedStudentByFIO(){
        List<Teacher> studentList = studentGroupeServis.getSortedStudentList();
        studentView.sendOnConsole(studentList);
        return studentList;
    }
    @Override
    public void create(String firstName, String lastName, String middleName){
        studentGroupeServis.createStudent(firstName,lastName,middleName);
    }
}