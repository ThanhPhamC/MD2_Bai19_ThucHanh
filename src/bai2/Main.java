package bai2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên tài khoản:");
        String straAccount = sc.nextLine();
//        Pattern pattern = Pattern.compile("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}");
        Pattern pattern = Pattern.compile("\\^[abc][-|/]\\d{1,2}[-|/]\\d{4}");
        Matcher matcher = pattern.matcher(straAccount);
           boolean checkAccount=matcher.matches();
           if (checkAccount){
               System.out.println("Tạo tài khoản thành công.");
           }else{
               System.out.println("Tài khoản sai định dạng.");
           }
    }
}