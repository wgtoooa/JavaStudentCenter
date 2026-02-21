package Service;
import model.Student;

public class StudentService {

    public void increaseRating(Student student,double delta){
        if (student == null) {
            throw new IllegalArgumentException("Student is null");
        }
        double newAverage = student.getAverage()+delta;
        if (newAverage>10 || newAverage<0){
            throw new IllegalArgumentException("Invalid rating");
        }
        student.setAverage(newAverage);
    }

    public void swapStudents(Student[] students,int i,int j){
        if (students == null) {
            throw new IllegalArgumentException("Students array is null");
        }
        if(i==j){
            return;
        }
        if(i<0 || j<0 || i>=students.length || j>=students.length ){
            throw new IllegalArgumentException("Invalid index students");
        }
        var temp = students[i];
        students[i]=students[j];
        students[j]=temp;
    }
}
