package app;
import model.*;
import Service.StudentService;


public class App {
    public static void main(String[] args){

        System.out.println("Project is starting...");
        Student s1 = new Student("Анна");
        Student s2 = new Student("Борис", 20);
        Student s3 = new Student("Клара", 17, 9.1);
        StudentService admin = new StudentService();
        s1.setAverage(8.5);
        s2.setAverage(7.9);

        Student[] group = { s1, s2, s3 };

        Course c1 = new Course("Java для начинающих", 60, group);
        Course c2 = new Course("Алгоритмы", 40,group);

        c1.printCourseInfo();
        c2.printCourseInfo();

        System.out.printf("Средний рейтинг на курсе: %.2f%n",
                c1.averageRating());

        System.out.println("Создано курсов: " + Course.getCourseCount());
        admin.increaseRating(s1,1);
       System.out.println( s1.getAverage());
        admin.increaseRating(s2,1.8);

    }
}
