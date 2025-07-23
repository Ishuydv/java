import java.util.*;
// using if else
/*
class simpleCalculator{
public static void main(String[] h){
int a = 0;
int b = 0;
char op;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a oprator");
op = sc.next().charAt(0);
System.out.println("Enter first number");
a = sc.nextInt();
System.out.println("Enter Sceond number");
b = sc.nextInt();
if(op == '+'){
System.out.println("addition is : "+(a+b));
}else if(op == '-'){
System.out.println("subtarction is : "+(a-b));
}else if(op == '*'){
System.out.println("multipication is : "+(a*b));
}else if(op == '/'){
System.out.println("division is : "+(a/b));
}else{
System.out.println("invalid opreator");
}
}
}
*/

// using switch statement
class simpleCalculator{
public static void main(String[] args){
int a,b;
Scanner sc = new Scanner(System.in);
System.out.println("Enter an arithmetic oprator");
char ch = sc.next().charAt(0);
System.out.println("Enter first number:");
a = sc.nextInt();
System.out.println("Enter second number:");
b = sc.nextInt();
switch (ch){
case '+':
System.out.println(a+" "+ch+" "+b+" = "+(a+b));
break;
case '-':
System.out.println(a+" "+ch+" "+b+" = "+(a-b));
break;
case '*':
System.out.println(a+" "+ch+" "+b+" = "+(a*b));
break;
case '/':
System.out.println(a+" "+ch+" "+b+" = "+(a/b));
break;
case '%':
System.out.println(a+" "+ch+" "+b+" = "+(a%b));
break;
default:
System.out.println("Invalid opreator");
}
}
}
