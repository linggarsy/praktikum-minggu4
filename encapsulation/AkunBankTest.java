package encapsulation;
public class AkunBankTest {
    public static void main(String[] args) {
        AkunBank akun1 = new AkunBank(50);

        System.out.println("Saldo awal: " + akun1.getSaldo());

        akun1.nabung(20);
        System.out.println("Saldo setelah nabung 20: " + akun1.getSaldo());

        akun1.tarikTunai(30);
        System.out.println("Saldo setelah tarik 30: " + akun1.getSaldo());

        akun1.tarikTunai(50); // nominal yg diinputkan untuk tarik tunai
        System.out.println("Saldo akhir: " + akun1.getSaldo());
    }
}