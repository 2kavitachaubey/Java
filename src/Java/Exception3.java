package Java;
class NewFile{
    public void show() throws ClassNotFoundException{
        Class.forName("Calc");
    }
}
public class Exception3 {
    public static void main(String[] args) {
        NewFile obj = new NewFile();
        try {
            obj.show();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
