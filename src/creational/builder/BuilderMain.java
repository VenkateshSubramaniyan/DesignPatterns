package creational.builder;

public class BuilderMain {

    public static void main(String[] args) {

/*       // this code should NOT compile
        Person wrong = new Person.Builder("Luisa")
                .setAdult(20) // This return adult builder instead of builder
                .setSchool("York school")
                    // Adult builder doesnt have method for school
                .build();
*/

        // this code has to compile

        Person mother = new Person.Builder("Mary")
                .setBirthplace("York")
                .setAdult(37)
                .setWorkplace("Google")
                .build();

        Person son = new Person.Builder("Peter")
                .setUnderAge(4)
                .setSchool("York school")
                .build();

    }
}