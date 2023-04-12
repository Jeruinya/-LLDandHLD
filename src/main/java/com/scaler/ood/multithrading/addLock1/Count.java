package com.scaler.ood.multithrading.addLock1;

public class Count {
    private int value=0;

    public synchronized void increamentValue(int offset){
        this.value += offset;
    }

    public int getValue(){
        return this.value;
    }
}
