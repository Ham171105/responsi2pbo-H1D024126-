class Member extends Customer {
    // Atribut tambahan
    int poinReward;
    String level;

    // Constructor dengan super
    Member(String nama, String id, int totalBelanja, int poinReward, String level) {
        super(nama, id, totalBelanja);   // memanggil constructor parent
        this.poinReward = poinReward;
        this.level = level;
    }

    @Override
    void tampilkanInfo() {
        super.tampilkanInfo(); // panggil info dasar Customer
        System.out.println("Poin Reward: " + poinReward + " | Level: " + level);
    }
}