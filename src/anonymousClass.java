class Animals{
    void sound(){
        System.out.println("Animal makes sound");
    }
}

public class anonymousClass{
    public static void main(String[] args){
        Animals a = new Animals(){
            @Override
            void sound(){
                System.out.println("Dog Barks");
            }
        };

        a.sound();
    }
}