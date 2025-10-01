interface Mamalia {
    void menyusui();
}

interface Karnivora {
    void berburu();
}

class Singa implements Mamalia, Karnivora {
    public void menyusui() {
        System.out.println("Singa menyusui anaknya.");
    }
    public void berburu() {
        System.out.println("Singa berburu mangsa.");
    }
}

public class Main {
    public static void main(String[] args) {
        Singa s = new Singa();
        s.menyusui();
        s.berburu();
    }
}
