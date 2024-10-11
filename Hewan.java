public class Hewan {
    private String nama;
    private int umur;

    // Constructor Overloading
    public Hewan() {
        this.nama = "Tidak diketahui";
        this.umur = 0;
    }

    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Setter dan Getter (Encapsulasi)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }

    // Method yang dapat di-override (Polimorfisme)
    public void suara() {
        System.out.println("Hewan ini mengeluarkan suara.");
    }
}
