package com.company;

import java.util.ArrayList;

public class DefaultFormatter implements NumberFormatter{

    @Override
      public String format (int n) {
        return Integer.toString(n);

    }
}
