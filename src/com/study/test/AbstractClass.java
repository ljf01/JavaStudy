package com.study.test;

/**
 * @author Jiafeng1.Li
 */
public abstract class AbstractClass {
    private final String name;
    private final String address;
    private final int number;

    protected AbstractClass(String name, String address, int number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public void mailCheck() {
        System.out.println("Mailing a check to " + this.name
                + " " + this.address);
    }

    @Override
    public String toString() {
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }

    /**
     * 获取地址信息
     *
     * @return 标准字符
     */
    public abstract String getAddress();

}
