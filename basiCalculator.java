import java.util.Scanner;


public class hey {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        String islemler =   "(1)Sum of numbers \n"
                            +"(2)Subtraction of numbers\n"
                            +"(3)Multiplication of numbers \n"
                            +"(4)Division of numbers ";

    System.out.println(islemler);
            System.out.println("*************************");
        System.out.println("İşlemi seçiniz");
        String islem =scanner.nextLine();
        int a;
        int b ;

        switch(islem){
            case "1":
            System.out.println("Please enter first number");
            a =scanner.nextInt();
            System.out.println("Please enter second number");
            b = scanner.nextInt();
            System.out.println("Sum"+ (a+b));


            case "2":
            System.out.println("Please enter first number");
            a =scanner.nextInt();
            System.out.println("Please enter second number");
            b = scanner.nextInt();
            System.out.println("Substraction"+(a-b));

            case "3":

            System.out.println("Please enter first number");
            a =scanner.nextInt();
            System.out.println("Please enter second number");
            b = scanner.nextInt();
            System.out.println("Multiplication"+(a*b));




            case "4":
            System.out.println("Please enter first number");
            a =scanner.nextInt();
            System.out.println("Please enter second number");
            b = scanner.nextInt();
            System.out.println("Division  "+ ((double)a/b));
        }
		
    }
}