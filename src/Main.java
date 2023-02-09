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
        System.out.println("esimene instance");

        Singleton muster2 = Singleton.getInstance();
        System.out.println("teine instance");

        if (muster1 == muster2) {
            System.out.println("Instance1 ja Instance2 on samad");
        } else
            System.out.println("Instancid on erinevad");
    }
}