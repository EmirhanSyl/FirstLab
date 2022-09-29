package com.blackflower.firstlab;

import java.lang.Math.*;

public class FirstLab {

    public static void main(String[] args) {
        
        //------------------- CALCULATE AREA AND CIRCUMFERENCE OF THE CIRCLE ------------------------------
        double radius = 15f;
        
        System.out.println("The area of the circle is: " + CalculateCircleArea(radius));
        System.out.println("The circumference of the circle is: " + CalculateCircleCircumference(radius));
        
        //------------------- CALCULATE AVARAGE OF A LIST ------------------------------
        int[] numberList = {5, 12, 18};
        System.out.println("The avarage of given list is: " + CalculateAvarage(numberList));
        
        //------------------- SWAP TWO VARIABLE'S VALUES ------------------------------
        SwapVariables(5, 12);
        
        //------------------- FIND LAST DIGIT OF AN INT ------------------------------
        System.out.println("The last digit of given int is " + PrintLastDigitOfInt(154));
        System.out.println("The last digit of given int is " + PrintLastDigitOfIntWithoutUsingMod(154));
        
        //------------------- FIND REVERSE VERSION OF AN INT ------------------------------
        System.out.println("The revers int of given int is " + ReverseInt(154));
    }
    
    public static double CalculateCircleArea(double radius){
        double area;
        area = Math.PI * Math.pow(radius, 2);
        
        return area;
    }
    
    public static double CalculateCircleCircumference(double radius){
        double circumference;
        
        circumference = 2 * Math.PI * radius;
        return circumference;
    }
    
    public static float CalculateAvarage(int[] numberList){
        float avarage;
        
        int sum = 0;
        for (int i = 0; i < numberList.length; i++) {
            sum += numberList[i];
        }
        
        avarage = (float)sum / numberList.length;
        return avarage;
    }
    
    public static void SwapVariables(int firstVal, int secVal){
        int tempVal = firstVal;
        
        firstVal = secVal;
        secVal = tempVal;
        
        System.out.println("Swapped first value " + tempVal + " to " + firstVal);
        System.out.println("Swapped second value " + firstVal + " to " + secVal);
    }
    
    public static void SwapVariablesWithoutTemp(int firstVal, int secVal){
        firstVal = secVal + firstVal;
        secVal = firstVal - secVal;
        firstVal = firstVal - secVal;
        
        System.out.println("Int's are changed! First Value: " + firstVal + "Second Value: " + secVal);
        
    }
    
    public static int PrintLastDigitOfInt(int value){
        int lastDigit;
        
        lastDigit = value % 10;
        
        return lastDigit;
    }
    
    public static int PrintLastDigitOfIntWithoutUsingMod(int value){
        int lastDigit;
        
        int f = (value/10) * 10;
        lastDigit = value - f;
        
        return lastDigit;
    }
    
    public static int ReverseInt(int value){
        int handle = (value / 10) * 10;
        int lastDigit = value - handle;
        
        int newValue = (value - lastDigit) / 10;
        
        int handle2 = (newValue / 10) * 10;
        int middleDigit = newValue - handle2;
        
        int firstDigit = newValue - middleDigit;
        
        return (lastDigit * 100) + (middleDigit * 10) + (firstDigit);
    }
}
