package Noob;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner th = new Scanner (System.in);
        double celsius, fahrenheit;
        System.out.print("Enter Fahrenheit value: ");
        fahrenheit = th.nextDouble();
        celsius = (fahrenheit - 32) * 5/9;
        System.out.println("Celsius value: "+celsius);
    }
}
