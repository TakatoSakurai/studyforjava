import java.util.Scanner;

public class scan {
    public static void main(String[] args) {
        System.out.println("ここに名前入れろかす");
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
        String message = "Hello " + userInput;
        System.out.println(message);
    }
}
