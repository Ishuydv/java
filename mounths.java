import java.util.*;

class mounths{
public static void main(String[] args){
int days;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of days : ");
num = sc.nextInt();
if(days==31){
System.out.println("Mounths which have 31 days Are");
System.out.println(" January \n March \n May \n July \n August \n October \n December");
}else if(days==30){
System.out.println("Mounths which have 30 days Are");
System.out.println(" April \n June \n September \n November");
}else if(days==28 || days==29){
System.out.println("Mounth which have 28 days is : \n February");
}else{
System.out.println("Invalid Number");
}
} 
}