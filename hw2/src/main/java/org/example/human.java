package org.example;

public class human extends Actor {
    public human(String name) {
        super(name);
    }

    @Override
    public void setMakeOrder() {

    }

    @Override
    public void setTakeOrder() {

    }

    @Override
    public boolean isMakeOrder() {
        return false;
    }

    @Override
    public boolean isTakeOrder() {
        return false;
    }

    @Override
    String getName() {
        return super .name;
    }
}