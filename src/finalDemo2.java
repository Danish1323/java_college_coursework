class parent{
    final void showMessage(){
        System.out.println("Beta bigad gaya hamara😭😭😭😭😭😭😭😭😭😭");
    }
}

class child extends parent{

}

public class finalDemo2{
    public static void main(String[] args){
        child c = new child();
        c.showMessage();
    }
}