import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department= in.next();

        switch (empID) {
            case 1 -> System.out.println("Aman Behera");
            case 2 -> System.out.println("Chiku Pathak");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch ("department") {
                    case "IT" -> System.out.println("IT Department");
                    case "management" -> System.out.println("management department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct empID");
        }
                }
        }

