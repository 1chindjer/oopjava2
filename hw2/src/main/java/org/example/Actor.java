package org.example;

public abstract class Actor implements ActorBehaviour {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    @Override
    public void setMakeOrder() {
        this.isMakeOrder = true;
    }

    @Override
    public void setTakeOrder() {
        this.isTakeOrder = true;
    }

    @Override
    public boolean isMakeOrder() {
        return this.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return this.isTakeOrder;
    }

    abstract String getName();
}