package grades;
import java.util.HashMap;
import util.Input;


public class GradesApplication {

    public static void main(String[] args) {
        // Hash Map
        HashMap<String, Student> students = new HashMap<>();

        // Student Variables
        Student sergio = new Student("Sergio");
        Student meilyn = new Student("Meilyn");
        Student andy = new Student("Andy");
        Student evelyn = new Student("Evelyn");

        // Add grades to each student
        // Sergio
        sergio.addGrade(87);
        sergio.addGrade(90);
        sergio.addGrade(75);
//        System.out.println("Luna's Grades: " + luna.getGradeAverage(luna.getGrades()));

        // Meilyn
        meilyn.addGrade(96);
        meilyn.addGrade(92);
        meilyn.addGrade(85);
//        System.out.println("Andrew's Grades: " + andrew.getGradeAverage(andrew.getGrades()));

        //Andy
        andy.addGrade(82);
        andy.addGrade(87);
        andy.addGrade(85);
//        System.out.println("Emily's Grades: " + emily.getGradeAverage(emily.getGrades()));

        //Evelyn
        evelyn.addGrade(72);
        evelyn.addGrade(84);
        evelyn.addGrade(90);
//        System.out.println("Liz's Grades: " + liz.getGradeAverage(liz.getGrades()));

        //Add Students to HashMap
        students.put("sergio96", sergio);
        students.put("meilyn95", meilyn);
        students.put("andydel96", andy);
        students.put("evelyn96", evelyn);

        //Display the usernames
        displayStudents(students);

        //Method to get more information on a student
        getStudentInfo(students);
    }

    //Display the usernames
    public static void displayStudents(HashMap<String, Student> username) {
        System.out.println("Welcome to your grade-book!");
        System.out.println("Here are the GitHub usernames of your students:");

        for(String key : username.keySet()) {
            System.out.printf("|%s| ", key);
        }
    }

    //Method to get more information on a student
    public static void getStudentInfo(HashMap<String, Student> students) {
        Input input = new Input();
        System.out.println();
        String userInput = input.getString("Which Student would you like to see more information on?");

        if (students.containsKey(userInput)) {
            String studentName = students.get(userInput).getName();
            double studentAverageGrade = students.get(userInput).getGradeAverage();
            System.out.println("Retrieving information...");
            System.out.printf("Name: %s - GitHub Username: %s\n", studentName, userInput);
            System.out.printf("Current Average Grade: %.2f\n", studentAverageGrade);
            boolean userConfirmation = input.yesNo("Would you like to search for another student?");
            if (userConfirmation) {
                getStudentInfo(students);
            }
        } else {
            System.out.println("Sorry, no student found with the username " + userInput);
            getStudentInfo(students);
        }

    }

}
