public class Harimau extends Hewan {
    private int kekuatanCakar;

    // Constructor Overloading
    public Harimau() {
        super();
        this.kekuatanCakar = 0;
    }

    public Harimau(String nama, int umur, int kekuatanCakar) {
        super(nama, umur);  // Inheritance
        this.kekuatanCakar = kekuatanCakar;
    }

    // Setter dan Getter
    public void setKekuatanCakar(int kekuatanCakar) {
        this.kekuatanCakar = kekuatanCakar;
    }

    public int getKekuatanCakar() {
        return kekuatanCakar;
    }

    // Overriding method suara() (Polimorfisme)
    @Override
    public void suara() {
        System.out.println(getNama() + " mengaum!");
    }
}
