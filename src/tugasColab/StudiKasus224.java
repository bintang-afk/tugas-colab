package tugasColab;

import java.util.Scanner;

public class StudiKasus224 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = input.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenisKegiatan = input.nextLine();
        System.out.print("Jumlah dokumen : ");
        int jumlahDokumen = input.nextInt();
        System.out.print("Peringkat juara : ");
        int peringkatJuara = input.nextInt();
        System.out.print("Status pendanaan PKM (1/0) : ");
        int statusPKM = input.nextInt();

        int dokumenKurang = 4 - jumlahDokumen;

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA")|| jenisKegiatan.equalsIgnoreCase("BAKORMA")|| jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            if (jumlahDokumen == 4) {
                if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                    System.out.println("Status : Dokumen lengkap dan meraih Juara " + peringkatJuara + ". Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dokumen lengkap, tetapi bukan Juara 1, 2, atau 3. Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Dokumen tidak lengkap (kurang " + dokumenKurang + " dokumen). Dana penghargaan tidak diberikan.");
            }
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            if (jumlahDokumen == 4) {
                if (statusPKM == 1) {
                    System.out.println("Status : Dokumen lengkap dan lolos pendanaan PKM. Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dokumen lengkap, tetapi tidak lolos pendanaan PKM. Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Dokumen tidak lengkap (kurang " + dokumenKurang + " dokumen). Dana penghargaan tidak diberikan.");
            }
        } else {
            System.out.println("Status : Kegiatan termasuk kategori Lainnya. Tidak memperoleh dana penghargaan.");
        }

        input.close();
    }
}