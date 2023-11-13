 import java.util.Scanner;
public class LinearSearch07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] arrayInt = new int [6];
        int key = 0;
        int hasil = 0;

        System.out.print("Masukkan jumlah elemen array :");
        int jmlElemen = sc.nextInt(); 
        for (int i = 0; i < arrayInt.length; i++){
            System.out.print("Masukkan elemen array ke-"+i+" :");
            arrayInt[i] = sc.nextInt();
        }
        System.out.print("Masukkan array yang ingin dicari :");
         key = sc.nextInt();
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key){
                hasil = i;
                break;
            }
            }
            if (hasil != 0) {
            System.out.println("Key ada di posisi indeks ke-"+hasil);
            }else {
            System.out.println("Key tidak ditemukan");
            }  
    }
}

