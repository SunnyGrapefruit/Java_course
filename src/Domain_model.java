public class Domain_model {

    public interface Transport{
        public void move();
    }

    abstract static class Ground implements Transport{

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

    abstract static class Air implements Transport{

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

    abstract static class Water implements Transport{

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

    public static class Car extends Ground{
        @Override
        public void breakdown() {
            System.out.println("Машина сломалась!");
        }
    }

    public static class Motorcycle extends Ground{
        @Override
        public void breakdown() {
            System.out.println("Мотоцикл сломался!");
        }
    }

    public static class Bike extends Ground{
        @Override
        public void breakdown() {
            System.out.println("Велосипед сломался!");
        }
    }

    public static class Airplane extends Air{
        @Override
        public void breakdown() {
            System.out.println("Самолет падает!");
        }
    }

    public static class Helicopter extends Air{
        @Override
        public void breakdown() {
            System.out.println("Вертолет падает!");
        }
    }

    public static class Airship extends Air{

        private String name;

        public Airship(String name) {
            this.name = name;
        }

        @Override
        public void breakdown() {
            System.out.println("Почему мы видим дирижабль!");
        }
    }

    public static class Ship extends Water{
        @Override
        public void breakdown() {
            System.out.println("Лодка тонет!");
        }
    }

    public static class Yacht extends Water{
        @Override
        public void breakdown() {
            System.out.println("Яхта тонет!");
        }
    }

    public static class Barge extends Water{
        @Override
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
//        System.out.println(titanic.name);
        titanic.move();
        titanic.breakdown();

    }

}