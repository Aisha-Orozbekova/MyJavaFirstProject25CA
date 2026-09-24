import java.util.Scanner;

public class TaskD {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int leftOverApples = k % n;
        System.out.println(leftOverApples);


    }
}
