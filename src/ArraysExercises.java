import java.util.Arrays;
public class ArraysExercises {
    public static void main(String[] args) {
// 1.) Array Basics
        int[] numbers = {1, 2, 3, 4, 5};
        //System.out.println(numbers);
        //This prints out the reference ID of the numbers array.

        System.out.println("numbers: " + Arrays.toString(numbers));
        //You use Arrays.toString to convert the array into a string in order to see the elements within the array.

        Person[] persons = new Person[3];
        persons[0] = new Person("Sergio");
        persons[1] = new Person("Alex");
        persons[2] = new Person("Jordy");

        for(Person individual : persons) {
            System.out.println(individual.getName());
        }

        //Testing the addPerson method.
        Person [] addedPersonArr = addPerson(persons, new Person("Chris"));
        System.out.println();
        for(Person individual : addedPersonArr) {
            System.out.println(individual.getName());
        }
    }

    //    Changed the return type from void to Person[] in order to return the new array.
    public static Person[] addPerson(Person[] arr, Person individualToAdd){
        //Makes a copy of a Person array and makes it one more person longer.
        arr = Arrays.copyOf(arr, arr.length + 1);
        //Puts the individual you need to add to the last index in the copied array.
        arr[arr.length - 1] = individualToAdd;
        //Loops through the array and prints out each individual from the copied Array, including the new individual.
//        for(Person individual : newPersonArray) {
//            System.out.println(individual.getName());
//        }
        return arr;
    }
}