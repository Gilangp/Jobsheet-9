import java.util.Scanner;

public class LinearSearch132 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        int key = 0;
        int hasil = 0;
        int elemen = 0;
        boolean search = false; 
    
        System.out.print("Masukkan jumlah elemen array : ");
        elemen = input13.nextInt();
    
        int[] arrayInt = new int[elemen];
    
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke -" + i + " : ");
            arrayInt[i] = input13.nextInt();
        }
    
        System.out.print("Masukkan key yang ingin dicari : ");
        key = input13.nextInt();
    
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                search = true;
                break;
            }
        } 
        if (search) {
            System.out.println("Key ada di posisi indeks ke-" + hasil);
        } else {
            System.out.println("Key tidak ditemukan");
        }
    }
}
