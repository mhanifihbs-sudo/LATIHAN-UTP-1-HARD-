public class Layanan {
    private String jenis;
    private String kelas;

    public Layanan(String jenis, String kelas) {
        this.jenis = jenis;
        this.kelas = kelas;
    }

    public int getHargaPerKg() {
        switch (jenis) {
            case "spa":
                return 8000;
            case "potong_kuku":
                return 6000;
            case "grooming":
                return 10000;
            default:
                return 0;
        }
    }

    public String getJenis() {
        return jenis;
    }

    public String getKelas() {
        return kelas;
    }

    public boolean isVIP() {
        return kelas.equals("vip");
    }
}