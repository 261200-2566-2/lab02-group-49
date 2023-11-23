public class Main {
    public static void main(String[] args) {
        Lab02.ap();
    }

    static class Lab02{
        static void ap(){
            AirPurifier a = new AirPurifier("Pro","001");
            AirPurifier b = new AirPurifier("002");
            AirPurifier c = new AirPurifier("Basic","003");
            AirPurifier d = new AirPurifier("XX","004");
            AirPurifier e = new AirPurifier("005");

            System.out.println("There are " + AirPurifier.modelCount + " models.");
            System.out.println(AirPurifier.mostPopularModel() + " is most popular model.");

            a.turnOn();
            System.out.println("a's power is " + a.power + ".");
            a.turnOff();
            System.out.println("a's power is " + a.power + ".");

            System.out.println("c's power is " + c.power + ".");
        }
    }
}