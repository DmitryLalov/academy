package by.academy.classwork.lesson2;

import java.math.BigDecimal;

public class Cat {
    String name;
    int age;
    BigDecimal money;
    boolean isSleap;
    boolean isEat;
    boolean isWalk;

    public Cat(){

    }

    public Cat(String name, int age, BigDecimal money){
        super();
        this.name=name;
        this.age=age;
        this.money=money;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public BigDecimal getMoney(){
        return money;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setMoney(BigDecimal money){
        this.money=money;
    }

    public void setSleap(boolean isSleap) {
        this.isSleap = isSleap;
    }

    public void getSleep(){
        if (isSleap){
            System.out.println(name+" sleap");
        }
        else {
            System.out.println(name+" don't sleap");
        }

    }
    public void setEat(boolean isEat){
        this.isEat=isEat;
    }
    public void getEat(){
        if (isEat){
            System.out.println(name+" eat");
        }
        else {
            System.out.println(name+" don't eat");
        }

    }

    public void setWalk(boolean isWalk){
        this.isWalk=isWalk;
    }
    public void getWalk(){
        if (isWalk){
            System.out.println(name+" walk");
        }
        else {
            System.out.println(name+" don't walk");
        }

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                '}';
    }
}
