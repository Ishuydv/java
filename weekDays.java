import java.util.*;

class weekDays{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter day number : ");
int day = sc.nextInt();
if(day==1){
System.out.print("Monday is first day");
}else if(day==2){
System.out.print("Tuesday is second day");
}else if(day==3){
System.out.print("Wednesday is Third day");
}else if(day==4){
System.out.print("Thursday is fourth day");
}else if(day==5){
System.out.print("Friday is fifth day");
}else if(day==6){
System.out.print("Saturday is sixth day");
}else if(day==7){
System.out.print("Tuesday is second");
}else{
System.out.print("Invalid number");
}
}
}