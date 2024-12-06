import java.util.Scanner;

public class Soalsulit1 {
    public static double rata(double TotalNilai, double JumlahSiswa){
        return TotalNilai/JumlahSiswa;
    }
      public static void main(String[] args) {
        int JumlahSiswa;
        double rata, Nilai, TotalNilai=0;
        Scanner s = new Scanner(System.in);

        System.out.println("Masukan Jumlah siswa");
        JumlahSiswa = s.nextInt();
         
        for (int i = 1; i <=JumlahSiswa; i++){
            System.out.println("Nilai siswa " + i + ":");
            Nilai = s.nextDouble();
            TotalNilai += Nilai;
          
        }

        double hasilakhir = rata(TotalNilai, JumlahSiswa);
        System.out.println("Rata-Rata Nilai: " + hasilakhir );

        s.close();
    }
}

