import java.util.Scanner;

public class SwitchClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit) {
            case "mango" -> System.out.println("King of all fruit");
            case "apple" -> System.out.println("Sweet red fruit");
            case "orange" -> System.out.println("Round sour fruit");
            case "grape" -> System.out.println("small green fruit");
            default -> System.out.println("please enter a valid fruite");
        }
    }


}
