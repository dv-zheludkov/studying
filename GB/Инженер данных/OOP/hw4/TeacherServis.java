public class TeacherServis extends User implements Comparable<TeacherServis>{

    private Long studentId;

    public TeacherServis(String firstName, String lastName, String middleName){
        super(firstName, lastName, middleName);
    }

    public Long getStudentId(){
        return studentId;
    }

    public void studentId(Long studentId){
        this.studentId = studentId;
    }

    @Override
    public int compareTo(TeacherServis o){
        return this.studentId.compareTo(o.studentId);
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
}