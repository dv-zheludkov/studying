/*
— Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;
— Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
— Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator;
— Модифицировать класс Контроллер, добавив в него созданный сервис;
— Модифицировать класс Контроллер, добавив в него метод, сортирующий список потоков, путём вызова созданного сервиса.
 */



package hw3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        StudentGroupe groure1 = new StudentGroupe("Группа 1");
        StudentGroupe groure2 = new StudentGroupe("Группа 2");
        StudentGroupe groure3 = new StudentGroupe("Группа 3");

        Course course1 = new Course();
        course1.addGroupe(groure1);
        course1.addGroupe(groure2);

        Course course2 = new Course();
        course2.addGroupe(groure3);

        CourseServis courseServis = new CourseServis();
        Controller controller = new Controller(courseServis);

        List<Course> courses = new ArrayList<>();
        courses.add(course1);
        courses.add(course2);
        controller.sortCourses(courses);

        int count = 1;
        for (Course course : courses){
            System.out.println("Поток " + count);
            count++;
            for (StudentGroupe groure : course){
                System.out.println(" - " + groure.getName());
            }
        }
    }
}