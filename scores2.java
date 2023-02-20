 import java.util.*;

public class scores2 {
    public static void main(String[] args) {
        boolean state = true;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter input: ");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Enter mark: ");
                    int mark = sc.nextInt();
                    if (mark >= 90) {
                        System.out.println("This is Good");

                    } else if (mark <= 89 && mark >= 60) {
                        System.out.println("This is also Good");

                    } else {
                        System.out.println("This is Good as Well");

                    }
                    break;
                case 0:
                    // state = false;
                    break;
                case 2:
                    state = false;
                    break;
                default:
                    System.out.print("Invalid Choice");
            }

        } while (state);
        // sc.close();
    }
}
    
