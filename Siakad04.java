import java.util.Scanner;
public class Siakad04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // variable
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

        System.out.print("Masukkan nama : ");
        nama = input.nextLine();
        System.out.print("Masukkan NIM : ");
        nim = input.nextLine();
        System.out.print("Masukkan Kelas : ");
        kelas = input.nextLine().charAt(0);
        System.out.print("Masukkan No. Absen : ");
        absen = input.nextByte();
        System.out.print("Masukkan Nilai Kuis : ");
        nilaiKuis = input.nextDouble();
        System.out.print("Masukkan Nilai Tugas : ");
        nilaiTugas = input.nextDouble();
        System.out.print("Masukkan Nilai UTS : ");
        nilaiUTS = input.nextDouble();
        System.out.print("Masukkan Nilai UTS : ");
        nilaiUAS = input.nextDouble();

        nilaiAkhir = (nilaiKuis * 0.2) + (nilaiTugas * 0.15) + (nilaiUTS * 0.3) + (nilaiUAS * 0.35);

        System.out.println("Nama\t\t: " + nama);
        System.out.println("NIM\t\t: " + nim);
        System.out.println("Kelas\t\t: " + kelas);
        System.out.println("No. Absen\t: " + absen);
        System.out.println("Nilai Akhir\t: " + nilaiAkhir);
    }
}