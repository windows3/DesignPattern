package com.zsn.strategy;

import java.util.Arrays;

/**
 * @Author: zsn
 * @Date: 2020/5/4 15:29
 */
public class Main {
    public static void main(String[] args) {
//        int[] a ={9,2,3,5,7,1,4};
//        Cat[] c ={new Cat(3),new Cat(5),new Cat(1)};
//        Sorter sorter=new Sorter();
//        sorter.sort(c);
//        System.out.println(Arrays.toString(c));
        Cat[] c ={new Cat(3),new Cat(5),new Cat(1)};
        SorterComparator<Cat> sorter =new SorterComparator();

        sorter.sort(c,new CatAgeComparator());

        System.out.println(Arrays.toString(c));


    }
}
