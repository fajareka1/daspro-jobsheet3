import java.util.Scanner;

public class Kafe04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean keanggotaan;
        float diskon;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi, hargaTeh, hargaRoti, totalHarga, nominalBayar;

        hargaKopi = 12000;
        hargaTeh = 7000;
        hargaRoti = 20000;
        diskon = 10/100f;

        System.out.print("Masukkan keanggotaan : ");
        keanggotaan = sc.nextBoolean();
        System.out.print("Masukkan jumlah kopi : ");
        jmlKopi = sc.nextInt();
        System.out.print("Masukkan jumlah teh : ");
        jmlTeh = sc.nextInt();
        System.out.print("Masukkan jumlah roti : ");
        jmlRoti = sc.nextInt();

        // proses

        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("Keanggotaan pelanggan : " + keanggotaan);
        System.out.println("Item pembelian " + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti.");
        System.out.println("Nominal bayar Rp " + nominalBayar);

        
    }
}
