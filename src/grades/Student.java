package grades;

import java.util.ArrayList;

public class Student {
    // Properties
    private final String name;
    private static ArrayList<Integer> grades;

    //Testing to make sure methods work! (They work.)
    public static void main(String[] args) {
        Student luna = new Student("Luna");
        System.out.println(luna.getName());
        addGrade(87);
        addGrade(90);
        addGrade(75);
        System.out.println(luna.getGradeAverage());
    }
    // Constructor to create a student
    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    public ArrayList<Integer> getGrades(){
        return this.grades;
    }
    // adds the given grade to the grades property
    public static void addGrade(int grade) {
        grades.add(grade);
    }
    // returns the average of the students grades, correctly calculates the average/mean.
    public double getGradeAverage() {
        Integer sum = 0;
        if(!grades.isEmpty()) {
            for(Integer grade : grades) {
                sum += grade;
            }
            return sum.doubleValue() / grades.size();
        }
        return sum;
    }

}
