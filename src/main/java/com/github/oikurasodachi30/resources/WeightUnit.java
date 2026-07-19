package com.github.oikurasodachi30.resources;

public enum WeightUnit {
    MILLIGRAMS(0.000001), // 1 mg = 0.000001 kg
    GRAMS(0.001),         // 1 g = 0.001 kg
    KILOGRAMS(1.0);       // 1 kg = 1 kg

    private final double kilogramsFactor;

    WeightUnit(double kilogramsFactor) {
        this.kilogramsFactor = kilogramsFactor;
    }

    public double convertTo(double weight, WeightUnit targetUnit) {
        // 1. Multiply to get to the base unit
        double weightInKilograms = weight * this.kilogramsFactor;
        // 2. Divide to get from the base unit to the target
        return weightInKilograms / targetUnit.kilogramsFactor;
    }
}
