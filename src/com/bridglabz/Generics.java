package com.bridglabz;

public class Generics {
        public static void stringMax(String x,String y,String z){
            String max=x;
            if (y.compareTo(max)>0){
                max=y;
            }
            if (z.compareTo(max)>0){
                max=z;
            }
            System.out.println(max+" is maximum");
        }

        public static void main(String[] args) {
            stringMax("om","Sai","shree");
        }

    }


