import java.util.Scanner;

public class ArrayRataNilai132 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        int jmlMhs = 0;
        int lulus = 0, tidakLulus = 0;
        double rata2Lulus = 0, rata2TidakLulus = 0;
        int jmlMhsLulus = 0, jmlMhsTidakLulus = 0;

        System.out.print("Masukkan jumlah Mahasiswa : ");
        jmlMhs = input13.nextInt();

        double[] nilaiMhs = new double[jmlMhs];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = input13.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                lulus += nilaiMhs[i];
                jmlMhsLulus += 1;
                rata2Lulus = (double) lulus/jmlMhsLulus;
            }
            else {
                tidakLulus += nilaiMhs[i];
                jmlMhsTidakLulus += 1;
                rata2TidakLulus = (double)tidakLulus/jmlMhsTidakLulus;
            }
        }
        System.out.println("Rata - rata nilai lulus = "+rata2Lulus);
        System.out.println("Rata - rata nilai tidak lulus = "+rata2TidakLulus);
    }
}
