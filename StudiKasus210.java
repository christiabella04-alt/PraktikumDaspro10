import java.util.Scanner;
public class StudiKasus210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //deklarasi variabel
        String nama;
        String jenis;
        int jumlahDokumen;
        int peringkat;
        int statusPendanaan;
        String status;
        
        //input
        System.out.print("Nama mahasiswa: ");
        nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        jenis = sc.nextLine();
        System.out.print("Jumlah dokumen: ");
        jumlahDokumen = sc.nextInt();

        int kurang = 4 - jumlahDokumen;

        if (jenis.equalsIgnoreCase("BELMAWA") || jenis.equalsIgnoreCase("BAKORMA") || jenis.equalsIgnoreCase("MANDIRI")) {
            
        System.out.print("Peringkat juara: ");
        peringkat = sc.nextInt();
            if (jumlahDokumen >= 4 && peringkat <= 3) {
                status = "Selamat! Anda mendapatkan dana penghargaan";
            } else {
                status = "Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.";
            }
        } else {
            status = "Anda tidak mendapatkan dana penghargaan";
        }

        System.out.println("Status: " + status);

        sc.close();
    }
}
