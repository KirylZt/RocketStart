public class Main {
    public static void main(String[] args) {
        Rocket rocket = new Rocket("Normandy",500);
        Starport starport = new Starport(rocket);
        starport.start();
    }
}
