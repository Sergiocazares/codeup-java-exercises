public class Person {

    private String name;

    public Person(String personName) {
        this.name = personName;
    }

    public String getName(){
        return name;
    }

    public void setName(String personName){
        name = personName;
    }

    public void sayHello(){
        System.out.printf("Hello, %s!", this.name);
    }

    public static void main(String[] args) {
//        person1.setName("Bob");
//        System.out.println(person1.getName());
//        person1.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }

}
