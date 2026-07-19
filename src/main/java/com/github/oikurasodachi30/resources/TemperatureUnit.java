package com.github.oikurasodachi30.resources;

public enum TemperatureUnit {
    
    CELSIUS {
        @Override
        public double toCelsius(double temp) { return temp; }
        
        @Override
        public double fromCelsius(double temp) { return temp; }
    },
    
    FAHRENHEIT {
        @Override
        public double toCelsius(double temp) { return (temp - 32) * 5.0 / 9.0; }
        
        @Override
        public double fromCelsius(double temp) { return (temp * 9.0 / 5.0) + 32; }
    },
    
    KELVIN {
        @Override
        public double toCelsius(double temp) { return temp - 273.15; }
        
        @Override
        public double fromCelsius(double temp) { return temp + 273.15; }
    };

    public abstract double toCelsius(double temp);
    public abstract double fromCelsius(double temp);

    public double convertTo(double amount, TemperatureUnit targetUnit) {
        double tempInCelsius = this.toCelsius(amount);
        return targetUnit.fromCelsius(tempInCelsius);
    }
}
