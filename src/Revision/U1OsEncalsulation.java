package Revision;
class NewClass{
    private double num;
    public void setName(int n){
        this.num = n;
    }
    public int getName(){
        return (int) num;
    }
}
public class U1OsEncalsulation {
    public static void main(String[] args) {
        NewClass n = new NewClass();
        n.setName(6);
        System.out.println(n.getName());
    }
}
