public class PesawatTempur extends KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT KHUSUS
    // ==========================================================

    private int jumlahRudal;


    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    public PesawatTempur(String nama, int kapasitas, int jumlahRudal) {
        super(nama, kapasitas);
        this.jumlahRudal = jumlahRudal;
    }


    // ==========================================================
    // IMPLEMENTASI ABSTRACT METHOD
    // ==========================================================

    @Override
    void aktifkanMesin() {
        if (getLevelEnergi() < 20) {
            System.out.println("Energi terlalu rendah! Mesin tidak dapat diaktifkan.");
        } else {
            System.out.println("Mesin pesawat tempur diaktifkan.");
        }
    }

    @Override
    void jelajah(int jarak) {
        int kebutuhan = jarak * 3; // 3% per km

        if (getLevelEnergi() < kebutuhan) {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        } else {
            setEnergi(getLevelEnergi() - kebutuhan);
            System.out.println("Pesawat tempur menjelajah sejauh " + jarak + " km.");
        }
    }

    @Override
    void isiEnergi(int jumlah) {
        setEnergi(getLevelEnergi() + jumlah);
        System.out.println("Energi pesawat bertambah menjadi " + getLevelEnergi() + "%");
    }


    // ==========================================================
    // METHOD KHUSUS
    // ==========================================================

    public void tembakRudal(int jumlah) {
        if (jumlahRudal >= jumlah) {
            jumlahRudal -= jumlah;
            System.out.println("Menembakkan " + jumlah + " rudal!");
        } else {
            System.out.println("Gagal! Rudal tidak mencukupi.");
        }
    }
}