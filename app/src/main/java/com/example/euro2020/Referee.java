package com.example.euro2020;

public class Referee {
    private int id;
    private String name;
    private String born;
    private String age;
    private String country;
    private String imgUrl;
    private boolean isExpended2;

    public Referee(int id, String name, String born, String age, String country, String imgUrl) {
        this.id = id;
        this.name = name;
        this.born = born;
        this.age = age;
        this.country = country;
        this.imgUrl = imgUrl;
        isExpended2 = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Referee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", born='" + born + '\'' +
                ", age='" + age + '\'' +
                ", country='" + country + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }

    public boolean isExpended2() {
        return isExpended2;
    }

    public void setExpended2(boolean expended2) {
        isExpended2 = expended2;
    }
}
