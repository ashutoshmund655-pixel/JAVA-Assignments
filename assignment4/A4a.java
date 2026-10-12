import java.util.*;
class A4a{
public static void main(String args []){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a:");
double a=sc.nextDouble();
System.out.print("Enter b :");
double b=sc.nextDouble();
System.out.print("Enter c :");
double c=sc.nextDouble();
if(a==0){
  System.out.println("it is not a quadratic eqution");
}
else{
  double D=(b*b)-(4*a*c);
  if(D>0){
    double r1=(-b+Math.sqrt(D))/(2*a);
    double r2=(-b-Math.sqrt(D))/(2*a);
    System.out.println("The first root is :"+r1);
    System.out.println("The second root is :"+r2);
  }
  else if(D==0){
    double r=-b/(2*a);
  System.out.println("in equation have real and equal roots");
  System.out.println("1st root=2nd root="+ r );
  }
  else{
     double realP = -b / (2 * a);
      double imgpart = Math.sqrt(-D) / (2 * a);
      System.out.println("Roots are complex:");
      System.out.println("Root 1 = " + realP + " + " + imgpart + "i");
      System.out.println("Root 2 = " + realP + " - " + imgpart + "i");
       
  
}
}
}
}



