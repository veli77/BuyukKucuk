import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi, buyuk=0, kucuk=0;
        String bitir ;
        Scanner giris = new Scanner(System.in);
        System.out.println("\"P\" girilene kadar girilen sayıların en büyüğünü ve en küçüğünü bulur..");
        System.out.println("Sayı Giriniz : ");
        bitir = giris.nextLine();
        if(!bitir.equals("P")){
            sayi = Integer.valueOf(bitir);
            buyuk = sayi;
            kucuk = sayi;
        }

        while(!bitir.equals("P")) {
            System.out.println("Sayı Giriniz : ");
            bitir = giris.nextLine();
            if (bitir.equals("P")) {
                continue;
            }
            sayi = Integer.valueOf(bitir);
            if (sayi > buyuk) {
                buyuk = sayi;
            }
            if (sayi < kucuk) {
                kucuk = sayi;
            }
        }
        System.out.println("Buyuk Sayı = "+buyuk+",  küçük sayı = "+kucuk);

        }







    }

