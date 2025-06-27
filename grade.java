import java.util.*;
// using if else
/*
class grade{
public static void main(String[] h){
double marks;
Scanner sc = new Scanner(System.in);
System.out.println("Enter your marks");
marks = sc.nextDouble();
if(marks>=90 && marks<=100){
System.out.println("A+");
}else if(marks>=80 && marks<90){
System.out.println("D+");
}else if(marks>=70 && marks<80){
System.out.println("C+");
}else if(marks>=60 && marks<70){
System.out.println("D+");
}else{
marks += 10;
if(marks>=60 && marks<70){
System.out.println("pass (D+)");
}else{
System.out.println("Fail");
}}}}
*/
class grade{
public static void main(String[] h){
int marks;
Scanner sc = new Scanner(System.in);
System.out.println("Enter your marks");
marks = sc.nextInt();
if(marks>=0 && marks<=100){
int grade = marks/10;
String res = switch (grade){
case 10 -> "A++";
case 9 -> "A+";
case 8 -> "B+";
case 7 -> "C+";
case 5 -> "D+";
default -> "Fail";
};
System.out.println(res);
}else{
System.out.println("Invalid marks, please enter valid marks.");
}
}
}