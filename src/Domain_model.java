public class Domain_model {

    public interface Transport{
        public void move();
    }

    abstract static class GroundTransport implements Transport{

        private String model;
        private String color;
        private int wheels;
        private int maxSpeed;

        public void gas() {
            System.out.println("Поехали!");
        }

        public void move() {
            System.out.println("Я еду");
        }

        public abstract void breakdown();
    }

    abstract static class AirTransport implements Transport{

        private String model;
        private int places;
        private int maxSpeed;

        public void gas() {
            System.out.println("Полетели!");
        }

        public void move() {
            System.out.println("Я лечу");
        }

        public abstract void breakdown();
    }

    abstract static class WaterTransport implements Transport{

        private String model;
        private int motorPower;
        private int maxSpeed;

        public void gas() {
            System.out.println("Поплыли!");
        }

        public void move() {
            System.out.println("Я плыву");
        }

        public abstract void breakdown();
    }

    public static class Car extends GroundTransport{

        public void breakdown() {
            System.out.println("Машина сломалась!");
        }
    }

    public static class Motorcycle extends GroundTransport{

        public void breakdown() {
            System.out.println("Мотоцикл сломался!");
        }
    }

    public static class Bike extends GroundTransport{

        public void breakdown() {
            System.out.println("Велосипед сломался!");
        }
    }

    public static class Airplane extends AirTransport{

        public void breakdown() {
            System.out.println("Самолет падает!");
        }
    }

    public static class Helicopter extends AirTransport{

        public void breakdown() {
            System.out.println("Вертолет падает!");
        }
    }

    public static class Airship extends AirTransport{

        private String name;

        public Airship(String name) {
            this.name = name;
        }


        public void breakdown() {
            System.out.println("Почему мы видим дирижабль!");
        }
    }

    public static class Ship extends WaterTransport{

        public void breakdown() {
            System.out.println("Лодка тонет!");
        }
    }

    public static class Yacht extends WaterTransport{

        public void breakdown() {
            System.out.println("Яхта тонет!");
        }
    }

    public static class Barge extends WaterTransport{

        public void breakdown() {
            System.out.println("Баржа тонет!");
        }
    }


    public static void main(String[] args) {

        System.out.println("Ground");
        Car sedan = new Car();
        sedan.gas();

        System.out.println("\n" +"Air");
        Airship hindenburg = new Airship("Гинденбург");
        System.out.println(hindenburg.name);
        hindenburg.breakdown();

        System.out.println("\n" + "Water");
        Ship titanic = new Ship();
        titanic.move();
        titanic.breakdown();
    }
}