package com.abcbank.bankapp.service.util;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum TransactionType {
    CREDIT,
    DEBIT;

    @JsonCreator
    public static TransactionType fromValue(String value){
        return getEnumFromString(TransactionType.class, value);
    }

    public static <T extends Enum<T>> T getEnumFromString(Class<T> enumClass, String value) {
        if(enumClass == null) {
            throw new IllegalArgumentException("Enum class cannot be null");
        }
        for(Enum<?> enumValue: enumClass.getEnumConstants()) {
            if(enumValue.toString().equalsIgnoreCase(value)){
                return (T)enumValue;
            }
        }
        //Constructs an error message that indicates all possible values
        StringBuilder errorMessage = new StringBuilder();
        for(Enum<?> enumValue: enumClass.getEnumConstants()) {
            errorMessage.append(enumValue).append(",");
        }
        throw new IllegalArgumentException(value+ " is invalid value, supported values are "+errorMessage.toString() );
    }
}
