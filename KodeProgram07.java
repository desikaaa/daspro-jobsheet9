import java.util.Scanner;
public class KodeProgram07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = new int [3];
        int jmlElemen;
        int nilaiTertinggi = 0;
        int nilaiTerendah = 0;
        int total = 0; 
        double rataRata = 0;

        System.out.print("Masukkan banyaknya elemen :");
        jmlElemen = sc.nextInt();
        for (int i = 0; i < array.length; i++){
            System.out.print("Masukkan nilai ke-"+(i+1)+" :");
            array [i] = sc.nextInt();
        
            if (i== 0) {
                    nilaiTerendah = array[i];
            } else {
                if (array[i] > nilaiTertinggi) {
                nilaiTertinggi = array[i];
            }
            if (array[i] < nilaiTerendah) {
                nilaiTerendah = array[i];
            }
            }
            
            total += array[i];
        }
        rataRata = total/jmlElemen;
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.println("Nilai rata-rata: " + rataRata);
    }
}