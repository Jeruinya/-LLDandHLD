package com.scaler.lldANDhld.multithrading.adder2;

public class SharedCount {
    private int value = 0;

    /**
     *
     * @param offset
     */
    public synchronized void increamentValue(int offset){
        value += offset;
    }

    public int getValue() {
        return value;
    }
}
