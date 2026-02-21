package model;

public class Course {
    private static int count=0;
    private String title;
    private double hour;
    private Student[] students;


    public Course(String title,double hour,Student[] students){
        if(!isValidName(title)){
            throw new IllegalArgumentException("Invalid title");
        }
        if(!isValidHour(hour)){
            throw new IllegalArgumentException("Invalid Hour");
        }
                this.title=title;
                this.hour=hour;
                this.students=students;
                count++;
    }
    public Course(String title){
        this(title,0,null);
    }
    public Course(String title,double hour){
        this(title,hour,null);
    }

    public static int getCourseCount(){
        return count;
    }

    public void setStudents(Student[] students){
        if(students==null){
            throw new IllegalArgumentException("you are adding zero students");
        }
        this.students=students;
        System.out.printf("You added %d students",students.length);
    }
    public void printCourseInfo(){
        System.out.printf("Title: %s\n Hour: %.1f\n List Students: \n",this.title,this.hour);
        if(students==null){
            throw new IllegalArgumentException(" zero students");
        }
        for (Student s: students) {
         System.out.println(s.getName());
        }
    }
    public double averageRating(){
        if (students.length == 0) {
            System.out.println(" this course have 0 students");
            return 0;
        }
        double result =0;
        for (Student s: students) {
            result+=s.getAverage();
        }
        return result/this.students.length;
    }
    private boolean isValidName(String name) {
        return name != null
                && !name.isBlank()   // не пустая/не только пробелы
                && name.length() >= 2;
    }
    private boolean isValidHour(double hour){
        return hour>=0 && hour<150;
    }

}
