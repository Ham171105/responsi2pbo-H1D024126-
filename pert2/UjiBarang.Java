class UjiBarang {
    public static void main(String[] args) {
        // Buat objek barang pertama gitar
        BarangMusik gitarSaya = new BarangMusik("GTR-001", "Gitar Akustik Yamaha");

        // Atur harga gitar
        gitarSaya.ubahHarga(1500000);

        // Tambah stok gitar
        gitarSaya.tambahStok(5);

        // Buat objek drum
        BarangMusik drumOrangSayaAmbil = new BarangMusik("DRM-001", "Drum Set Pearl", 8500000, 3);

        // Tampilkan informasi kedua barang
        System.out.println("=== INVENTARIS TOKO NADAKITA ===");
        gitarSaya.tampilInfo();
        drumOrangSayaAmbil.tampilInfo();
    }
}