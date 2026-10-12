import java.util.*;
class AC3{
public static void main(String args []){
Scanner sc=new Scanner(System.in);
double elect,cost=0;
System.out.print("Enter ectricity consumption :");
elect=sc.nextDouble();
if(elect<100){
   cost=3*elect;
   }
else if (elect<=500){
    cost=(100 *3)+(elect-100)*4;
   }
else{
    cost=(100*3)+(400*4)+(elect-500)*6;
}
System.out.println("Total electricity cost :RS "+cost);
}
}

