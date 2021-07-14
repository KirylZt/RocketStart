import java.util.Random;

public class Rocket {
    private String name;
    private int m;

    public Rocket(String name, int m) {
        this.name = name;
        this.m = m;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public boolean check() {
        Random random = new Random();
        int checkNumber = random.nextInt(50);
        if (checkNumber % 2 == 0) {
            System.out.println("Проверка прошла успешно.");
            return true;
        }
        return false;
    }

    public void start(){
        System.out.println("Ракета "+ name + " успешно стартанула с грузом в " + m +" т.");
    }

}
