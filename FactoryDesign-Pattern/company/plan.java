package com.company;

abstract class plan {
    protected double rate;
    abstract void getRate();

    public void calculateBill(int units){
        System.out.println("value of the rate is"+ this.rate);
        System.out.println("total bill is "+(units * rate));
    }

}
