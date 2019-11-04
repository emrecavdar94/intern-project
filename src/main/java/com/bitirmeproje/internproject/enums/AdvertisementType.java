package com.bitirmeproje.internproject.enums;

public enum AdvertisementType {

    INTERN(0),
    FULL_TIME(1),
    PART_TIME(2);

    private int intValue;

    AdvertisementType(int intValue){
        this.intValue=intValue;
    }

    public Integer toNumeric(){
        return intValue;
    }
}
