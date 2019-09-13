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
        double area_need_to_be_paint= total_area-(number_of_door*area_of_door+number_of_windows*area_of_window);
        int gallons_needed;
        double remainder= area_need_to_be_paint%area_per_gallon;
        if(remainder==0){
            int result=area_need_to_be_paint/area_per_gallon}else{int result=area_need_to_be_paint%area_per_gallon+1}
        }
        System.out.print("You will need " + int result + " gallons of paint");
    }
}
