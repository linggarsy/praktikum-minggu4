class Kendaraan {
    void jalan() {
        System.out.println("Kendaraan bisa berjalan.");
    }
}

class Mobil extends Kendaraan {
    void roda() {
        System.out.println("Mobil punya 4 roda.");
    }
}

class Sedan extends Mobil {
    void tipe() {
        System.out.println("Ini adalah sedan.");
    }
}

public class Main {
    public static void main(String[] args) {
        Sedan s = new Sedan();
        s.jalan(); // dari Kendaraan
        s.roda();  // dari Mobil
        s.tipe();  // dari Sedan
    }
}
