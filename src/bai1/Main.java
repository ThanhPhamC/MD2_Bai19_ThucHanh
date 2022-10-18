package bai1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        EmailExample emailExample=new EmailExample();
        System.out.println("Nhap vao email");
       String strEmail=sc.nextLine();
            boolean isvalid = emailExample.validate(strEmail);
            if (isvalid){
                System.out.println("Email chính xác");
            }else {
                System.out.println("Email sai định dạng");
            }
    }
}