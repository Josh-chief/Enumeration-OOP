package com.company;

public class Paper extends Stationery {
    protected int weight;
    protected String material;
    protected String shape;
    protected String color;

    Paper(String name,int cost,String weight,String color,String material,String shape){
        super(name, cost, weight);

        this.color=color;
        this.material=material;
        this.shape=shape;
    }
    public void paperDetails(){
        System.out.println("This are the paper details");
        stationeryDetails();
        System.out.println("The color of the paper is :"+color);
        System.out.println("The material is :"+material);
        System.out.println("The shape is  : " +shape);
    }
}
