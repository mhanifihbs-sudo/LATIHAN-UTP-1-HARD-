public class Transaksi {
    private Sapi sapi;
    private Layanan layanan;

    public Transaksi(Sapi sapi, Layanan layanan) {
        this.sapi = sapi;
        this.layanan = layanan;
    }

    public double hitungBiayaDasar() {
        return sapi.getBerat() * layanan.getHargaPerKg();
    }

    public double hitungDiskon() {
        if (sapi.getBerat() > 30) {
            return 0.1 * hitungBiayaDasar();
        }
        return 0;
    }

    public double hitungTambahanVIP() {
        if (layanan.isVIP()) {
            return 0.2 * hitungBiayaDasar();
        }
        return 0;
    }

    public double hitungSubtotal() {
        return hitungBiayaDasar() - hitungDiskon() + hitungTambahanVIP();
    }

    public double hitungPajak() {
        return 0.08 * hitungSubtotal();
    }

    public double hitungTotal() {
        if (sapi.isGratis()) {
            return 0;
        }
        return hitungSubtotal() + hitungPajak();
    }
}