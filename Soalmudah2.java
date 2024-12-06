import java.util.Scanner;

public class Soalmudah2{
    public static void main(String[] args) {
        double bilangan;
        Scanner i = new Scanner(System.in);

        System.out.println("Masukan Nilai Bilangan ");
        bilangan = i.nextDouble();


        if(bilangan % 2 == 0 ){
            System.out.println("Bilangan Genap");
        }else{
            System.out.println("Bilangan Ganjil");
        }
        System.out.println("selesai");
        i.close();

          
    }
}