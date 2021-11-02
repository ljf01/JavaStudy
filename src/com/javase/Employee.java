package com.javase;

/**
 * @author Jiafeng1.Li
 */
public  class  Employee {
    private  int id ;
    private  String name;
    private  int price;

    public Employee() {
    }

    public Employee(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
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

    public int getPrice() {
        return price;
    }

    public final void  setPrice(int price) {
        this.price = price;
    }
    public void change(int num)
    {
        price  = price + num;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
