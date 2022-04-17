package com.netcracker.chThree;

/*Most countries (with the exception of Canada, Colombia, the Dominican Republic,
Mexico, and the United States) follow the ISO 216 standard for paper sizes. An A0
sheet has dimensions 841 × 1189 millimeters. An A1 sheet is obtained by cutting an
A0 sheet in half along the larger dimension, yielding a 594 × 841 sheet. An A2 sheet
is obtained by cutting it in half again, yielding a 420 × 594 sheet, and so on. Implement a class Sheet whose constructor makes an A0 sheet. Provide a method cutInHalf
that yields a Sheet object of half the size. Also provide methods width, height, and name,
returning the width and height in millimeters, as well as the name (such as "A2").*/

public class Sheet {

    private int height;
    private int width;
    private int name;

    public Sheet() {
        this.height = 1189;
        this.width = 841;
    }

    public Sheet cutInHalf(){
        int h = height;
        height = width;
        width = h/2;
        name++;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Sheet{" +
                "width=" + width +
                ", height=" + height +
                ", A" + name +
                '}';
    }
}
