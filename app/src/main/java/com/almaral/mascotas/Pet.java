package com.almaral.mascotas;

public class Pet {
    private String name;
    private String description;
    private String ownerName;
    private String phoneNumber;
    private int imageId;

    public Pet(String name, String description, String ownerName, String phoneNumber, int imageId) {
        this.name = name;
        this.description = description;
        this.ownerName = ownerName;
        this.phoneNumber = phoneNumber;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getImageId() {
        return imageId;
    }
}
