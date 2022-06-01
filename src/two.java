import java.util.Scanner;
public class two {
    public static int recSumm(int a, int b)
    {
        System.out.print( "a+ ");
        if (b < 0) return recSumm(a - 1, b + 1);
        System.out.print( "+b ");
        if (b > 0) return recSumm(a + 1, b - 1);
        return a;
    }
    public static void main(String[] args)
    {
        int a;
        int b;
        Scanner con = new Scanner(System.in);
        System.out.println ("Напишите первое число: ");
        a = con.nextInt();
        System.out.println ("Напишите второе число: ");
        b = con.nextInt();
        System.out.println (a + " recSum by " + b + " is " + recSumm(a,b));
    }
}