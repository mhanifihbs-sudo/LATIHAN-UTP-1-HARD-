import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        int berat = 0;
        String jenis;
        String kelas;

       
        while (true) {
            nama = input.nextLine();
            if (nama.matches("[a-zA-Z]+")) break;
            System.out.println("Mooo! Nama sapi harus pakai huruf, bukan angka atau simbol!");
        }

      
        while (true) {
            try {
                berat = Integer.parseInt(input.nextLine());
                if (berat >= 1 && berat <= 80) break;
                System.out.println("Sapi astral? Masukkan berat yang valid dulu, bestie!");
            } catch (Exception e) {
                System.out.println("Sapi astral? Masukkan berat yang valid dulu, bestie!");
            }
        }


        while (true) {
            jenis = input.nextLine();
            if (jenis.equals("spa") || jenis.equals("potong_kuku") || jenis.equals("grooming")) break;
            System.out.println("Pilih spa, potong_kuku, atau grooming! Sapi kamu mau dirawat apa, sih?");
        }

    
        while (true) {
            kelas = input.nextLine();
            if (kelas.equals("reguler") || kelas.equals("vip")) break;
            System.out.println("Pilih reguler atau vip! Sapi kamu mau treatment sultan atau biasa aja?");
        }

       
        Sapi sapi = new Sapi(nama, berat);
        Layanan layanan = new Layanan(jenis, kelas);
        Transaksi trx = new Transaksi(sapi, layanan);


        System.out.println("=========== NOTA KLINIK SAPI ===========");
        System.out.println("Nama Sapi: " + sapi.getNama());
        System.out.println("Berat: " + sapi.getBerat() + " kg");
        System.out.println("Jenis Layanan: " + layanan.getJenis());
        System.out.println("Kelas: " + layanan.getKelas());
        System.out.println("Biaya Dasar: Rp " + trx.hitungBiayaDasar());
        System.out.println("Diskon: Rp " + trx.hitungDiskon());
        System.out.println("Biaya Tambahan VIP: Rp " + trx.hitungTambahanVIP());
        System.out.println("Subtotal: Rp " + trx.hitungSubtotal());
        System.out.println("Pajak: Rp " + trx.hitungPajak());
        System.out.println("Total Biaya: Rp " + trx.hitungTotal());
        System.out.println("========================================");

        if (sapi.isGratis()) {
            System.out.println("Terima kasih, " + sapi.getNama() + " ! Sapi spesial memang beda perlakuan~");
        } else {
            System.out.println("Terima kasih, " + sapi.getNama() + " ! Semoga sapinya makin glow up.");
        }
    }
}