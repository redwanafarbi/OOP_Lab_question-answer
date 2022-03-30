package com.company;

import java.util.ArrayList;

public class ComboLock {
    int input1,input2,input3 ;
     int dialer = 0;
    ArrayList<Integer> myList = new ArrayList<Integer>();

    public ComboLock(int secret1, int secret2, int secret3) {
        this.input1 = secret1;
        this.input2 = secret2;
        this.input3 = secret3;
    }
    public void reset() {
        dialer = 0 ;
    }
    public void turnLeft(int ticks) {
        dialer = dialer - ticks ;
        if(dialer < 0){
            dialer = (dialer + 40 ) %40 ;
        }
        myList.add(dialer);
    }
    public void turnRight(int ticks) {
        dialer = ( dialer + ticks ) % 40 ;
        myList.add(dialer);
    }
    public boolean open() {
        if(myList.get(0) == input1 && myList.get(1) == input2 && myList.get(2) == input3){
            return true ;
        }
        return false ;
    }

}
