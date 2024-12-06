import java.util.Scanner;

public class Soalsulit3 {
    public static void main(String[] args) {
        Scanner nabil = new Scanner(System.in);

        System.out.println("Masukkan jumlah Array: ");
        int a = nabil.nextInt();
        int[] array = new int[a];
        boolean[] checked = new boolean[a];
        System.out.println("Masukkan elemen Array:");
        for (int i = 0; i < a; i++) {
            array[i] = nabil.nextInt();
        }

        
        System.out.println("Frekuensi elemen dalam array:");
        for (int i = 0; i < a; i++) {
            if (!checked[i]) {
                int count = 1;
                for (int j = i + 1; j < a; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        checked[j] = true;
                    }
                }
                System.out.println(array[i] + " muncul " + count + " kali");
            }
        }

        nabil.close();
    }
}