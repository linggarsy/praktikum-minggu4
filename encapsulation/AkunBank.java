package encapsulation;
public class AkunBank {
    private int saldo; //property

    //method
    public AkunBank(int saldo) {
        this.saldo = saldo; //mengacu pada atribut suatu class menggunakan kata kunci this
    }

    //setter
    //menggunakan operator penugasan yaitu =
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    //getter
    public int getSaldo() {
        return this.saldo;
    }

    //method nabung
    public int nabung(int saldo) {
        return this.saldo += saldo;
    }

    //method tarik tunai
    public int tarikTunai(int saldo) {
        if (this.saldo - saldo < 10) {
            System.out.println("Gagal tarik tunai! Saldo minimal harus tersisa 10.");
        } else {
            this.saldo -= saldo;
        }
        return this.saldo;
    }
}