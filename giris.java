import java.util.Scanner;

public class giris {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int giris_hakki = 3 ;
        String sys_kullanici_adi = "multwaren";
        String sys_parola = "wabwaga32174";

        System.out.println("*****************");
        System.out.println("Giriş ekranı");
        System.out.println("*****************");

        while (true) 
        {
        System.out.println("Kullanıcı adı : ");
        String kullanici = scanner.nextLine();
        System.out.println("Parola");
        String parola = scanner.nextLine();
        
        if (kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
            System.out.println("Hoşgeldiniz " + kullanici);
            break;

        }
        else if (!kullanici.equals(sys_kullanici_adi)&& parola.equals(sys_parola) ) {
            System.out.println("Kullanıcı adınız yanlış");
            giris_hakki -=1;
            System.out.println("Kalan giriş hakkı "+ giris_hakki);

        }
        else {
            System.out.println("parola yanlış");
            giris_hakki -=1;
            System.out.println("Kalan giriş hakkı "+ giris_hakki);

        
       

        }
        if (giris_hakki==0) {
            System.out.println("Maalesef giriş hakkınız kalmamıştır tekrar deneyiniz...");
            break;
            
        }
      
        }

    }
    
}
