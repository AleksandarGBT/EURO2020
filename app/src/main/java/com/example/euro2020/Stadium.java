package com.example.euro2020;

public class Stadium {
    private int id;
    private String name;
    private String city;
    private String country;
    private String capacity;
    private String imageUrl;
    private boolean isExpanded;

    public Stadium(int id, String name, String city, String country, String capacity, String imageUrl) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.country = country;
        this.capacity = capacity;
        this.imageUrl = imageUrl;
        isExpanded = false;
    }

    public boolean isExpanded() {
        return isExpanded;
    }

    public void setExpanded(boolean expanded) {
        isExpanded = expanded;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Stadium{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", capacity='" + capacity + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
