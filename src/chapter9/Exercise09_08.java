package chapter9;

/**
 * @author WangMingMing
 * @creat 2020-03-11 13:28
 */
public class Exercise09_08 {
    public static void main(String[] args) {
        //第一个实例对象fan1
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());

        System.out.println();

        //第二个实例对象fan2
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println(fan2.toString());
    }

}
class Fan{
    public static final int SLOW = 1;//速度等级
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    public String color = "blue";

    //get和set方法
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //无参构造
    public Fan(){

    }

    public String toString(){
        return "speed " + speed + "\n"
                + "color " + color + "\n"
                + "radius " + radius + "\n"
                + ((on) ? "fan is on" : "fan is off");
    }
}
