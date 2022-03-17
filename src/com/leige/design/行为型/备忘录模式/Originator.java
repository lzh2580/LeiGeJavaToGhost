package com.leige.design.行为型.备忘录模式;

/**
 * 角色类 - 状态是这个角色的状态
 */
public class Originator {

    private int step;

    public void setState(int state){
        this.step = state;
    }

    public int getState(){
        return step;
    }

    public void play(){
        this.step = 1;
    }


    public Memento saveStateToMemento(){
        return new Memento(step);
    }

    public void restore(CareTaker careTaker,int version){
        if(careTaker.hasVersion(version)){
            this.step = careTaker.get(version).getState();
        }else{
            System.out.println("该版本未备份，无法恢复！");
        }
    }

}
