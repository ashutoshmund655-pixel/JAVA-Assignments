import java.lang.*;
class MINUTES{
public static void main(String args[]){
int minutes=525600;
int days=minutes/(60*24);
int years=days/365;
int remdays=days%365;
System.out.println("year is :"+years);
System.out.println("days is :"+remdays);
   }
 }