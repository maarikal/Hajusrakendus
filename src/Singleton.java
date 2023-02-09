public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        System.out.println("läks Singletoni funktsiooni");
        if (instance == null) {
            instance = new Singleton();
            System.out.println("uus instance loodud");
        }
        return instance;

        }
}
