import java.util.Scanner;

public class july7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double height;
        Double redius;
        Double pi = 3.14159;
        System.out.println("Enter 1 to calculate volume of cone");
        System.out.println("Enter 2 to calculate volume of cylinder");
        System.out.println("Enter 3 to calculate Area of triangle");
        System.out.println("Enter 4 to convert celsius to fahrenheit");
        System.out.println("Enter 5 to convert fahrenheit to celsius");
        System.out.println("Enter 6 to convert miles to kilometer");
        System.out.println("Enter 7 to calculate Intrest Rate");
        System.out.println("Enter 8 to calculate surface area of cylinder");
        System.out.println("Enter 9 to calculate area of cube");

        int option = sc.nextInt();
        switch (option) {
            case 1:
                // volume of cone => 1/3*pi*r*r*h;
                System.out.println("Enter redius of cone :");
                redius = sc.nextDouble();
                System.out.println("Enter height of cone :");
                height = sc.nextDouble();
                Double coneVolume = 1.0 / 3 * (pi * redius * redius * height);
                System.out.println("Volume of cone is : " + coneVolume);
                break;

            case 2:
                // volume of cylinder => pi*r*r*h;
                System.out.println("Enter redius of cylinder :");
                redius = sc.nextDouble();
                System.out.println("Enter height of cylinder :");
                height = sc.nextDouble();
                Double cylinderVolume = pi * redius * redius * height;
                System.out.println("Volume of cylinder is : " + cylinderVolume);
                break;

            case 3:
                // area of triangle => 1/2*b*h;
                System.out.println("Enter breath of triangle :");
                Double breath = sc.nextDouble();
                System.out.println("Enter height of triangle :");
                height = sc.nextDouble();
                Double triangleArea = 1.0 / 2 * (breath * height);
                System.out.println("Area of triangle is : " + triangleArea);
                break;

            case 4:
                // convert celsius to fahrenheit => C × 9/5 + 32
                System.out.println("Enter celsius :");
                Double celsious = sc.nextDouble();
                Double fahrenheit = celsious * 9 / 5 + 32;
                System.out.println("fahrenheit = " + fahrenheit);
                break;

            case 5:
                // convert fahrenheit to celsius => F − 32 × 5/9;
                System.out.println("Enter fahrenheit :");
                fahrenheit = sc.nextDouble();
                celsious = fahrenheit - 32 * 5 / 9;
                System.out.println("celsious = " + celsious);
                break;

            case 6:
                // convert miles to kilometer => 1.609*miles;
                System.out.println("Enter miles :");
                Double miles = sc.nextDouble();
                Double kilometer = 1.609 * miles;
                System.out.println("kilometers = " + kilometer);
                break;

            case 7:
                // simple interest => p*r*t/100;
                System.out.println("Enter principal amount :");
                Double principal = sc.nextDouble();
                System.out.println("Enter Intrest Rate :");
                Double intrestRate = sc.nextDouble();
                System.out.println("Enter Time Period :");
                Double time = sc.nextDouble();
                Double simpleInterest = principal * intrestRate * time / 100;
                System.out.println("Simple Interest = " + simpleInterest);
                break;

            case 8:
                // surface area of sphere => 4*pi*r*r;
                System.out.println("Enter redius");
                redius = sc.nextDouble();
                Double area = 4 * pi * redius * redius;
                System.out.println("Area is " + area);
                break;

            case 9:
                // surface area of cylinder => 2*pi*r*r+2*pi*r*h;
                System.out.println("Enter redius");
                redius = sc.nextDouble();
                System.out.println("Enter height");
                height = sc.nextDouble();
                area = (2 * pi * redius * redius) + 2 * (pi * redius * height);
                System.out.println("Surface area of cylinder : " + area);
                break;

            default:
                System.out.println("Invalid output");
                break;
        }
        sc.close();
    }
}