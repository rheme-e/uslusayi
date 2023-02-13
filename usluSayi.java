package Giris;
import java.util.Scanner;
public class usluSayi {
    static int us(int a , int b){
        int result=1;
        for(int i=1 ; i<=b ; i++){
            result*=a;
    } return result;

    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.println("İlk Sayıyı Giriniz:");
        int a=inp.nextInt();
        System.out.println("İkinci Sayıyı Giriniz:");
        int b=inp.nextInt();
        System.out.println("Sonuç:"+us(a,b));



    }
}
