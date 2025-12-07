class Karyawan {
    // Variabel dasar
    protected String nama;
    protected double gajiPokok;

    // Constructor
    Karyawan(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    // Menampilkan informasi dasar
    void tampilInfo() {
        System.out.println("Nama: " + nama + " | Gaji Pokok: Rp " + gajiPokok);
    }
}