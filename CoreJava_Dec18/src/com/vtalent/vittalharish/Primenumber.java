package com.vtalent.vittalharish;

import java.util.Scanner;


class Primenumber 
{
public static void main(String args[])
{
char st;
Scanner sin,stc;
String c;
do
{
System.out.println("Press 1 for generate prime number");
System.out.println("Press 2 for check prime number ");
sin=new Scanner(System.in);
int s=sin.nextInt();
switch(s)
{
  case 1:System.out.println("Enter the limit number");
         int limit = new Scanner(System.in).nextInt();
         System.out.println("Printing prime number from 1 to " + limit);
         for(int number = 2; number<=limit; number++){
            //print prime numbers only
         if(Primegen(number)){
         System.out.println(number);}}
         break;
 
  case 2: int n, i, res;
         boolean flag=true;
         Scanner scan= new Scanner(System.in);
         System.out.println("Please Enter a No.");
         n=scan.nextInt();
         for(i=2;i<=n/2;i++)
          {
            res=n%i;
            if(res==0)
            {
              flag=false;
              break;
             }
           }
             if(flag)
                System.out.println(n + " is Prime Number");
             else
                System.out.println(n + " is not Prime Number");
            break;

  default:  System.out.println("Not Valid option"); 
            break;
         }

        System.out.println("Do u want to Execute again(Y/N)");
        stc=new Scanner(System.in);
        c=stc.next();
        st=c.charAt(0);
        } while(st!='N');
           }
         public static boolean Primegen(int number){
         for(int i=2; i<number; i++){
         if(number%i == 0){
           return false;           //number is divisible so its not prime
         }
     }
          return true; 
     }
}
