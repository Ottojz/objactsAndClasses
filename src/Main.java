public class Main {
    public static void main(String[] args) {

        Author rayBradbury = new Author("Ray", "Bradbury");
        Author lewisCarroll = new Author("Lewis", "Carroll");

        System.out.println(lewisCarroll);
        System.out.println(rayBradbury);
        System.out.println();

        Book fahrenheit451 = new Book("Fahrenheit 451", rayBradbury, (short) 1953);
        Book aliceInWonderland = new Book("Alice's Adventures in Wonderland", lewisCarroll, (short) 1865);

        System.out.println(aliceInWonderland);
        System.out.println(fahrenheit451);
        System.out.println();

        fahrenheit451.setYear((short) 1952);

        System.out.println(aliceInWonderland);
        System.out.println(fahrenheit451);
        System.out.println();

        System.out.println (rayBradbury.equals (rayBradbury));
        System.out.println (fahrenheit451.equals (fahrenheit451));

    }
}