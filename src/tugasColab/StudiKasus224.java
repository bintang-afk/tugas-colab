package tugasColab;

import java.util.Scanner;

public class StudiKasus224 {
    public static void main(String[] args) {
        Scanner alka = new Scanner(System.in);

        int jumlahDokumen, peringkatJuara, statusPendanaanPKM, dokumenKurang;
        String namaMahasiswa, jenisKegiatan;

        System.out.print("Nama mahasiswa : ");
        namaMahasiswa = alka.nextLine();
        
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenisKegiatan = alka.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            
            System.out.print("Jumlah dokumen : ");
            jumlahDokumen = alka.nextInt();
            
            System.out.print("Peringkat juara : ");
            peringkatJuara = alka.nextInt();
            
            if (jumlahDokumen >= 4) {
                if (peringkatJuara >= 1 && peringkatJuara <= 6) {
                    System.out.println("Dana penghargaan diberikan");
                } else {
                    System.out.println("Anda tidak mendapat dana.");
                }
            } else {
                dokumenKurang = 4 - jumlahDokumen;
                System.out.println("Dokumen kurang " + dokumenKurang + " dan tidak dapat pendanaan.");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            
            System.out.print("Jumlah dokumen : ");
            jumlahDokumen = alka.nextInt();
            
            if (jumlahDokumen == 4) {
                System.out.print("Status pendanaan PKM (1 = Lolos, 0 = Tidak) : ");
                statusPendanaanPKM = alka.nextInt();
                
                if (statusPendanaanPKM == 1) {
                    System.out.println("Dana penghargaan diberikan");
                } else {
                    System.out.println("Kamu tidak dapat pendanaan.");
                }
            } else if (jumlahDokumen < 4) {
                dokumenKurang = 4 - jumlahDokumen;
                System.out.println("Dokumen kurang " + dokumenKurang + " dan tidak dapat pendanaan.");
            } else {
                System.out.println("Jumlah dokumen melebihi batas (harus tepat 4 dokumen).");
            }

        } else {
            System.out.println("Kamu tidak mengikuti program yang didukung, jadi tidak bisa mendapat pendanaan.");
        }

        alka.close();
    }
}