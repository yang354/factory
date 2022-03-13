package com.jnti.simple;



/*
1       11      1   11
11      21      11  21
21      1211    2   12
1211    111221
111221  312211
 */


import javax.security.auth.Subject;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1.对一个数组进行排序 测试
//        int[] arr = {1,3,5,1,4,6};
//        sort(arr);

        //2.对一个字符串出现次数统计，输出最大的字符
//        String str = "aaaaagfbbbccccc";
//        strCount(str);

        //3.
        String[] strArr1 = {"ab","cd","fd","fs"};
        String[] strArr2 = {"ab","ed","fd","fs"};

        String[] strings = compareTwoArraySame(strArr1, strArr2);
        for (String s:strings){
            System.out.print(s+" ");
        }
    }

    //1.对一个数组进行排序
    public static void sort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void strCount(String str){
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c:chars){
            if (!map.containsKey(c)){
                map.put(c,1);
            } else {
                map.put(c,map.get(c)+1);
            }
        }
        int max=0;
        char maxChar = 0;

        for (Character c:map.keySet()){
            if (max==0){
               max = map.get(c);
               maxChar = c;
            } else {
                if (max<map.get(c)){
                    max = map.get(c);
                    maxChar = c;
                }
            }
        }
        System.out.println(maxChar+" "+max);
    }

    //JAVA比较两个数组中是否存在相同元素，并且取出相同元素（以两个String[]数组为例）
    public static String[] compareTwoArraySame(String[] arr1, String[] arr2) {
        StringBuilder  stringBuilder = new StringBuilder();
        Set<String> stringSet = new HashSet<>();
        for (String s:arr1){
            stringSet.add(s);
        }
        for (String s:arr2){
            if (!stringSet.add(s)){
                stringBuilder.append(s+",");
            }
        }
        if (stringBuilder != null){
            String substring = stringBuilder.substring(0, stringBuilder.length() - 1);
            String[] split = substring.split(",");
            return split;

        } else {
            return null;
        }


//        StringBuilder sameResultTemp = new StringBuilder();
//        String sameResultStr = "";
//        Set<String> testSet = new HashSet<>();
//
//        for (int i = 0; i<arr1.length; i++){
//            testSet.add(arr1[i]);
//        }
//
//        for(int i = 0; i < arr2.length; i++){
//            //boolean flag = testSet.add(arr2[i]);
//            //System.out.println(flag);
//            if(! testSet.add(arr2[i])){//set集合中如果存入的值已经存在则会返回false
//                sameResultTemp.append(arr2[i]+",");
//            }
//        }
//
//        if(sameResultTemp != null){
//            sameResultStr = sameResultTemp.toString();
//            System.out.println(sameResultStr);
//            sameResultStr = sameResultStr.substring(0,sameResultStr.length() -1);
//            return sameResultStr.split(",");//返回相同的String数组
//        }else{
//            return null;//如果没有相同的元素则返回null
//        }
    }


}


