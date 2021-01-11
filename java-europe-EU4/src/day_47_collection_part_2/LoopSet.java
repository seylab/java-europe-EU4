package day_47_collection_part_2;

import java.util.*;
public class LoopSet {

    public static void main(String[] args) {

        Set<Integer> numsSet = new HashSet<>();

        numsSet.add(50);
        numsSet.add(543);
        numsSet.add(1150);
        numsSet.add(550);
        numsSet.add(570);
        numsSet.add(93);
        numsSet.add(5000);
        numsSet.add(950);

        for (Integer n : numsSet) {

            System.out.print(n + "|");

        }
        System.out.println();
        numsSet.forEach(n -> System.out.print(n + "|"));


    }
}
