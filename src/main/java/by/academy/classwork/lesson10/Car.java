package by.academy.classwork.lesson10;

public class Car {
    private String typeCar;
    private double speedCar;
    public Car(){

    }

    public Car(String typeCar, double speedCar) {
        super();
        this.typeCar = typeCar;
        this.speedCar = speedCar;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public double getSpeedCar() {
        return speedCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    public void setSpeedCar(double speedCar) {
        this.speedCar = speedCar;
    }

}
