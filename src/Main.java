public class Main {
    public static void main(String[] args) {
        singletonPattern();
        factoryMethod();
    }

    public static void factoryMethod() {
        System.out.println("-----Factory meetod-----");
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("RING");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RISTKÜLIK");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("RUUT");
        shape3.draw();
    }

    public static void singletonPattern() {
        System.out.println("-----Singleton meetod-----");
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