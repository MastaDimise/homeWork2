package ru.netology.service;
public class  CustomsService{
    public static int calculateService(int price, int weight){
        int tax = price / 100 + weight * 100;
        return  tax;
    }
}



