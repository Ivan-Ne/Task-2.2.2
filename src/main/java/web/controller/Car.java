package web.controller;

public class Car {

    private String brand;
    private int number;
    private String color;

    public Car(String brand, int number, String color) {
        this.brand = brand;
        this.number = number;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
