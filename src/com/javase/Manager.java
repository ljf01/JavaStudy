package com.javase;

/**
 * @author Jiafeng1.Li
 */
public  class Manager extends Employee{
    private  String address;
    private  int price;
    private  int basePrice;
    public Manager() {
    }

    public Manager(int id, String name, int price, String address) {
        super(id, name, price);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public int getPrice()
    {
        //方法覆盖
        return basePrice + super.getPrice();
    }
}
