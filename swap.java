public class swap {
    public static void main(String[] args) {

        // swaping with third variable
        int x = 2;
        int y = 3;
        System.out.println(x);
        System.out.println(y);

        int z = x;
        x = y;
        y = z;
        System.out.println(x);
        System.out.println(y);

        // swaping without third variable
        int a = 5;
        int b = 10;
        System.out.println(a);
        System.out.println(b);

        a = b + a;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);

    }
}
