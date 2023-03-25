package com.scaler.lldANDhld.builder;

import com.scaler.lldANDhld.service.CivilEngineer;
import com.scaler.lldANDhld.service.House;
import com.scaler.lldANDhld.service.HouseBuilder;
import com.scaler.lldANDhld.service.IglooHouseBuilder;

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