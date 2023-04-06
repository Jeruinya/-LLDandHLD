package com.scaler.lldANDhld.behavioral.observer;

public class AnalyticsSender implements OrderPlacedSubscriber, OrderCancelledSubscriber {

    public AnalyticsSender() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    @Override
    public ReturnData announceOrderPlaced() {
        System.out.println("Updating analaytics");
        return  new ReturnData();
        
    }

    @Override
    public void announceOrderCancelled() {

    }
}

// VideoUpdoadHandler -> Publisher
// --------------  KAFKA Queue ----------------
// SpamChecker -> Subscribers
// VideoCompressor -> Subscribers
// CaptionGenerator ->Subscriber