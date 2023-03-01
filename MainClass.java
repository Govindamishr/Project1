package com.AtmProject;
import java.util.Scanner;

public class MainClass {
    public static void main(String args[]){
        int AtmNumber=123456;
        int AtmPin=8521;
        Scanner sc= new Scanner(System.in);
        System.out.println("welcome to punjab National Bank");
        System.out.println("Enter the Atm Number");
        int atmNumber=sc.nextInt();
        System.out.println("enter AtmPin");
        int Atmpin=sc.nextInt();
        if(AtmNumber==atmNumber  &&  AtmPin== Atmpin){
            System.out.println("Validation Done");
            while(true){
                System.out.println("1.View Available Balance \n2.withdraw the Amount\n3.deposite the Amount\n4.mini statement \n5.exits");
                System.out.println("enter the choice");

                int mm=sc.nextInt();
                if(mm==1){

                } else if(mm==2){

                } else if(mm==3){

                } else if(mm==4){

                } else if(mm==5){
                    System.out.println("please collect your Atm card\n thank-you for visiting Atm machine");
                    System.exit(0);
                } else{
                    System.out.println("please enter correct choice");
                }

            }
        } else{
            System.out.println("incorrect Atm Number or pin");
            System.exit(0);
        }

        sc.close();
        

         

    }

    
}
