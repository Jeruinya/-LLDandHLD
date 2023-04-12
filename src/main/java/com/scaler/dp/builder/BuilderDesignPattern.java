package com.scaler.dp.builder;

import com.scaler.ood.service.CivilEngineer;
import com.scaler.ood.service.House;
import com.scaler.ood.service.HouseBuilder;
import com.scaler.ood.service.IglooHouseBuilder;

class BuilderDesignPattern
{
    public static void main(String[] args)
    {
        HouseBuilder iglooBuilder = new IglooHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(iglooBuilder);
 
        engineer.constructHouse();
 
        House house = engineer.getHouse();
 
        System.out.println("Builder constructed: "+ house);
    }
}