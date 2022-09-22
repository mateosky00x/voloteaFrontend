package com.speedup.qa.models;

public class FlightData {

    private String iataCodeOrigin;


    public FlightData(String iatacodeOrigin) {
        this.iataCodeOrigin = iatacodeOrigin;
    }
    public String getIataCodeOrigin() {
        return iataCodeOrigin;
    }
}
