package Revision;

public class U1ExThrows {
    public void arr() throws ArrayIndexOutOfBoundsException{
        int [] a = new int[4];
        a[0] = 4;
        a[1] = 4;
        a[2] = 4;
        a[3] = 4;
        for (int i = 0 ; i < 5; i++) {
            if(i >= 4){
                throw new ArrayIndexOutOfBoundsException("length only 4");
            }
            else{
                System.out.println(a[i]);
            }
        }
    }
    public static void main(String[] args) {
        U1ExThrows u1 = new U1ExThrows();
        u1.arr();
    }
}
