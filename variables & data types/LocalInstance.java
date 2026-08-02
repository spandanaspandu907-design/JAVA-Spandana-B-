public class LocalInstance {
    int x = 100;

    public static void main(String[] args) {
        LocalInstance obj = new LocalInstance();
        int x = 50;

        System.out.println("Local Variable: " + x);
        System.out.println("Instance Variable: " + obj.x);
    }
}