package com.cn.mysix.tools;

/**
 * @ClassName StreamLiu
 * @Description StreamLiu
 * @Author wub
 * @Date 2020/3/16 11:03
 * @Version 1.0
 */


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Steam 是Java8 提出的一个新概念，不是输入输出的 Stream 流，而是一种用函数式编程方式在集合类上进行复杂操作的工具。
 * 简而言之，是以内部迭代的方式处理集合数据的操作，内部迭代可以将更多的控制权交给集合类。
 * Stream 和 Iterator 的功能类似，只是 Iterator 是以外部迭代的形式处理集合数据的操作。
 * <p>
 * 在Java8以前，对集合的操作需要写出处理的过程，如在集合中筛选出满足条件的数据，需要一一遍历集合中的每个元素，
 * 再把每个元素逐一判断是否满足条件，最后将满足条件的元素保存返回。而Stream对集合筛选的操作提供了一种更为便捷的操作，
 * 只需将实现函数接口的筛选条件作为参数传递进来，Stream会自行操作并将合适的元素同样以stream 的方式返回，最后进行接收即可。
 * 原文链接：https://blog.csdn.net/u014519461/article/details/77940693
 */


public class StreamLiu {

    public static void main(String[] args) {

//        collectToList();
//        mapTest();
//        filterTest();
//        flapMapTest();
//        maxTest();
//        reduceSumTest();
    }

    /**
     * 用Stream将字符数组中的字符串取出，放入一个新集合
     */
    public static void collectToList() {

        String[] testStrings = {"java", "react", "angular", "vue"};

        List<String> list = Stream.of(testStrings).collect(Collectors.toList());

        for (int i = 0, length = list.size(); i < length; i++) {
            System.out.println("1:"+list.get(i));
        }
    }

    /**
     * 将一种类型的值映射为另一种类型的值，可以将 Stream 中的每个值都映射为一个新的值
     * 并把 Stream 中每个字符串都转换为大写的形式
     */
    public static void mapTest() {

        String[] testStrings = {"java", "react", "angular", "vue"};

        List<String> list = Stream.of(testStrings).map(test -> test.toUpperCase()).collect(Collectors.toList());

//        list.forEach(test -> System.out.println(test));

        for (String a : list) {
            System.out.println("2:"+a.toUpperCase());
        }
    }

    /**
     * 统计出集合中首字母是“j”的个数
     */
    public static void filterTest(){

        List<String> list = Arrays.asList("java", "react", "angular", "javascript", "vue");

        System.out.println(list.stream().filter(p->p.startsWith("j")).count());
        System.out.println(list.stream().filter(p->p.startsWith("j")).collect(Collectors.joining()));

    }

    /**
     * 将两个流合并为一个流
     */
    public static void flapMapTest(){
        List<Integer> list =(List<Integer>) Stream.of(Arrays.asList(1,2,3,4,5),Arrays.asList(6,7,8,9,10))
                .flatMap(t->t.stream()).collect(Collectors.toList());

        for (Integer a:list
             ) {
            System.out.println(a);
        }
    }

    /**
     *  取出集合中最长的字符串
     */
    public static void maxTest(){

        String [] testStrings ={ "java", "react", "angular", "javascript", "vue" };

        Optional<String> max= Stream.of(testStrings) .max((p1,p2)->Integer.compare(p1.length(),p2.length()));


        System.out.println(max.get());

    }

    /**
     * 求stream元素的总和
     */
    public static void reduceSumTest(){

        int sum=Stream .of(5,6,7,8).reduce(0,(acc,el)->acc+el);
        System.out.println(sum);
    }


}
