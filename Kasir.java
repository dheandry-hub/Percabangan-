package LatihanJava;

import java.util.Scanner;

public class Kasir{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Status Member Anda!");
        String status = input.next();

        if (status.equalsIgnoreCase("Gold")){
            System.out.println("Diskon 20%");
        }
        else if (status.equalsIgnoreCase("Silver")){
            System.out.println("Diskon 15%");
        }       
        else if (status.equalsIgnoreCase("Bronze")){
            System.out.println("Diskon 10%");
        }
        else if (status.equalsIgnoreCase("Reguler")){
            System.out.println("Tidak mendapat diskon");
        }
        input.close();
    }
}