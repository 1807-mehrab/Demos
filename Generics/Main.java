public class Main {
    public static void main(String[] args) {
        Person peter = new Person();
        peter.setName("Peter");

        Person oPerson = (Person) oMethod(peter);
        System.out.println(oPerson.getName());

        Person anotherPerson = betterMethod(peter);
        System.out.println(anotherPerson.getName());
    }

    public static Person aMethod(Person p) {
        return p;
    }

    //Generics without generics
    public static Object oMethod(Object o) {
        return o;
    }

    //Generic input
    public static <T> T betterMethod(T thing) {
        return thing;
    }
}