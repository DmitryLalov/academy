package by.academy.homework.homework3;

import java.math.BigDecimal;
import java.util.Scanner;
/*
Класс Bargainer (торговец) служит для создания пользователей Bargainer seller и Bargainer buyer, которые обладают
свойствами: имя, количество денег.
 */
public class Bargainer {
    String nameBargainer;
    BigDecimal money = new BigDecimal(0.0);

    public Bargainer(String nameBargainer, BigDecimal money) {
        this.nameBargainer = nameBargainer;
        this.money = money;
    }

    protected String getNameBargainer() {
        return nameBargainer;
    }

    protected BigDecimal getMoney() {
        return money;
    }

    protected void increaseMoney(BigDecimal fullPrice) {
        money = money.add(fullPrice);
    }

    protected void decreaseMoney(BigDecimal fullPrice) {
        money = money.subtract(fullPrice);
    }
}
