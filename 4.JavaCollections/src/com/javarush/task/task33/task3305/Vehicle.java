package com.javarush.task.task33.task3305;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, property = "className")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Car.class, name = "Car"),
        @JsonSubTypes.Type(value = Motorbike.class, name = "Motorbike"),
        @JsonSubTypes.Type(value = RacingBike.class, name = "RacingBike"),
})
public abstract class Vehicle {
    protected String name;
    protected String owner;
    protected int age;
}
