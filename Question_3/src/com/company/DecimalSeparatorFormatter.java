package com.company;

import java.util.ArrayList;

public class DecimalSeparatorFormatter implements NumberFormatter{
    @Override
    public String format(int n) {
         String number = "" + n ;
         String formattedNumber = "" ;
         int length = number.length();
        ArrayList<Character> list = new ArrayList<>();

        formattedNumber = formattedNumber + number.substring(0, length % 3 ) + ',';

        int j = 1 ;
        for(int i = length % 3 ; i < length ; i++ , j++){
            formattedNumber = formattedNumber + number.charAt(i);
            if ( j%3 == 0 && j != length - (length % 3)  ) {
                formattedNumber = formattedNumber + ',';
            }
        }

        return formattedNumber;
    }
}
