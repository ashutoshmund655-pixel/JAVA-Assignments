import java.util.*;
class AC5{
public static void main(String args []){
Scanner sc=new Scanner(System.in);
double buy;
double sell;
double diff;
double lp;
double pp;
System.out.print("Enter buy price  :");
  buy=sc.nextDouble();
System.out.print("Enter sell price  :");
  sell=sc.nextDouble();
if(buy==sell){
 System.out.print("no profit/loss");
}
else if(buy>sell){
   diff=buy-sell;
   lp=diff*100/buy;
 System.out.print("loss percentage is :"+ lp +"%");
}
else if(buy <sell){
    diff=sell-buy;
   pp=diff*100/buy;
 System.out.print("profit percentage is :"+pp+"%");
    }
    else System.out.print("zero profit percentage");
  }
}
