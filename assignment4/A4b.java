import java.util.*;
class A4b{
public static void main(String args []){
Scanner sc=new Scanner(System.in);
System.out.print("input the first floating point number:");
double n1=sc.nextDouble();
System.out.print("input the second floating point number:");
double n2=sc.nextDouble();
if(Math.round(n1*1000)==Math.round(n2*1000)){
  System.out.println("they are the same up to 3 decimal places");
}
else{
   System.out.println("they are diffrent");
}
}
}




