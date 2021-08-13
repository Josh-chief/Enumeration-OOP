package com.company;

public class Pen extends Stationery {
    protected boolean inkcolor = false || true;

    Pen(String name,int cost,String weight,String color,boolean inkcolor){
        super(name, cost, weight);
        this.inkcolor=inkcolor;

    }
public void penDetails(){
    System.out.println("This are the details of a pen");
    stationeryDetails();
    if (inkcolor = true){
        System.out.println("This a Pencil");
    }else{
        System.out.println("This a Ballpoint");
    }

   // System.out.println("The pe :"+inkcolor);

}

}


