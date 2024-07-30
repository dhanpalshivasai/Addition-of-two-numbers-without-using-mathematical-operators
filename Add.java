import java.util.Scanner;
public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a=sc.nextInt();
        System.out.print("Enter the second number : ");
        int b=sc.nextInt();
        while (b != 0) {
            int sumWithoutCarry = a ^ b;
            int carry = a & b;
            b = carry << 1;
            a = sumWithoutCarry;
    }
    System.out.println("Sum is "+a);
}
}
