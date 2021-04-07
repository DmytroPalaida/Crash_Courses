package Homework1;

import java.util.*;

public class SetExample{

    public static void main(String args[]) {
        Set<Integer> set1 = new HashSet<Integer>();
        set1.addAll(Arrays.asList(
                new Integer[]{1, 3, 2, 4, 8, 9, 0}));
        Set<Integer> set2 = new HashSet<Integer>();
        set2.addAll(Arrays.asList(
                new Integer[]{1, 3, 7, 5, 4, 0, 7, 5}));

        // To find union
        Set<Integer> union = new HashSet<Integer>(set1);
        union.addAll(set2);
        System.out.print("Union of the two Set: " + union);

        System.out.println();

        // To find intersection
        Set<Integer> intersect = new HashSet<Integer>(set1);
        intersect.retainAll(set2);
        System.out.print("Intersection of the two Set: " + intersect);


    }


}
