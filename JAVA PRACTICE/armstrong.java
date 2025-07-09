import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int count = 0;
        int res = 0;
        int temp = num;

        while (temp != 0) {
            temp /= 10;
            count++;
        }

        temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            int pow=1;
            for (int i = 0; i < count; i++)
                pow *= digit;
            res += pow;
            temp /= 10;
        }
        if (res == num) {
            System.out.println("it is a armstrong number");
        }else{
            System.out.println("it is not a armstrong number");
        }
        sc.close();
    }
}