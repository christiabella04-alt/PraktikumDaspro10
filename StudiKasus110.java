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


        sc.close();
    }
}
