public class parameterpassing{
    static void increment(int x){
        x = x+1;
        System.out.println("Inside method, x = " + x);
    }

    public static void main(String[] args){
        int num=5;
        increment(num);
        System.out.println("After method, x = " + num);
    }
}