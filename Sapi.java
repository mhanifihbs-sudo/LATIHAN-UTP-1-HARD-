public class Sapi {
    private String nama;
    private int berat;

    public Sapi(String nama, int berat) {
        this.nama = nama;
        this.berat = berat;
    }

    public String getNama() {
        return nama;
    }

    public int getBerat() {
        return berat;
    }

    public boolean isGratis() {
        return nama.equals("Moo") || nama.equals("Mooo") || nama.equals("Moooo");
    }
}
