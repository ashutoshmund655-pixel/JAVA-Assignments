import java.util.*;
class A5b{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 double e=1.0;
 double fact=1;
 for(int i=1;i<=5;i++){
     fact=fact*i;
      e=e+(1.0/fact);
    }
System.out.println("Value of e up to 5 decimal place ="+e);
  }
}
 