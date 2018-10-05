public class Nasabah{
	public static void main(String[] args) {
		Bank nasabah1 = new Bank();
		Bank nasabah2 = new Bank();

		nasabah1.namaNasabah("Salwa Husnun");
		nasabah1.addSaldo(200);
		nasabah1.minSaldo(100, "Buat Transaksi Belanja Online");
		nasabah1.showInfo();
	}
}