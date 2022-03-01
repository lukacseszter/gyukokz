import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Kovács Dorina, 2022-02-23, Szoft I/N");
        Scanner sc = new Scanner(System.in);


        
        double szam = 0;
        
        do{
            System.out.println("Szam:");
            szam = sc.nextDouble();
            if(szam != 0){
                double ngyok= Math.sqrt(szam);
                System.out.printf("Négyzetgyök:" + ngyok);
            }
        }while(szam != 0);
        sc.close();
    }
}
