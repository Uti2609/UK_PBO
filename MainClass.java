public class MainClass {
    // Polimorfisme: Method menerima parameter dari kelas induk
    public static void tampilkanSuaraHewan(Hewan hewan) {
        hewan.suara();  // Polimorfisme terjadi di sini
    }

    public static void main(String[] args) {
        // Membuat objek dari kelas Anjing, Kucing, Harimau
        Anjing anjing = new Anjing("Buddy", 5, "Golden Retriever");
        Kucing kucing = new Kucing("Molly", 3, "Hitam");
        Harimau harimau = new Harimau("Shera", 7, 1000);

        // Memanggil method menggunakan polimorfisme
        tampilkanSuaraHewan(anjing);
        tampilkanSuaraHewan(kucing);
        tampilkanSuaraHewan(harimau);

        // Memanfaatkan getter untuk mengambil nilai yang di-enkapsulasi
        System.out.println("Anjing ras: " + anjing.getRas());
        System.out.println("Kucing warna: " + kucing.getWarna());
        System.out.println("Harimau kekuatan cakar: " + harimau.getKekuatanCakar());

        // Perusahaan (kelas induk 2)
        Perusahaan perusahaan = new Perusahaan("ABC Pet Shop");
        perusahaan.infoPerusahaan();
    }
}
