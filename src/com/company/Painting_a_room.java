package com.company;

public class Painting_a_room {
    public static void main(String[] args) {
        final int area_per_gallon = 350;
        double length = 32;
        double width = 40;
        double height = 16;
        int AREA_OF_DOOR = 20;
        int NUMBER_OF_DOOR = 2;
        int AREA_OF_WINDOW = 15;
        int NUMBER_OF_WINDOWS = 4;
        double total_area = length * width + 2 * length * height + 2 * width * height;
        double area_need_to_be_paint = total_area - (NUMBER_OF_DOOR * AREA_OF_DOOR + NUMBER_OF_WINDOWS * AREA_OF_WINDOW);
        int gallons_needed;
        double remainder = area_need_to_be_paint % area_per_gallon;
        double result=area_need_to_be_paint / area_per_gallon;
        if (remainder == 0) {
             result = (int)result;
        } else {
             result = (int)result + 1;
        }
        System.out.println("You will need " +  result + " gallons of paint");
    }
}
