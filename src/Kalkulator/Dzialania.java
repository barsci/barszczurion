package Kalkulator;

public class Dzialania {
    private int a;
    private int b;

    public Dzialania(int a, int b){
        this.a=a;
        this.b=b;
    }

    public int dodaj(){
        return this.a+this.b;
    }

    public int odejmij(){
        return this.a-this.b;
    }
}

