/*
import java.util.Scanner;

class Loops{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter starting num:");
int a = sc.nextInt();
System.out.println("Enter Ending num:");
int b = sc.nextInt();
for(int i=a;i<=b;i++){
System.out.println(i);
}
}
}
*/
// program to print sum of n numbers
import java.util.Scanner;
class Loops{
public static void main(String[] args){
int sum = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter starting num:");
int a = sc.nextInt();
System.out.println("Enter Ending num:");
int b = sc.nextInt();
for(int i=a;i<=b;i++){
sum += i;
}
System.out.println("sum is : "+sum);
}
}
