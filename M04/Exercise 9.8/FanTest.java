public class FanTest { //Creating a FanTest Class
    public static void main(String[] args) {
        Fan fan1 = new Fan(); //Declaring a Fan object
        fan1.setSpeed(Fan.FAST); //Setting the speed
        fan1.setRadius(10); //Setting the radius
        fan1.setColor("yellow"); //Setting the color
        fan1.setOn(true); //Setting the on

        Fan fan2 = new Fan(); //Declaring a new fan object
        fan2.setSpeed(Fan.MEDIUM); //Setting the speed
        fan2.setRadius(5); //Setting the radius
        fan2.setColor("blue"); //Setting the color
        fan2.setOn(false); //Setting the on

        System.out.println("Fan 1: " + fan1.toString()); //Printing the fan
        System.out.println("Fan 2: " + fan2.toString()); //Printing the fan
    }
}
