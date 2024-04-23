import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class Main_Notebook {
    private static Notebook filtrNotebook = new Notebook(null, 0, 0, "null", "null");

    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("MacPro", 8, 30000, "Macintosh", "white");
        Notebook notebook2 = new Notebook("HP Powilion 5", 16, 10000, "MS-DOS", "black");
        Notebook notebook3 = new Notebook("HP g600 g5", 32, 2000, "Windows 11", "white");
        Notebook notebook4 = new Notebook("Asus zephyrus g14", 16, 100000, "Windows 11", "black");
        Notebook notebook5 = new Notebook("DELL inspiron 3521", 8, 1000, "Windows 10", "silwer");

        Set<Notebook> notebooks = new HashSet<>(
                Arrays.asList(notebook1, notebook2, notebook3, notebook4, notebook5));

        filter(notebooks);
    }

    public static void filter(Set<Notebook> notebooks) {
        information();
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        boolean endOfFiltr = true;
        while (endOfFiltr == true) {
            switch (command) {
                case ("1"):
                    System.out.println(
                            "Введите минимальный объем Оперативной памяти");
                    int findRamInGB = Integer.valueOf(sc.nextLine());
                    filtrNotebook.setRamInGB(findRamInGB);
                    System.out.println(filtrNotebook);
                    System.out.println("Введите следующую команду");
                    command = sc.nextLine();
                    break;
                case ("2"):
                    System.out.println(
                            "Введите минимальный объем HDD");
                    int findValueHDD = Integer.valueOf(sc.nextLine());
                    filtrNotebook.setValueHDD(findValueHDD);
                    System.out.println(filtrNotebook);
                    System.out.println("Введите следующую команду");
                    command = sc.nextLine();
                    break;
                case ("3"):
                    System.out.println("введите название операционной системы");
                    String findOperatingSystem = sc.nextLine();
                    filtrNotebook.setOperatingSystem(findOperatingSystem);
                    System.out.println(filtrNotebook);
                    System.out.println("Введите следующую команду");
                    command = sc.nextLine();
                    break;
                case ("4"):
                    System.out.println("Введите цвет");
                    String findColor = sc.nextLine();
                    filtrNotebook.setColor(findColor);
                    System.out.println(filtrNotebook);
                    System.out.println("Введите следующую команду");
                    command = sc.nextLine();
                    break;
                case ("5"):
                    printAllNotebook(notebooks);
                    System.out.println("Введите следующую команду");
                    command = sc.nextLine();
                    break;
                case ("7"):
                    filtrNotebook.setRamInGB(0);
                    filtrNotebook.setValueHDD(0);
                    filtrNotebook.setOperatingSystem("null");
                    filtrNotebook.setColor("null");
                    System.out.println(filtrNotebook);
                    System.out.println("Введите следующую команду");
                    command = sc.nextLine();
                case ("9"):
                    information();
                    command = sc.nextLine();
                    break;
                case ("0"):
                    endOfFiltr = false;
                    break;
                default:
                    System.out.println("Вы некорректно ввели команду, чтобы посмотреть инструкцию введите 9");
                    command = sc.nextLine();
                    break;
            }

        }
        sc.close();
        System.out.println(filtrNotebook);
        findNotebooksWithFiltr(notebooks);
    }

    public static void findNotebooksWithFiltr(Set<Notebook> notebooks) {

        Set<Notebook> result = new HashSet<>();
        for (Notebook note : notebooks) {
            if (filtrNotebook.getRamInGB() <= note.getRamInGB() || filtrNotebook.getRamInGB() == 0) {
                if (filtrNotebook.getValueHDD() <= note.getValueHDD() || filtrNotebook.getValueHDD() == 0) {
                    if (filtrNotebook.getOperatingSystem().equals(note.getOperatingSystem())
                            || filtrNotebook.getOperatingSystem().equals("null")) {
                        if (filtrNotebook.getColor().equals(note.getColor())
                                || filtrNotebook.getColor().equals("null")) {
                            result.add(note);
                        }
                    }
                }
            }
        }
        if (result.isEmpty()) {
            System.out.println("К сожалению, ничего не найдено");
        } else {
            System.out.println("Вам подойдут следующие продукты:");
            printAllNotebook(result);
        }

        System.out.println("Конец поиска!");
    }

    public static void printAllNotebook(Set<Notebook> notebooks) {
        System.out.println("В нашем магазине имеются в наличии следующие ноутбуки:");
        System.out.println();

        for (Notebook note : notebooks) {
            System.out.println(note);
        }
        System.out.println();
    }

    public static void information() {
        System.out.println(
                "Есди вы хотите подобрать определнный ноутбук, то введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем HDD");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет ");
        System.out.println("5 - Просмотр всего ассортимента");
        System.out.println("7 - Очистить фильтр");
        System.out.println("9 - Инструкция по работе с сайтом");
        System.out.println("0 - Результат подбора");
    }
}
