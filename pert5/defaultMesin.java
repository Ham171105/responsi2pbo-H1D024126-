class defaultMesin {
    // Variabel umum mesin (namaMesin, tenagaHP)
    protected String namaMesin;
    protected int tenagaHP;
    // Constructor
    defaultMesin(String nama, int hp) {
        this.namaMesin = nama;
        this.tenagaHP = hp;
    }

    public String getNamaMesin() {
        return namaMesin;
    }

    void tampilInfo() {
        // Tampilkan info dasar mesin
        System.out.printf("Mesin %s | Tenaga: %d HP", namaMesin, tenagaHP);
    }

    double nilaiPerforma() {
        // Hitung performa dasar
        return tenagaHP * 1.0;
    }

    String kategoriMesin() {
        // Kategori default
        return "Mesin Umum";
    }

    void suaraMesin() {}

}