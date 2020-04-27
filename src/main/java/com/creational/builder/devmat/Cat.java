package com.creational.builder.devmat;



public class Cat {
    private String name;
    private String color;
    private int age;
    private String owner;

    public Cat(Builder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.age = builder.age;
        this.owner = builder.owner;
    }

   public static class Builder{
        private String name;
        private String color;
        private int age;
        private String owner;


        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public Cat build(){
            return new Cat(this);
        }
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", owner='" + owner + '\'' +
                '}';
    }
}
