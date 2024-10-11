public class Perusahaan {
    private String namaPerusahaan;

    // Constructor Overloading
    public Perusahaan() {
        this.namaPerusahaan = "Perusahaan Default";
    }

    public Perusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    // Setter dan Getter
    public void setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    public void infoPerusahaan() {
        System.out.println("Nama Perusahaan: " + namaPerusahaan);
    }
}
