
import java.util.Scanner;


public class asdasd {
    public static void main(String[] args){
        double bill;
        
        System.out.println("Taksimetre ");
         int open_value = 20;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gidilen km bilgisi:");
        int km = scanner.nextInt();
        System.out.println("Km başına kaç tl ?");
        double km_krs = scanner.nextDouble();



        if (km<0) {
            System.out.println("error! check variables again!");
            return;
            
        }

       else if (km>=10) 
        {
            bill = open_value+(km*km_krs);
            System.err.println("bill = "+bill);

            
        }
        else if (km<10)
         {
            
            bill = open_value;
            System.out.println("opening value ="+bill);
            
        }

        

    }






}
