package LatihanJava;

import java.util.Scanner;

public class PercabanganHurufMutu {
    public static void main(String[] args){
    Scanner input =new Scanner(System.in);
    
    int Nilai = 0;
    System.out.println("Masukkan nilai anda");
    Nilai =input.nextInt();

    if (Nilai>=85){
        System.out.println("A");
    }
    else if (Nilai>=70){
        System.out.println("B");
    }
    else if (Nilai>=55){
        System.out.println("C");
    }
    else if (Nilai>=40){
        System.out.println("D");
    }
    else if (Nilai<40){
        System.out.println("E");
    }
    input.close();
    }
}



      