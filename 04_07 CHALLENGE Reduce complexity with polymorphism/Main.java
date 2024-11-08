public class Main {

    public static void main(String[] args) {
        Contact contact1 = new Contact("Aloka",
                new PhoneNumber("0704188388"));

        Contact contact2 = new Contact("Anupama",
                new PhoneNumber(45, "7458213695"));

        Contact contact3 = new Contact("Koojana",
                new PhoneNumber("7415698245"));

        Contact contact4 = new Contact("Chanuri", "chanuri@email.com");

        Contact contact5 = new Contact("Gerald",
                new PhoneNumber("7423658945"), "gerald@email.com");

        System.out.println(contact1);
        System.out.println(contact2);
        System.out.println(contact3);
        System.out.println(contact4);
        System.out.println(contact5);







    }
}
