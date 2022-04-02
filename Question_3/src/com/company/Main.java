package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DefaultFormatter defaultFormatter = new DefaultFormatter();
        System.out.println(defaultFormatter.format(1000));

        DecimalSeparatorFormatter decimalSeparatorFormatter = new DecimalSeparatorFormatter();
        System.out.println(decimalSeparatorFormatter.format(12345324));

        AccountingFormatter accountingFormatter = new AccountingFormatter();
        System.out.println(accountingFormatter.format(-1222));

        BaseFormatter baseFormatter = new BaseFormatter(2);
        System.out.println(baseFormatter.format(15));
    }
}
