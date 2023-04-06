package com.scaler.lldANDhld.adapter;

import com.scaler.lldANDhld.adapter.thirdparty.YesBankAPI;

public class YesBankAPIAdapter implements BankAPIAdapter {
    private YesBankAPI yesBankAPI = new YesBankAPI();

    @Override
    public double getBalance(String accountNumber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }
}