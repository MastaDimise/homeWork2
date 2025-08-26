package ru.netology.service;
public class  CustomsService{
    public static final int TAX = 100;
    public static int calculateService(int price, int weight){
        int tax = price / 100 + weight * TAX;
        return  tax;
    }
}



