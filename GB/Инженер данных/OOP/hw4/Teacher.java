public class Teacher extends User implements Comparable<Teacher>{
    private Long studentId;

    public Teacher(String firstName, String lastName, String middleName){
        super(firstName, lastName, middleName);
    }

    public Long getStudentId(){
        return studentId;
    }

    public void studentId(Long studentId){
        this.studentId = studentId;
    }

    @Override
    public int compareTo(Teacher o){
        return this.studentId.compareTo(o.studentId);
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
}