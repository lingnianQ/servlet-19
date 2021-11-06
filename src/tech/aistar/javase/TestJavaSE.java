package tech.aistar.javase;

/**
 * 本类用来演示:
 *
 * @author: Q
 * @date: 2021/10/16 2:58 下午
 */
public class TestJavaSE {
    public static void main(String[] args) {
        //1. 变量 - 容器
        //会在JVM中的栈区开辟一块空间[int类型大小 - 4个字节32bit]
        //整数10放入到这个区域中.
        //为了让用户能够访问到这个区域中的数据,所以给这个区域取了一个别名 - i
        int i = 10;
        //访问区域
        System.out.println(i);

        //java中就是使用变量和数据类型来进行定义和存储数据的
        //变量的弊端 - 只能存储1个数据.

        //2. 数组的概念
        //元素类型[] 变量 = ...

        //通过new关键字在jvm的堆空间中开辟一块区域用来存储{1,2,4} - 真实的数组对象
        //将这个对象在堆空间中的内存地址赋值给了一个变量arr,存储在栈
        //习惯称arr是数组对象,实际上它应该叫做引用变量
        //引用变量和对象之间的关系 - 引用变量中存储的是对象在堆空间中的内存地址
        int[] arr = new int[]{1,2,4};
        System.out.println(arr);//[I@330bedb4

        int[] arr1 = new int[]{1,2,4};

        // == 永远比较的是值
        System.out.println(arr == arr1);//false

        //弊端:解决了可以同时存储多个数据,但是这些数据要求是必须是同类型的.

        //现实 - 多,不同类型 - OO
        //对象实际上就是数据在内存中的载体 - 对象就是"特殊的数组"
        User user1 = new User(1,"admin","123",1.75);
        User user2 = new User(1,"admin","123",1.75);

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user1 == user2);//false

        //equals是总的父类Object - 底层是==   ctrl+方法
        System.out.println(user1.equals(user2));//false
    }
}

