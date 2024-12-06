import java.util.Random;
import java.util.Scanner;

public class soalsedang3 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            double angka1 = random.nextInt(10) + 1; 
            double angka2 = random.nextInt(10) + 1; 
            double operasi = random.nextInt(3); 

            String soal = "";
            double jawabanBenar = 0.0;

            if (operasi == 0) {
                soal = angka1 + " X " + angka2 + " = ";
                jawabanBenar = angka1 * angka2;
            } else if (operasi == 1) {
                soal = angka1 + " : " + angka2 + " = ";
                jawabanBenar = (double) angka1 / angka2; 
            } else if (operasi == 2) {
                soal = angka1 + " % " + angka2 + " = ";
                jawabanBenar = angka1 % angka2;
            }

            System.out.print(soal);
            double jawabanUser = input.nextDouble();

            if (jawabanUser == jawabanBenar) {
                System.out.println("Benar!");
            } else {
                System.out.println("Salah. Jawaban yang benar adalah " + jawabanBenar);
            }

            System.out.print("Apakah Anda ingin berhenti? (y/n): ");
            String berhenti = input.next();

            if (berhenti.equalsIgnoreCase("y")) {
                System.out.println("Terima kasih telah bermain!");
                break; 
            }
        }

        input.close();
    }
}
