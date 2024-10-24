public class Anjing extends Hewan {
    private String ras;

    // Constructor Overloading
    public Anjing() {
        super();
        this.ras = "Tidak diketahui";
    }

    public Anjing(String nama, int umur, String ras) {
        super(nama, umur);  // Inheritance
        this.ras = ras;
    }

    // Setter dan Getter
    public void setRas(String ras) {
        this.ras = ras;
    }

    public String getRas() {
        return ras;
    }

    // Overriding method suara() (Polimorfisme)
    @Override
    public void suara() {
        System.out.println(getNama() + " menggonggong!");
    }
}
