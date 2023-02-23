package com.hspedu.pkg;//package的作用是声明当前类所在的包,需要放在类的最上面
//一个类中最多只有一个packge

//建议： 需要哪个类就用到哪个类，不建议全部导入
import java.util.Scanner;//表示只会引入java.uitl包下的scanner
import java.util.*;//表示会将Java。util 包下所有类都引入
//import指令 位置放在package的下面,可以有多句且没有顺序要求

public class Import01 {
    public static void main(String[] args) {
        int[] arr = {-1,20,2,13,3};

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ "\t");
        }
    }
}
