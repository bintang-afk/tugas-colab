package tugasColab;
import java.util.Scanner;

public class StudiKasus2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jeniskegiatan ;
        int jumlahDokumen ;
        int peringkatJuara ;
        int statusPendanaanPKM;
        String nama;
        System.out.print("Nama mahasiswa : ");
        nama = input.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jeniskegiatan = input.next();
        System.out.print("Jumlah dokumen  : ");
        jumlahDokumen = input.nextInt();
        System.out.print("peringkat juara : ");
        peringkatJuara = input.nextInt();


        if (jeniskegiatan.equalsIgnoreCase("BELMAWA")||jeniskegiatan.equalsIgnoreCase("BAKORMA")
            ||jeniskegiatan.equalsIgnoreCase("MANDIRI")) {
            if (jumlahDokumen >= 4) {
                if (peringkatJuara > 0 && peringkatJuara <= 3) {
                    System.out.println("Diberikan dana penghargaan");
                } else {
                    System.out.println("Anda tidak dapat dana , anda harus dapat juara 1-3 dulu");
                }
            } else {
                int dokumenKurang = 4 - jumlahDokumen ;
                System.out.printf("Dokumen tidak lengkap (kurang %d dokumen). Dana penghargaan tidak diberikan" , dokumenKurang);
            }
                
        } else if (jeniskegiatan.equalsIgnoreCase("PKM")) {
                System.out.print("Status pendanaan PKM : ");
                statusPendanaanPKM = input.nextInt();
            if (statusPendanaanPKM  == 1 ) {
                System.out.println("Dana penghargaan diberikan");
            } else {
                System.out.println("dana pendanaan tidak diberikan");
            }
        } else {
            System.out.println("Anda tidak dapat dana pengharagaan");
        }
        input.close();
    }
}