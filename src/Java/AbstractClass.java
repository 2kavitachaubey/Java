package Java;
abstract class Car{
    abstract void drive();
    abstract void fly();
    void music(){
        System.out.println("Play music... Musically on Akashvani fm radio");
    }
}
abstract class GWagon extends Car{
    void drive(){
        System.out.println("I'm a smooth driving car...");
    }
}
class Updated extends GWagon{   //Concrete Class.......
    void fly(){
        System.out.println("Now i'm in 22th century so now i can fly... hihihihi");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Car c1 = new Updated();
        c1.drive();
        c1.fly();
        c1.music();
    }
}
