package by.academy.classwork.lesson7;

public class Motorbyke extends  Product{
    String nameMotorbyke;
    String type;
    double maxSpeed;
    public Motorbyke(String nameMotorbyke, String type, double speed){
        super("Motorbyke", 50000);
        this.nameMotorbyke=nameMotorbyke;
        this.type=type;
        this.maxSpeed=maxSpeed;
    }
    public double getMaxSpeed (){
        return maxSpeed;
    }

    public String getNameMotorbyke() {
        return nameMotorbyke;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString() + "Motorbyke{" +
                "nameMotorbyke='" + nameMotorbyke + '\'' +
                ", type='" + type + '\'' +
                ", maxSpeed=" + maxSpeed +
                "} ";
    }
}
