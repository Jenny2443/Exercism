package src.Java;

import java.util.HashMap;

/*
* Instructions
If you want to build something using a Raspberry Pi, you'll probably use resistors. For this exercise, you need to know two things about them:

Each resistor has a resistance value.
Resistors are small - so small in fact that if you printed the resistance value on them, it would be hard to read.
To get around this problem, manufacturers print color-coded bands onto the resistors to denote their resistance values. Each band has a position and a numeric value.

The first 2 bands of a resistor have a simple encoding scheme: each color maps to a single number.

In this exercise you are going to create a helpful program so that you don't have to remember the values of the bands.

These colors are encoded as follows:

Black: 0
Brown: 1
Red: 2
Orange: 3
Yellow: 4
Green: 5
Blue: 6
Violet: 7
Grey: 8
White: 9
The goal of this exercise is to create a way:

to look up the numerical value associated with a particular color band
to list the different band colors
Mnemonics map the colors to the numbers, that, when stored as an array, happen to map to their index in the array: Better Be Right Or Your Great Big Values Go Wrong.

More information on the color encoding of resistors can be found in the Electronic color code Wikipedia article
* */
public class ResistorColor {
    //Con Hashmap, (key,value)
    /*static int colorCode(String color) {
        HashMap<String,Integer> colorValue = new HashMap<String,Integer>();
        colorValue.put("black",0);
        colorValue.put("brown",1);
        colorValue.put("red",2);
        colorValue.put("orange",3);
        colorValue.put("yellow",4);
        colorValue.put("green",5);
        colorValue.put("blue",6);
        colorValue.put("violet",7);
        colorValue.put("grey",8);
        colorValue.put("white",9);

        return colorValue.get(color);
    }*/

    //Con array correspondiente al indice
    static int colorCode(String color){
        int res = 0;
        String[] colorValue = {"black", "brown","red","orange","yellow","green","blue","violet","grey","white"};
        for (int i = 0; i < colorValue.length; i++) {
            if(colorValue[i].equals(color)){
                res = i;
            }
        }
        return res;
    }

    String[] colors() {
        return new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    }

    public static void main(String[] args) {
        //TEST
        System.out.println(colorCode("Black")); //0
        System.out.println(colorCode("White")); //9


    }
}
