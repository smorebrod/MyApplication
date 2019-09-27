package com.example.myapplication;

import java.io.Serializable;

public class student implements Serializable {
    String Name;
    int Id;
    int Age;

    public student(String name, int id, int age){
        this.Name = name;
        this.Age = age;
        this.Id = id;
    }

    public int getAge() {
        return Age;
    }

    public String getName() {
        return Name;
    }

    public int getId() {
        return Id;
    }

    public String Tostring(){
        return ("This is student" + this.getName()+"My age is"+ this.getAge()+ "my id is" + this.Id);
    }
}
