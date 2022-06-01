import java.util.Scanner;

public class one {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x1");
        int x1 = sc.nextInt();
        System.out.println("Введите x2");
        int x2 = sc.nextInt();
        System.out.println("Введите y1");
        int y1 = sc.nextInt();
        System.out.println("Введите y2");
        int y2 = sc.nextInt();

        System.out.println(getDistance(x1, x2, y1, y2));
    }
}
