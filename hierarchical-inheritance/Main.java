class Hewan {
    void makan() {
        System.out.println("Hewan makan.");
    }
}

class Kucing extends Hewan {
    void suara() {
        System.out.println("Meong...");
    }
}

class Anjing extends Hewan {
    void suara() {
        System.out.println("Guk guk...");
    }
}

public class Main {
    public static void main(String[] args) {
        Kucing k = new Kucing();
        Anjing a = new Anjing();
        k.makan();
        k.suara();
        a.makan();
        a.suara();
    }
}
