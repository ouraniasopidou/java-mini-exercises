package gr.aueb.cf.ch12;

/**
 * Like a client
 * 1. Creates an {@link Student } Instance (alice)
 * 2. Invokes public methods (setters/ getters)
 */


public class StudentMain {
    public static void main(String[] args) {
        Student alice = new Student();

        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("W.");

        System.out.println("Id: "+ alice.getId());
        System.out.println("Firstname: "+ alice.getFirstname());
        System.out.println("Lastname: "+ alice.getLastname());



//        //set
//        alice.firstname = "Alice";
//        alice.lastname = "Wonderland";

//        //get
//        System.out.println("Id: "+ alice.id);
//        System.out.println("Firstname: "+ alice.firstname);
//        System.out.println("Lastname: "+ alice.lastname);
    }
}
