package Noob;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double l, w, area;
        System.out.print("Enter Length: ");
        l = input.nextDouble();
        System.out.print("Enter Width: ");
        w = input.nextDouble();
        area = 0.5 * l * w;
        System.out.println("Area= "+area);
    }
}
