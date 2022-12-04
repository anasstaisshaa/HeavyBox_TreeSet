package com.JavaCore.Collection;
import java.util.Set;
import java.util.TreeSet;

public class Runner {
    public static void main(String[] args) {
        HeavyBox box1 = new HeavyBox(300);
        HeavyBox box2 = new HeavyBox(123);
        HeavyBox box3 = new HeavyBox(450);

        Set<HeavyBox> treeSet = new TreeSet<>();
        treeSet.add(box1);
        treeSet.add(box2);
        treeSet.add(box3);

        for (HeavyBox box : treeSet) {
            System.out.println(box);
        }
    }

}
