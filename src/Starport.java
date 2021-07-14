public class Starport {
    private Rocket rocket;

    public Starport(Rocket rocket) {
        this.rocket = rocket;
    }

    public Rocket getRocket() {
        return rocket;
    }

    public void setRocket(Rocket rocket) {
        this.rocket = rocket;
    }

    public void start(){
        if (rocket.check()){
            for (int i = 9; i >= 0; i-- ){
             sleep(1000);
             System.out.println(i);
            }
            rocket.start();
        }else {
            System.out.println("Предстартовая проверка провалилась.");
        }

    }

    private void sleep(long milliSeconds){
        final long end = System.currentTimeMillis() + milliSeconds;
        while (System.currentTimeMillis() < end){
            //Ожидание
        }
    }


}
