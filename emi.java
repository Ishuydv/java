import java.util.*;

class emi {
    public static void main(String[] args) {
        int pa, si, ir, t, emi, ta;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle amount : ");
        pa = sc.nextInt();
        System.out.println("Enter Intrest rate amount : ");
        ir = sc.nextInt();
        System.out.println("Enter time : ");
        t = sc.nextInt();
        si = pa * ir * t / 100;
        ta = pa + si;
        emi = ta / (t * 12);
        System.out.println("simple intrest : " + si);
        System.out.println("Total amount is : " + ta);
        System.out.println("emi is : " + emi);
    }
}
