public class Fan {
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

public Fan() {
    speed = SLOW;
    on = false;
    radius = 5;
    color = "blue";
}

public int getSpeed() {
    return speed;
}

public void setSpeed(int newSpeed) {
    speed = newSpeed;
}

public boolean isOn() {
    return on;
}

public void setOn(boolean newOn) {
    on = newOn;
}

public double getRadius() {
    return radius;
}

public void setRadius(double newRadius) {
    radius = newRadius;
}

public String getColor() {
    return color;
}

public void setColor(String newColor) {
    color = newColor;
}

public String toString() {
    if (on) {
        return "Speed: " + speed + ", Color: " + color + ", Radius: " + radius;
    } else {
        return "Color: " + color + ", Radius: " + radius + ", Fan is off";
    }
}

}

