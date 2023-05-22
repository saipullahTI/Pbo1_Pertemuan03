import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menentukan isi dompet
        System.out.print("Masukkan jumlah uang di dompet: ");
        int saldo = input.nextInt();

        // Menampilkan menu belanja
        System.out.println("\nMenu Belanja:");
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.println("3. Pakaian");

        // Memilih opsi belanja
        System.out.print("\nPilih opsi belanja (1-3): ");
        int opsi = input.nextInt();

        // Menggunakan percabangan untuk opsi belanja
        if (opsi == 1) {
            System.out.println("\nAnda memilih Makanan.");
        } else if (opsi == 2) {
            System.out.println("\nAnda memilih Minuman.");
        } else if (opsi == 3) {
            System.out.println("\nAnda memilih Pakaian.");
        } else {
            System.out.println("Opsi belanja tidak valid.");
            input.close();
            return;
        }

        System.out.print("Masukkan harga barang: ");
        int harga = input.nextInt();

        if (harga <= saldo) {
            saldo -= harga;
            System.out.println("Pembelian berhasil. Sisa saldo: " + saldo);
        } else {
            System.out.println("Maaf, saldo tidak cukup.");
        }

        input.close();
    }
}
