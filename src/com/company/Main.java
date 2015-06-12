package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int x = 5087368;
        int g = 50;
        double y = 40.23234553;
        long e = 376457200;
        char q = 'r';
        boolean s = true;

        double f = ((double) x / g);
        System.out.println(f);

        //s = (x != g) || (true);

        /*if (x == true && y == true)
        if (x == true) {
        	if (y == true) {

        	}
        }*/

        //ax^2+bx+c=0
        //D = b^2 - 4ac
        //D>0 - 1  D=0 - 2  D<0 - 3
        //x1 = (-b+sqrt(D))/(2a)
        //b^2 b*b  Math.sqrt()
        //1) x1 = 345; x2 = 3446;
        //2) x = 345;
        //3) ?????? ???

//        int i = 0;
//        int k = i++;
//        System.out.println(k);
//        k = ++i;
//        System.out.println(k);
//
//        System.out.println(s);
//
//        int a = 1;
//        int b = 1;
        //int c = 6;
        //c = +3;

//
//        double x1;
//        double x2;
//
//        int d = b*b - 4*a*c;
//
//        if (d>0){
//        	x1 = ((-b+Math.sqrt(d))/(2*a));
//        	x2 = (-b-Math.sqrt(d))/(2*a);
//        	System.out.println("x1=" + x1 + ";" + " x2= " + x2);
//        }else if (d<0){
//        	System.out.println("?????? ???");
//        }else {
//        	x1 = -b/(2*a);
//        	System.out.println("x1=" + x1);
//        }
//
//        if (a <= b && a <= c){
//        	System.out.println(a);
//        }
//        else if (b <= c && b <= a){
//        	System.out.println(b);
//        }
//        else if (c <= b && c <= a){
//        	System.out.println(c);
//        }
//
//        int min = a;
//        if (b<min) {
//        	min = b;
//        	if (c<min){
//        		min = c;
//        	}
//        }
//        System.out.println(min);
//        System.out.println("------------------------------------------------");
//        int[] array = new int[10];
//        for (i=0;i<=9;i++){
//        	array[i] = 9-i;
//        	System.out.println(array[i]);
//        }
        System.out.println("------------------------------------------------1");//??????? ?????? ????????? ?????
        int[] arrayINT = new int[26];
        Random rand = new Random();
        for (int i = 0; i <= 25; i++) {
            arrayINT[i] = rand.nextInt(26);
            System.out.println(arrayINT[i]);
        }
        System.out.println("------------------------------------------------2");// ����������� ��������
        int min = arrayINT[0];
        int i;
        for (i = 1; i <= 8; i++) {
            if (arrayINT[i] < min) {
                min = arrayINT[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("------------------------------------------------3"); // ����������� �����������

        for (x = 0; x < arrayINT.length - 1; x++) {
            for (i = 0; i < arrayINT.length - 1 - x; i++) {
                int x1 = arrayINT[i];
                int x2 = arrayINT[i + 1];
                if (x1 > x2) {
                    arrayINT[i] = x2;
                    arrayINT[i + 1] = x1;
                }
            }
        }
        for (i = 0; i <= 25; i++) {
            System.out.println(arrayINT[i]);
        }
        System.out.println("------------------------------------------------4"); //�������� ��������
        int[] arrayINT1 = new int[5]; // ����� ������
        Random rand1 = new Random();
        for (i = 0; i < 5; i++) {
            arrayINT1[i] = rand1.nextInt(26);
            System.out.println(arrayINT1[i]);
        }
        System.out.println("---------------------");
        int[] arrayINT2 = new int[7]; // ������ ������
        Random rand2 = new Random();
        for (i = 0; i < 7; i++) {
            arrayINT2[i] = rand2.nextInt(12);
            System.out.println(arrayINT2[i]);
        }
        System.out.println("---------------------");
        int l = arrayINT1.length + arrayINT2.length;
        int[] finalArray = new int[l];
        for (i = 0; i < arrayINT1.length; i++) {
            finalArray[i] = arrayINT1[i];
        }
        for (i = 0; i < arrayINT2.length; i++) {
            finalArray[i + arrayINT1.length] = arrayINT2[i];
        }
        for (i = 0; i < finalArray.length; i++) {
            System.out.println(finalArray[i]);
        }
        System.out.println("------------------------------------------------5"); // �������������� ��������

        arrayINT1 = new int[5]; // ������ ������
        rand1 = new Random();
        for (i = 0; i < 5; i++) {
            arrayINT1[i] = rand1.nextInt(26);
            System.out.println(arrayINT1[i]);
        }
        //arrayINT1 = new int[]{5, 3, 18, 25, 4};
        System.out.println("---------------------");
        arrayINT2 = new int[7]; // ������ ������
        rand2 = new Random();
        for (i = 0; i < 7; i++) {
            arrayINT2[i] = rand2.nextInt(12);
            System.out.println(arrayINT2[i]);
       }
        //arrayINT2 = new int[]{5, 10 ,0 ,10 ,5, 10, 5};
        System.out.println("---------------------");
        int count = 0;
        boolean have;
        for (i = 0; i < arrayINT1.length; i++) {
            have = false;
            for (x = 0; x < arrayINT2.length; x++) {
                if (arrayINT1[i] == arrayINT2[x]) {
                    have = true;
                }
            }
            if (!have) {
                count++;
            }
        }
        for (i = 0; i < arrayINT2.length; i++) {
            have = false;
            for (x = 0; x < arrayINT1.length; x++) {
                if (arrayINT2[i] == arrayINT1[x]) {
                    have = true;
                }
            }
            if (!have) {
                count++;
            }
        }
        finalArray = new int[count];
        count = 0;
        for (i = 0; i < arrayINT1.length; i++) {
            have = false;
            for (x = 0; x < arrayINT2.length; x++) {
                if (arrayINT1[i] == arrayINT2[x]) {
                    have = true;
                }
            }
            if (!have) {
                finalArray[count] = arrayINT1[i];
                count++;
            }
        }
        for (i = 0; i < arrayINT2.length; i++) {
            have = false;
            for (x = 0; x < arrayINT1.length; x++) {
                if (arrayINT2[i] == arrayINT1[x]) {
                    have = true;
                }
            }
            if (!have) {
                finalArray[count] = arrayINT2[i];
                count++;
            }
        }

        for (i = 0; i < finalArray.length; i++) {
            System.out.println(finalArray[i]);
        }

    }

}//v2
