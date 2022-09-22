public class Vehicle {

    private Driver driver;
    private int myAge;
    private String type;
    private int milesToGo;
    private int milesDriven;
    boolean noDriver = false;


    public Vehicle( int myAge, String type, int milesToGo, int milesDriven, boolean noDriver) {
        this.myAge = myAge;
        this.type = type;
        this.milesToGo = milesToGo;
        this.milesDriven = milesDriven;
        this.noDriver = noDriver;

        System.out.println(type + " created. " + milesToGo + " miles to go!");
    }

    public boolean checkAge(String name, int age) {
        if (age < myAge) {
            System.out.println("Driver not changed! " + name + " is "+ age + ", but must be "+ myAge + " or older to drive "+ type);
        }else {
            return true;
        }
        return false;
    }

    public void setDriver(Driver driver){
        if (checkAge(driver.name, driver.age)){
            this.driver = driver;
            System.out.println("Driver chaged to "+ driver.name);
            noDriver = true;
        }
    }

    public void drive(){
        if (!noDriver){
            System.out.println(type+ " didn't drive - there's no driver!");
        } else {
            milesToGo = milesToGo - milesDriven;
            System.out.println( type + " drove " + milesDriven + " miles - "+ milesToGo + " miles to go");
        }
    }
}
