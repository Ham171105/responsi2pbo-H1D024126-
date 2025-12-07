public class KapalEksplorasi extends KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT KHUSUS
    // ==========================================================

    private int modulScan; // level 1–5


    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    public KapalEksplorasi(String nama, int kapasitas, int modulScan) {
        super(nama, kapasitas);
        this.modulScan = modulScan;
    }


    // ==========================================================
    // IMPLEMENTASI ABSTRACT METHOD
    // ==========================================================

    @Override
    void aktifkanMesin() {
        if (getLevelEnergi() < 15) {
            System.out.println("Energi tidak mencukupi untuk memulai ekspedisi!");
        } else {
            System.out.println("Kapal eksplorasi siap berangkat!");
        }
    }

    @Override
    void jelajah(int jarak) {
        int kebutuhan = jarak * 2; // 2% per km

        if (getLevelEnergi() < kebutuhan) {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        } else {
            setEnergi(getLevelEnergi() - kebutuhan);
            System.out.println("Kapal eksplorasi menjelajah sejauh " + jarak + " km.");
        }
    }

    @Override
    void isiEnergi(int jumlah) {
        setEnergi(getLevelEnergi() + jumlah);
        System.out.println("Mengisi energi... Energi kini " + getLevelEnergi() + "%");
    }


    // ==========================================================
    // METHOD KHUSUS
    // ==========================================================

    public void scanPlanet(String namaPlanet) {
        System.out.println("Melakukan scan pada planet " + namaPlanet +
                " dengan modul level " + modulScan + ".");
    }
}