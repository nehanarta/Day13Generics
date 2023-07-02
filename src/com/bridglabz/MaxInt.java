package com.bridglabz;

public class MaxInt {
    public static void testMaxNum(Integer x,Integer y,Integer z){
        Integer max=x;
        if (y.compareTo(max)>0){
            max=y;
        }
        if (z.compareTo(max)>0){
            max=z;
        }
        System.out.println("maximum Num===>"+max);
    }

    public static void main(String[] args) {
        System.out.println("welcome to the generics problems");
      testMaxNum(1,20,3);



    }
}
