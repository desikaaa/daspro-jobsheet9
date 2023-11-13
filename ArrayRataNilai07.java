import java.util.Scanner;
public class ArrayRataNilai07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] nilaiMhs = new int [5];
        int jmlMhs;
        double totalLulus = 0;
        double totalTdkLulus = 0;
        int jmlLulus = 0;
        int jmlTdkLulus = 0;
        double rata2Lulus = 0;
        double rata2TdkLulus = 0;
        System.out.print("Masukkan jumlah mahasiswa :");
        jmlMhs = sc.nextInt();
        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" :");
            nilaiMhs [i] = sc.nextInt();
            if (nilaiMhs[i] > 70){
                totalLulus += nilaiMhs[i];
                jmlLulus++;
            } else {
                totalTdkLulus += nilaiMhs[i];
                jmlTdkLulus++;
            }
        }
        rata2Lulus = totalLulus/jmlLulus;
        System.out.println("Rata - rata nilai lulus adalah :"+rata2Lulus);
        rata2TdkLulus = totalTdkLulus/jmlTdkLulus;
        System.out.println("Rata - rata nilai tidak lulus adalah :"+rata2TdkLulus);

    }
}