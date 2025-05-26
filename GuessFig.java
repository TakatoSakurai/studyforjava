import java.util.Random;
import java.util.Scanner;

public class GuessFig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int answer = random.nextInt(10) + 1;  // 1～10の乱数
        int guess = 0;

        System.out.println("数当てゲームへようこそ！");
        System.out.println("1から10の数字を当ててみてね。");

        while (guess != answer) {
            System.out.print("あなたの予想は？ ");
            guess = scanner.nextInt();

            if (guess < answer) {
                System.out.println("もっと大きいよ！");
            } else if (guess > answer) {
                System.out.println("もっと小さいよ！");
            } else {
                System.out.println("正解！おめでとう！");
            }
        }

        scanner.close();
    }
}
