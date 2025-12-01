class Car{
    String model;
    String color;
    int speed;

    void start({
        System.out.println(model + " is starting...");
    }

    void accelerate(int value){
        speed += value;
        System.out.println("Speed increased to " + speed);
    }

    void stop(){
        System.out.println(model + " has stopped.");
    }
}

public class CarTest{
    public static void main(String[] args){
        Car c = new Car();
        c.model = "Honda City";
        c.color = "Black";
        c.speed = 0;

        c.start();
        c.accelerate(40);
        c.stop();
    }
}
