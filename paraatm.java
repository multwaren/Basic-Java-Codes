import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class paraatm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int bakiye = 1000;
        String islemler =  "1 Bakiye öğren\n"
                           +"2 Para çek\n"
                           +"3 Para yatır \n"
                           +"q ÇıkıŞ\n";
        

       System.out.println("*******************");  
       System.out.println("İşlemler\n"+islemler);
       System.out.println("*******************"); 
       
       while (true) 
       {
        System.out.println("İşlem giriniz");
        String islem = scanner.nextLine();


        if (islem.equals("q")) {
            System.out.println("Hesaptan çıkılıyor...");

            break;

            
        }
        else if (islem.equals("1")) {
            System.out.println("Güncel bakiyeniz : " + bakiye);
            
        }

        else if (islem.equals("2")) {

            System.out.println("Çekmek istediğiniz tutar");
            int tutar = scanner.nextInt();
            scanner.nextLine();


            if (bakiye - tutar < 0) {

                System.out.println("yetersiz bakiye");
                
            }
            else {
                bakiye -= tutar;
                System.out.println("yeni bakiye" + bakiye );
            }

            
        }
        else if (islem.equals("3")) {

            System.out.println("Yatırmak istediğiniz tutar ? ");
            int tutar = scanner.nextInt();
            scanner.nextLine();
            bakiye += tutar;
            System.out.println("yeni bakiyeniz"+ bakiye );

            
        }
        else {
            System.out.println("Geçersiz işlem :");
        }
        
       }

    }
    
}
