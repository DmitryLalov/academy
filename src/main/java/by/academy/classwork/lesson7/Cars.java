package by.academy.classwork.lesson7;

public class Cars extends Product{
    String nameCar;
    String type;
    double maxSpeed;

    public Cars(String nameCar, String type, double maxSpeed){
        super("Car", 100000);
        this.nameCar=nameCar;
        this.type=type;
        this.maxSpeed=maxSpeed;
    }
    public double getMaxSpeed(){
        return maxSpeed;
    }
    public String getNameCar() {
        return nameCar;
    }
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString() + "Cars{" +
                "nameCar='" + nameCar + '\'' +
                ", type='" + type + '\'' +
                ", maxSpeed=" + maxSpeed +
                "} ";
    }
}
