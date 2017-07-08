package org.ch07.test;

/**
 * Created by Hql on 2017/3/24.
 */
public class InnerTest {

    public void SELECT(){
        System.out.println("hello word");
    }

    //静态代码块 只会在类加载只有一次
    static {
        System.out.println("执行静态代码块");
    }
                    //区别：
    //成员代码块(创建实体才会初始化执行，)
    {
        System.out.println("执行成员代码块");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        //Class.forName("org.ch07.test.InnerTest");
        //InnerTest inner = new InnerTest();
       // InnerTest inner2 = new InnerTest();

        //匿名子类继承
        new InnerTest(){
            {
               SELECT();
            }
        };
    }
}
