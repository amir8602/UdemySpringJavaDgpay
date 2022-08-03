package org.spring_demo.class_training;

import java.util.ArrayList;

public class Main {
    public byte[] trans (short [] input , Short shortMethod ){
        byte [] bytes = new byte[input.length];
        int i = 0;
        for (byte aByte : bytes) {
            aByte = shortMethod.apply(input[i]);
            i++;
        }
        return bytes;

    }

    public static void main(String[] args) {
        //final  effectivly final
        ArrayList<Integer>integers=new ArrayList<>();
        integers.sort((o1, o2) -> (o1.compareTo(o2))+10 );
        integers.sort((o1, o2) -> (o1.compareTo(o2))+100 );
        integers.sort((o1, o2) -> (o1.compareTo(o2))+100000 );

    }
}
