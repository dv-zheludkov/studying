package model;

public class Teacher extends User{

    public Teacher(String firstName, String lastName, String middleName, String id){
        super(firstName, lastName, middleName);
        this.teacherId = Integer.parseInt(id);
    }
    
    private int teacherId;

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
    
}