import java.util.Scanner;

public class Soalsedang1 {
    public static void main(String[] args) {
        int angka;
        int hasil=1;
        System.out.println("masukan angka");
        Scanner n = new Scanner(System.in);
        angka = n.nextInt();
        System.out.print(angka+"! =");
        for(int i = angka; i>0; i--){
            System.out.print(i);
            if(i>1){
                System.out.print("x");
            }
            
                hasil*=i;
            
        }
        System.out.println("");
        System.out.println("hasil ="+hasil);
    }
}
