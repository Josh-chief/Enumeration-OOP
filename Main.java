package com.company;

public class Main {

    public static void main(String[] args) {
    Paper paper1=new Paper("karatasi",100,"FourHundred Grams","white","paper","square");
    paper1.paperDetails();

    Pen pen1=new Pen("Biro",10,"50 Grams","Blue",true);
    pen1.penDetails();

    pen1.input();
    pen1.calculate();
        System.out.println(pen1.foo("Mr","Don","Om"));;
    }
}
