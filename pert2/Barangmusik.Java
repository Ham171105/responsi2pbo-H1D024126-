class BarangMusik {
    // Deklarasikan variabel/state yang diperlukan di sini
    private String kodeUnikBarang;
    private String namaAlatMusilk;
    private double hargaSatuan;
    private int jumlahStok;

    // Constructor
    public BarangMusik(String kodeUnikBarang, String namaAlatMusilk, double hargaSatuan, int jumlahStok) {
        this.kodeUnikBarang = kodeUnikBarang;
        this.namaAlatMusilk = namaAlatMusilk;
        this.hargaSatuan = hargaSatuan;
        this.jumlahStok = jumlahStok;
    }

    public BarangMusik(String kodeUnikBarang, String namaAlatMusilk, double hargaSatuan) {
        this.kodeUnikBarang = kodeUnikBarang;
        this.namaAlatMusilk = namaAlatMusilk;
        this.hargaSatuan = hargaSatuan;
    }

    public BarangMusik(String kodeUnikBarang, String namaAlatMusilk) {
        this.kodeUnikBarang = kodeUnikBarang;
        this.namaAlatMusilk = namaAlatMusilk;
    }

    void ubahHarga(double hargaBaru) {
        hargaSatuan = hargaBaru;
    }

    void tambahStok(int jumlah) {
        jumlahStok += jumlah;
    }

    void tampilInfo() {
        System.out.printf("Alat musik %s | Kode: %s | Harga: Rp %f | Stok: %d unit\n", namaAlatMusilk, kodeUnikBarang, hargaSatuan, jumlahStok);
    }
}