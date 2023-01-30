package com.katlego.weshare.web.App;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "expenses")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate when;
   private String what;
    private double amount;
   private double net_expense=amount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getWhen() {
        return when;
    }

    public void setWhen(LocalDate when) {
        this.when = when;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getNet_expense() {
        return net_expense;
    }

    public void setNet_expense(double net_expense) {
        this.net_expense = net_expense;
    }

    public double getTotal_expenses() {
        return total_expenses;
    }

    public void setTotal_expenses(double total_expenses) {
        this.total_expenses = total_expenses;
    }

    double total_expenses;


}
