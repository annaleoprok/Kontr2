import java.util.Scanner;

public class O3O {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, num;
        do {
            num = scanner.nextInt();
            sum += num;
        } while (num != 0);
        System.out.println(sum+"0");
    }
}