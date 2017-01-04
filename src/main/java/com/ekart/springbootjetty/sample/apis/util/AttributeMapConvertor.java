package com.ekart.springbootjetty.sample.apis.util;

/**
 * Created by soumith.rk on 03/01/17.
 */
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.AttributeConverter;
import javax.validation.ValidationException;
import java.io.IOException;
import java.util.Map;

public class AttributeMapConvertor implements AttributeConverter<Map<String, String>, String> {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(Map<String, String> attribute) {

        try {
            return MAPPER.writeValueAsString(attribute);
        } catch (JsonProcessingException e) {
            throw new ValidationException("attribute conversion exception");
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public Map<String, String> convertToEntityAttribute(String dbData) {
        Map<String, String> attributeHash = null;
        try {
            attributeHash = MAPPER.readValue(dbData, Map.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return attributeHash;
    }
}