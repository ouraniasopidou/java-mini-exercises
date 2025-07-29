package gr.aueb.cf.ch12;

public class Vehicle {
    private int id;
    private String brand;
    private double velocity;
    private ColorType color;

    private Vehicle (){

    }

    public Vehicle (int id, String brand, double velocity, ColorType color) {
        this.id = id;
        this.brand = brand;
        this.velocity = velocity;
        this.color= color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public ColorType getColor() {
        return color;
    }

    public void setColor(ColorType color) {
        this.color = color;
    }

    //public API
    public void startEngine () {
        System.out.println("Engine Started");
    }

    public void stopEngine () {
        System.out.println("Engine Stopped");
    }

    private boolean isMoving () {
        return velocity !=0;
    }
}
