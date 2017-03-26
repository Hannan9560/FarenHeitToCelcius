package com.example.hannantalukder.farenheittocelcius;

/**
 * Created by Hannan Talukder on 3/27/2017.
 */

public class Calculation {
    private double Fanswer;
    private double Canswer;
    private Farenheit farenheit;
    private Celcious celcious;

    public double getFanswer() {
        return Fanswer;
    }

    public void setFanswer(double fanswer) {
        Fanswer = fanswer;
    }

    public double getCanswer() {
        return Canswer;
    }

    public void setCanswer(double canswer) {
        Canswer = canswer;
    }

    public Farenheit getFarenheit() {
        return farenheit;
    }

    public void setFarenheit(Farenheit farenheit) {
        this.farenheit = farenheit;
    }

    public Celcious getCelcious() {
        return celcious;
    }

    public void setCelcious(Celcious celcious) {
        this.celcious = celcious;
    }
}
