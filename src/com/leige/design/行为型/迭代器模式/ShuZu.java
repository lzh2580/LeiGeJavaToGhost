package com.leige.design.行为型.迭代器模式;

/**
 * 固定容量数组实现迭代器功能
 */
public class ShuZu implements MyIterable{
    public String[] shuzu = new String[10];
    public void fuzhi(){
        for (int i = 0; i < shuzu.length; i++) {
            shuzu[i] = String.valueOf(i);
        }
    }
    @Override
    public MyIterator<String> iterator() {
        return new Itr();
    }

    private class Itr implements MyIterator<String> {
        int index = 0;
        @Override
        public boolean hasNext() {
            if(index < shuzu.length){
                return true;
            }
            return false;
        }

        @Override
        public String next() {
            String i = shuzu[index];
            index++;
            return i;
        }
    }
}
