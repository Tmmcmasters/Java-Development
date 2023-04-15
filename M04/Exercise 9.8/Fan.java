public class Fan { // Creating a Fan class

    // Initializing variables
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Creating a Fan constructor
public Fan() {
    speed = SLOW;
    on = false;
    radius = 5;
    color = "blue";
}

// Creating getSpeed method
public int getSpeed() {
    return speed;
}

// Creating setSpeed method
public void setSpeed(int newSpeed) {
    speed = newSpeed;
}

// Creating getOn method
public boolean isOn() {
    return on;
}

// Creating setOn method
public void setOn(boolean newOn) {
    on = newOn;
}

// Creating getRadius method
public double getRadius() {
    return radius;
}

// Creating setRadius method
public void setRadius(double newRadius) {
    radius = newRadius;
}

// Creating getColor method
public String getColor() {
    return color;
}

// Creating setColor method
public void setColor(String newColor) {
    color = newColor;
}

// Creating toString method
public String toString() {
    if (on) {
        return "Speed: " + speed + ", Color: " + color + ", Radius: " + radius;
    } else {
        return "Color: " + color + ", Radius: " + radius + ", Fan is off";
    }
}

}

