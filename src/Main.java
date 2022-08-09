import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n1,n2,selec;


        Scanner input=new Scanner(System.in);
        System.out.println("Ilk Sayiyi giriniz: ");
        n1=input.nextInt();
        System.out.println("Ikinci Sayiyi giriniz: ");
        n2=input.nextInt();

        System.out.println("1-Toplama\n 2-Cikarma\n 3-Carpma\n 4-Bolme ");
        System.out.println("Seciniz: ");
         selec=input.nextInt();

         switch (selec){
             case 1:
                 System.out.println("Toplama: "+(n1+n2));
                 break;

             case 2:
                 System.out.println("Cıkarma: "+(n1-n2));
                 break;

             case 3:
                 System.out.println("Carpma: "+(n1*n2));
                 break;

             case 4:
                 System.out.println("Bolme: "+(n1/n2));
                 break;

             default:
                 System.out.println("Hatali Giris Yaptiniz Lutfen Tekrar Deneyiniz...");

         }
    }
}
