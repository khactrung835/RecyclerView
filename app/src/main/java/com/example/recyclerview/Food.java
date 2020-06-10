package com.example.recyclerview;

public class Food {
    private String Name;
    private String Description;
    private int Image;

    public Food(){}

    public Food(String name, String description, int image) {
        Name = name;
        Description = description;
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}
