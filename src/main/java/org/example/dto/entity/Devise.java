package org.example.dto.entity;

public class Devise {
    public String id;
    public Name name;
    public String code;

    public enum Name{
        Euro, Ariary
    }
}
