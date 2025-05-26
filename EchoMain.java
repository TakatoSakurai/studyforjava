import java.util.Scanner;

/**
 * 鸚鵡返し
 */
public class EchoMain {
        public static void main(String[] args){
        String name = ask("名前");
        String message = ask("要件");

        System.out.println(name + "の要件は、" + message);
    }

    /**
     * @param prompt userhenopuronputo
     * @return moziretu
     */

    static String ask(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt + "を入力しろ");
        String userInput = scanner.nextLine();
        return userInput;
    }

}
