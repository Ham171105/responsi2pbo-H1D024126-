public abstract class KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT/STATE
    // ==========================================================

    private String namaKendaraan;
    private int levelEnergi;        // 0–100
    private int kapasitasPenumpang;


    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    public KendaraanGalaksi(String namaKendaraan, int kapasitasPenumpang) {
        this.namaKendaraan = namaKendaraan;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.levelEnergi = 100; // default
    }


    // ==========================================================
    // GETTER
    // ==========================================================

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public int getLevelEnergi() {
        return levelEnergi;
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }


    // ==========================================================
    // METHOD BIASA
    // ==========================================================

    public final void tampilStatus() {
        System.out.println(getNamaKendaraan() +
                " | Energi: " + levelEnergi +
                "% | Kapasitas: " + kapasitasPenumpang + " orang");
    }

    // Setter energi untuk subclass
    protected void setEnergi(int energiBaru) {
        if (energiBaru > 100) energiBaru = 100;
        if (energiBaru < 0) energiBaru = 0;
        this.levelEnergi = energiBaru;
    }


    // ==========================================================
    // ABSTRACT METHOD
    // ==========================================================

    abstract void aktifkanMesin();
    abstract void jelajah(int jarak);
    abstract void isiEnergi(int jumlah);
}