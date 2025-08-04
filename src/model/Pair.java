package model;

import java.util.LinkedList;
import java.util.List;

public class Pair {
    String key;
    int value;
    int index;

    public List<String> getL() {
        return l;
    }

    public void setL(List<String> l) {
        this.l = l;
    }

    List<String> l;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Pair(String key, int value, int index){
        this.key = key;
        this.value = value;
        this.index = index;
        this.l = new LinkedList<>();
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
