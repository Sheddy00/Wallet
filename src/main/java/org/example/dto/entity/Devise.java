package org.example.dto.entity;

public class Devise {
    public String id;
    public Name name;
    public String code;

    public enum Name{
        Euro, Ariary
    }

    public String getId() {
        return id;
    }

    public Name getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Devise(String id, Name name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }
}
