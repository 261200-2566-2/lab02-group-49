public class AirPurifier {
    //instance variables
    String model;
    String serialNo;
    boolean power;

    //instance methods
    void turnOn(){ power = true; }
    void turnOff(){ power = false; }

    //class variables
    static int modelCount;
    static int proCount;
    static int basicCount;

    //class methods
    static String mostPopularModel(){
        if(proCount > basicCount) return "Pro";
        else return "Basic";
    }

    //constructors
    AirPurifier(String model, String serialNo){
        this.model = model;
        this.serialNo = serialNo;
        modelCount++;

        if("Pro".equals(model)) proCount++;
        else basicCount++;
    }
    AirPurifier(String serialNo){
        model = "Pro";
        this.serialNo = serialNo;
        modelCount++;
        proCount++;
    }
}
