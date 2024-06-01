public interface UserController<T extends User {

    void create(String firstName, String lastNAme, String middleName);
    
}