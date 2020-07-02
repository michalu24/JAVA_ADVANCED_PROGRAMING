package _5_Cwiczenie14;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student.Builder()
                .withName("Michał")
                .withSurname("Urbański")
                .withAge(21)
                .withAverageGrades(5.0)
                .withUniversity("PW")
                .withYearCollege(2)
                .withStatus(true)
                .build();
        Student student2 = new Student.Builder()
                .withName("Marcin")
                .withSurname("Nowak")
                .withAge(22)
                .withAverageGrades(3.5)
                .withUniversity("UW")
                .withYearCollege(1)
                .withStatus(false)
                .build();
        Student student3 = new Student.Builder()
                .withName("Michał")
                .withSurname("Kowalski")
                .withAge(20)
                .withAverageGrades(4.0)
                .withUniversity("PW")
                .withYearCollege(3)
                .withStatus(true)
                .build();
        Student student4 = new Student.Builder()
                .withName("Artur")
                .withSurname("Witkowski")
                .withAge(19)
                .withAverageGrades(3.0)
                .withUniversity("UKSW")
                .withYearCollege(2)
                .withStatus(false)
                .build();
        Student student5 = new Student.Builder()
                .withName("Anna")
                .withSurname("Kujawa")
                .withAge(21)
                .withAverageGrades(4.5)
                .withUniversity("PW")
                .withYearCollege(3)
                .withStatus(true)
                .build();
        Student student6 = new Student.Builder()
                .withName("Karolina")
                .withSurname("Zawadzka")
                .withAge(22)
                .withAverageGrades(5.0)
                .withUniversity("UW")
                .withYearCollege(1)
                .withStatus(false)
                .build();
        Student student7 = new Student.Builder()
                .withName("Jan")
                .withSurname("Żubr")
                .withAge(23)
                .withAverageGrades(3.5)
                .withUniversity("UW")
                .withYearCollege(2)
                .withStatus(true)
                .build();
        Student student8 = new Student.Builder()
                .withName("Karol")
                .withSurname("Bujak")
                .withAge(21)
                .withAverageGrades(3.0)
                .withUniversity("PW")
                .withYearCollege(1)
                .withStatus(true)
                .build();
        Student student9 = new Student.Builder()
                .withName("Zbigniew")
                .withSurname("Boniecki")
                .withAge(21)
                .withAverageGrades(4.5)
                .withUniversity("UW")
                .withYearCollege(2)
                .withStatus(false)
                .build();
        Student student10 = new Student.Builder()
                .withName("Jacek")
                .withSurname("Kowal")
                .withAge(24)
                .withAverageGrades(3.0)
                .withUniversity("UW")
                .withYearCollege(2)
                .withStatus(true)
                .build();

        List<Student> list = new LinkedList<>();

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);
        list.add(student7);
        list.add(student8);
        list.add(student9);
        list.add(student10);


        // a) powyżej 22 lat ( trochę zmienie) będę robił nowe listy

        System.out.println("a)");

        list.stream().filter(el -> el.getAge() >= 22)
                .collect(Collectors.toCollection(LinkedList::new))
                .forEach(System.out::println);

        System.out.println("________________________________________________________________________________");

        System.out.println("b)");
        //b) ilu na PW?

        list.stream().filter(el -> el.getUniversity().equalsIgnoreCase("PW"))
                .collect(Collectors.toCollection(LinkedList::new))
                .forEach(System.out::println);

        System.out.println("________________________________________________________________________________");

        System.out.println("c)");
        //c) Jaka jest średnia ze wszystkich ocen aktywnych studentów

        double result;

        List<Student> active = new LinkedList<>();

        list.forEach(el ->{
            if (el.isStatus()) {
                active.add(el);
            }
        });

        result = active.stream().mapToDouble(Student::getAverageGrades).sum();
        System.out.println("Srednia wszystkich aktywnych studentów wynosi:\n"+
                (result/active.size()));

        System.out.println("________________________________________________________________________________");

        System.out.println("d)");
        //d) Dane studenta o najlepszej średiej

        double best= list.stream().mapToDouble(Student::getAverageGrades).max().getAsDouble();

        list.stream().filter(el -> el.getAverageGrades() == best).forEach(System.out::println);


    }
}
