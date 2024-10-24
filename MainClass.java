public class MainClass {
    public static void tampilkanSuaraHewan(Hewan hewan) {
        hewan.suara();  // Polimorfisme terjadi di sini
    }

    public static void main(String[] args) {
        // Membuat objek dari kelas Ayam, Kucing, Harimau
        Ayam ayam = new Ayam("Jago", 2, "Ayam Kampung");
        Kucing kucing = new Kucing("Molly", 3, "Hitam");
        Harimau harimau = new Harimau("Shera", 7, 1000);

        // Memanggil method menggunakan polimorfisme
        tampilkanSuaraHewan(ayam);
        tampilkanSuaraHewan(kucing);
        tampilkanSuaraHewan(harimau);

        // Memanfaatkan getter untuk mengambil nilai yang di-enkapsulasi
        System.out.println("Ayam jenis: " + ayam.getJenisAyam());
        System.out.println("Kucing warna: " + kucing.getWarna());
        System.out.println("Harimau kekuatan cakar: " + harimau.getKekuatanCakar());

        // Perusahaan (kelas induk 2)
        Perusahaan perusahaan = new Perusahaan("Kebun Binatang");
        perusahaan.infoPerusahaan();
    }
}
