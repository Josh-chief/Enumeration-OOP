package com.company;


import java.util.Scanner;

public class Stationery{
    protected String name;
    protected int cost;
    protected String weight;
    int a,b,sum;
    private String salutation;
    private String firstName;
    private String lastName;

//    protected String salutation;
//    protected String firstName;
//    protected String lastName;

    Stationery(String name,int cost,String weight){
        this.name=name;
        this.cost=cost;
        this.weight=weight;
    }
    public void stationeryDetails(){
        System.out.println("Stationery Name :"+name);
        System.out.println("Stationery cost :"+cost);
        System.out.println("Stationery weight :"+weight);
    }
    public void input() {

        System.out.println("Please Enter Two Numbers");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number :");
        a = scanner.nextInt();
        Scanner  scanner1 = new Scanner(System.in);
        System.out.println("Enter the second number :");
        b = scanner1.nextInt();
    }
        public void calculate() {


            sum =  a + b;
            System.out.println("The sum is :"+ sum);

        }

     public String foo(String salutation,String firstName,String lastName) {
        this.salutation=salutation;
        this.firstName=firstName;
        this.lastName=lastName;


        return salutation+" "+ firstName+" " + lastName;

     }

        }


