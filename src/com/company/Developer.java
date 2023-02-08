package com.company;

class Developer implements Printable{
    String name;
    String author;
    Developer(String name, String author){

        this.name = name;
        this.author = author;
    }

    public void print() {

        System.out.printf("%s (%s) \n", name, author);
    }
}
