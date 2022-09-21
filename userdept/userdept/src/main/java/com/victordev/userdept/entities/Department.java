package com.victordev.userdept.entities;

public class Department {
    private Long id;
    private String name;

    public Department() { //método construtor e gerar os getters e setters;

    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
