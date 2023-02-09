public class Main {
    public static void main(String[] args) {
        singletonPattern();
    }

    public static void singletonPattern() {
        Singleton muster1 = Singleton.getInstance();
        System.out.println("esimene muster");

        Singleton muster2 = Singleton.getInstance();
        System.out.println("teine muster");

        if (muster1 == muster2) {
            System.out.println("Muster1 ja Muster2 on samad");
        } else
            System.out.println("Mustrid on erinevad");
    }

}


