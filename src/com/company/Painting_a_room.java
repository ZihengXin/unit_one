package com.company;

public class Painting_a_room {
    public static void main(String[] args){
        final int area_per_gallon=350;
        int length=32;
        int width=40;
        int height=16;
        int area_of_door=20;
        int number_of_door=2;
        int area_of_window=15;
        int number_of_windows=4;
        int total_area= length*width+2*length*height+2*width*height;
        int area_need_to_be_paint= total_area-number_of_door*area_of_door-number_of_windows*area_of_window;
        int gallons_needed= area_need_to_be_paint/area_per_gallon;
        System.out.print("You will need " + gallons_needed + " gallons of paint");
    }
}
