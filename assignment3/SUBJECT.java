import java.util.*;
class SUBJECT{
public static void main(String args []){
Scanner sc=new Scanner(System.in);
double s1,s2,s3,s4,s5,Total,per;
System.out.print("Enter first subject Marks :");
s1=sc.nextDouble();
System.out.print("Enter second subject Marks :");
s2=sc.nextDouble();
System.out.print("Enter third subject Marks :");
s3=sc.nextDouble();
System.out.print("Enter fourth subject Marks :");
s4=sc.nextDouble();
System.out.print("Enter fifth subject Marks :");
s5=sc.nextDouble();
Total=s1+s2+s3+s4+s5;
per=Total/5;
System.out.println("Total marks :"+Total);
System.out.println("percentage :"+per);
}
}