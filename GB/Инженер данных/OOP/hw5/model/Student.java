package model;

public class Student extends User{

    private int studentId;

    public Student(String firstName, String lastName, String middleName, String id){
        super(firstName, lastName, middleName);
        this.studentId = Integer.parseInt(id);
    }

   

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    
    @Override
    public String toString(){
        return "Student{" +
                "studentId =" + studentId +
                '}';
    }
}