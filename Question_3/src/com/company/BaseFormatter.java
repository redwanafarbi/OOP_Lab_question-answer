package com.company;

import java.util.ArrayList;

public class BaseFormatter implements NumberFormatter{

    int base ;
    public BaseFormatter(int n){
        this.base = n ;
    }
    @Override
    public  String format(int n) {
        String number = Integer.toString(n);
        int length = number.length();
        String numberFormatter = "";
        ArrayList<Integer> myList= new ArrayList<>();

        for(int i = 0; n>0 ; i++) {
            int reminder = n % base ;
            myList.add(reminder);
            n = n / base ;
        }
        for(int j=myList.size()-1 ; j>=0 ; j--) {
            if (myList.get(j) >= 10) {
                numberFormatter = numberFormatter + (char) (myList.get(j) + 55);
            } else {
                numberFormatter = numberFormatter + myList.get(j);
            }
        }
        //System.out.println(myList);
        return numberFormatter;
    }
}
