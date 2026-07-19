package com.github.oikurasodachi30.resources;

public enum LengthUnit {
    CENTIMETERS(100.0),
    METERS(1.0),
    KILOMETERS(0.001);

    private final double metersFactor;

    LengthUnit(double metersFactor) {
        this.metersFactor = metersFactor;
    }

    public double convertTo(double length, LengthUnit targetUnit) {
        double lengthInMeters = length * this.metersFactor;
        return lengthInMeters * targetUnit.metersFactor;
    }
}

