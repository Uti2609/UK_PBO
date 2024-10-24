public class Ayam extends Hewan {
    private String jenisAyam;

    // Constructor Overloading
    public Ayam() {
        super();
        this.jenisAyam = "Tidak diketahui";
    }

    public Ayam(String nama, int umur, String jenisAyam) {
        super(nama, umur);  // Inheritance
        this.jenisAyam = jenisAyam;
    }

    // Setter dan Getter
    public void setJenisAyam(String jenisAyam) {
        this.jenisAyam = jenisAyam;
    }

    public String getJenisAyam() {
        return jenisAyam;
    }

    // Overriding method suara() (Polimorfisme)
    @Override
    public void suara() {
        System.out.println(getNama() + " berkokok!");
    }
}
