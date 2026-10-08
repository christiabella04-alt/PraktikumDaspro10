import java.util.Scanner;
public class StudiKasus110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Deklarasi variabel
        int hargaPerCup = 18000;
        int jumlahCup;
        int uangBayar;
        int totalHarga;
        int totalBayar;
        int kembalian;
        int kurang;

        //Input
        System.out.println("Masukkan jumlah cup: ");
        jumlahCup = sc.nextInt();
        System.out.println("Masukkan uang bayar: ");
        uangBayar = sc.nextInt();

                totalHarga = jumlahCup * hargaPerCup;
        double diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }
        totalBayar = (int) totalHarga - (int) diskon;
        System.out.println("Total Harga: " + totalHarga);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total Bayar: " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian: " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp" + kurang);
        }

        sc.close();
    }
}
