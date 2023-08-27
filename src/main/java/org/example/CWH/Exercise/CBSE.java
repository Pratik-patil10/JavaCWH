package org.example.CWH.Exercise;

import java.util.Scanner;

public class CBSE {
    public static void main(String[] args) {
        double sub1, sub2, sub3, sub4, sub5, totalMarks, percentage;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student name:- ");
        String studentName = sc.nextLine();

        System.out.print("Enter your Sub1 Marks out of 100:- ");
        sub1 = sc.nextDouble();

        System.out.print("Enter your Sub2 Marks out of 100:- ");
        sub2 = sc.nextDouble();

        System.out.print("Enter your Sub3 Marks out of 100:- ");
        sub3 = sc.nextDouble();

        System.out.print("Enter your Sub4 Marks out of 100:- ");
        sub4 = sc.nextDouble();
        System.out.print("Enter your Sub5 Marks out of 100:- ");
        sub5 = sc.nextDouble();

        totalMarks = sub1 + sub2 + sub3 + sub4 + sub5;
        percentage = (totalMarks / 500) * 100;

        double distctn=60.00;
        double fail=40.00;

        if (percentage>=distctn){
            System.out.println("Congratulation to! "+studentName + " he got " + percentage + "% Marks with distinction !!");
        }else if (percentage<=distctn && percentage>=fail){
            System.out.println("Congratulation to! "+studentName +" he got " + percentage + "% Marks this year!");
        }else {
            System.out.println("Ohho :(  "+studentName + "got " + percentage + "% Mark & he is failed this year!");
        }
    }
}
