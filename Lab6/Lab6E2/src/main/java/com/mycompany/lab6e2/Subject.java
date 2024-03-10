package com.mycompany.lab6e2;

public interface Subject {
    
    void registerObserver(Observer observer);
    
    void removeObserver(Observer observer);
    
    void notifyObservers();
}
