package com.leige.design.行为型.备忘录模式;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 备忘录 - 负责保存和恢复Originator的状态，Originator的状态是保存在这类里面的。
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }

    public boolean hasVersion(int version){
           if(mementoList.size() > version){
               return true;
           }
       return false;
    }

}
