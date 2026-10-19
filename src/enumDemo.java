enum Day{
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday
}

public class enumDemo{
    public static void main(String[] args){
        Day today = Day.Sunday;

        System.out.println("Today is: " + today);
    }
}