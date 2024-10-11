public class Kucing extends Hewan {
    private String warna;

    // Constructor Overloading
    public Kucing() {
        super();
        this.warna = "Tidak diketahui";
    }

    public Kucing(String nama, int umur, String warna) {
        super(nama, umur);  // Inheritance
        this.warna = warna;
    }

    // Setter dan Getter
    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }

    // Overriding method suara() (Polimorfisme)
    @Override
    public void suara() {
        System.out.println(getNama() + " mengeong!");
    }
}
