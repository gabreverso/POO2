package com.mycompany.lab6e2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Acao implements Subject {
    private final List<Observer> observers;
    private double preco;
    private final Random random = new Random();

    Acao() {
        this.observers = new ArrayList<>();
    }

    public void setPreco() {
        this.preco = 50 + (150 - 50) * random.nextDouble();
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update(this.preco);
        }
    }
}
