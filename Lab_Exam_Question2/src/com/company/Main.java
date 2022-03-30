package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scr = new Scanner(System.in);
        ComboLock lock = new ComboLock(scr.nextInt() , scr.nextInt() , scr.nextInt() );

        lock.turnRight(20);
        lock.turnLeft(10);
        lock.turnRight(5);

       if(lock.open()){
           System.out.println("Lock is open");
       }
       else{
           System.out.println("Lock is closed");
       }

    }
}
