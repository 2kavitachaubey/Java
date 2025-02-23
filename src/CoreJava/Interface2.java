package CoreJava;
interface Computer{
    void process();
}
class Laptop implements Computer{
    public void process(){
        System.out.println("Run, Compile, Run");
    }
}
class Desktop implements Computer{
    public void process(){
        System.out.println("Run, Compile, Run, Faster");
    }
}
class Developer{
    public void desk(Computer lap){
        lap.process();
    }
}
public class Interface2 {
    public static void main(String[] args) {
        Computer dk = new Desktop();
        Computer lap = new Laptop();

        Developer dev = new Developer();
        dev.desk(dk);
    }
}
