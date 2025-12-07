public class UjiCustomer {
    public static void main(String[] args) {

        // Object Customer biasa
        Customer cst = new Customer("Budi Santoso", "CST-001", 500000);

        // Object Member
        Member mbr = new Member("Siti Aminah", "MBR-110", 1250000, 240, "Gold");

        // Tampilan judul
        System.out.println("=== DATA CUSTOMER BELANJAKU ===");

        System.out.println("Status: Customer Biasa");
        cst.tampilkanInfo();

        System.out.println("\nStatus: Member");
        mbr.tampilkanInfo();
    }
}