package com.github.oikurasodachi30.resources;

import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.core.MediaType;
import java.util.Map;

@Path("/convert")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
public class UnitConverterResource {

    @POST
    @Path("/length")
    public Map<String, Object> convertLength(
            @FormParam("amount") @NotNull Double amount,
            @FormParam("from") @NotNull LengthUnit fromUnit,
            @FormParam("to") @NotNull LengthUnit toUnit) {
        double result = fromUnit.convertTo(amount, toUnit);
        return Map.of(
                "originalAmount", amount,
                "fromUnit", fromUnit,
                "toUnit", toUnit,
                "result", result
        );
    }

    @POST
    @Path("/weight")
    public Map<String, Object> convertWeight(
            @FormParam("weight") @NotNull Double weight,
            @FormParam("from") @NotNull WeightUnit fromUnit,
            @FormParam("to") @NotNull WeightUnit toUnit) {
        double result = fromUnit.convertTo(weight, toUnit);
        return Map.of(
                "originalAmount", weight,
                "fromUnit", fromUnit,
                "toUnit", toUnit,
                "result", result
        );
    }

    @POST
    @Path("/temperature")
    public Map<String, Object> convertTemperature(
            @FormParam("temperature") @NotNull Double temperature,
            @FormParam("from") @NotNull TemperatureUnit fromUnit,
            @FormParam("to") @NotNull TemperatureUnit toUnit) {
        double result = fromUnit.convertTo(temperature, toUnit);
        return Map.of(
                "originalAmount", temperature,
                "fromUnit", fromUnit,
                "toUnit", toUnit,
                "result", result
        );
    }
}
