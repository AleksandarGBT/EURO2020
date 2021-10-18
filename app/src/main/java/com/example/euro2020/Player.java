package com.example.euro2020;

public class Player {
    private int id;
    private String name;
    private String club;
    private String country;
    private String number;
    private String born;
    private String age;
    private String position;
    private String imageUrl;
    private boolean isExpanded;

    public Player(int id, String name, String club, String country, String number, String born, String age, String position, String imageUrl) {
        this.id = id;
        this.name = name;
        this.club = club;
        this.country = country;
        this.number = number;
        this.born = born;
        this.age = age;
        this.position = position;
        this.imageUrl = imageUrl;
        isExpanded = false;
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

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isExpanded() {
        return isExpanded;
    }

    public void setExpanded(boolean expanded) {
        isExpanded = expanded;
    }

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", club='" + club + '\'' +
                ", country='" + country + '\'' +
                ", number='" + number + '\'' +
                ", born='" + born + '\'' +
                ", age='" + age + '\'' +
                ", position='" + position + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}


