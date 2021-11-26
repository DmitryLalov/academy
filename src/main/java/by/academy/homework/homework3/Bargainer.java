package by.academy.homework.homework3;

import java.math.BigDecimal;
import java.util.Scanner;

/*
Класс Bargainer (торговец) служит для создания пользователей Bargainer seller и Bargainer buyer, которые обладают
свойствами: имя, количество денег.
 */
public class Bargainer {
    private String nameBargainer;
    private BigDecimal money = new BigDecimal(0.0);
    private String dateOfBirth = null;
    private String phone = null;
    private String email = null;

    public Bargainer(String nameBargainer, BigDecimal money) {
        this.nameBargainer = nameBargainer;
        this.money = money;
    }


    public Bargainer(String nameBargainer, BigDecimal money, String dateOfBirth, String phone, String email) {
        this.nameBargainer = nameBargainer;
        this.money = money;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.email = email;

    }

    protected String getNameBargainer() {
        return nameBargainer;
    }

    protected BigDecimal getMoney() {
        return money;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    protected void increaseMoney(BigDecimal fullPrice) {
        money = money.add(fullPrice);
    }

    protected void decreaseMoney(BigDecimal fullPrice) {
        money = money.subtract(fullPrice);
    }
}
