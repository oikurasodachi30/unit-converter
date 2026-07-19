# Unit Converter

A simple web application that converts between different units of measurement.

## What is it?

This is a Dropwizard-based REST API with a web interface that lets you convert:
- **Length**: Centimeters, Meters, Kilometers
- **Weight**: Milligrams, Grams, Kilograms
- **Temperature**: Celsius, Fahrenheit, Kelvin

## How to run

### Prerequisites
- Java 17+
- Maven

### Steps

1. **Build the project:**
   ```bash
   mvn clean package
   ```

2. **Run the application:**
   ```bash
   java -jar target/unit-converter-1.0-SNAPSHOT.jar server config.yml
   ```

3. **Open in browser:**
   ```
   http://localhost:8080/assets/
   ```

The web interface will load with three conversion panels. Select your values, choose the units, and click "Convert" to see the result.

## Reference

This project is based on the roadmap from: https://roadmap.sh/projects/unit-converter

## Deployed Version

Try the live version here: https://svaze-unit-converter.onrender.com/assets/index.html

**Note:** This is hosted on Render's free tier, so it may take a moment to load on first access.