import java.util.*;
class GS{
public static void main(String args []){
Scanner sc=new Scanner(System.in);
double gs,basic,hra,da;
System.out.print("Enter basic salary :");
basic=sc.nextDouble();
hra=basic*0.1;
da=basic*0.6;
gs=basic+da+hra;
System.out.println("gross salary calculated :RS "+gs);
  }
 }

