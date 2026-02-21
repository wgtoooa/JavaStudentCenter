package model;

public class Student{
    private int Age;
    private double Average;
    private String Name;

    public Student(String name){
       this(name,18,0);
    }

    public Student(String name, int age){
       this(name,age,0);
    }

    public Student(String name, int age,double average){
        if(!isValidName(name)){
            throw new IllegalArgumentException("Invalid name");
        }
        if(!validAge(age)){
            throw new IllegalArgumentException("Invalid Age");
        }
        if(!validAverage(average)){
            throw new IllegalArgumentException("Invalid Average");
        }
        this.Name=name;
        this.Age=age;
        this.Average=  average;
    }

    public boolean isAdult(){
        return this.Age>=18;
    }

    public void printInfo(){
        System.out.printf("Your name: %s\n Your Age: %d\n Your rating: %.2f\n",this.Name,this.Age,this.Average);
    }

    private boolean isValidName(String name) {
        return name != null
                && !name.isBlank()   // не пустая/не только пробелы
                && name.length() >= 2;
    }
    private boolean validAge(int age){
        return  age>16 && age<100;
    }
    private boolean validAverage(double rating){
        return rating>=0 && rating<=10;
    }

    public int getAge(){
        return this.Age;
    }
    public String getName(){
        return this.Name;
    }
    public double getAverage(){
        return this.Average;
    }
    public void setAverage(double rating){
        this.Average=rating;
    }


}
