package task1;

import java.util.Scanner;

public class _Depremolcegiproje {
    public static void main(String[] args) {
        Scanner sacanner=new Scanner(System.in);
        double dprmsiddeti;
        System.out.print("Deprem Şiddeti Giriniz=");
        dprmsiddeti=sacanner.nextDouble();
        if (dprmsiddeti<2.0)
            System.out.println("Mikro");
        else  if (dprmsiddeti<3.0)
                System.out.println("Çok Küçük");
        else if (dprmsiddeti<4.0)
            System.out.println("Küçük");
        else if (dprmsiddeti<5.0)
            System.out.println("Hafif");
        else if (dprmsiddeti<6.0)
            System.out.println("Orta");
        else if (dprmsiddeti<7.0)
            System.out.println("Ağır");
        else if (dprmsiddeti<8.0)
            System.out.println("Büyük");
        else if (dprmsiddeti<10.0)
            System.out.println("Çok Büyük");
        else
            System.out.println("Meteorik");
        sacanner.close();
    }
}
