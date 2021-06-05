import java.util.ArrayList;
import java.util.List;

public class lesson1 {


    //静态方法
    public static int add(int a,int b)
    {
        return a+b;

    }


    //主程序
    public static void main(String[] args) {

        //静态测试
        System.out.println(lesson1.add(1,2));



        //变化的值、可被赋值的改变
        //例int 不变（即在程序运行前后索引不变）
        //Integer 索引可变，在程序运行前后可变
        //List引用不变，但引用到了可以更改的值
        int a = 1;
        a = 2;
        List<Integer> b = new ArrayList<Integer>();
        b.add(10);
        b.add(20);
        b.add(20);

        Integer d = 20;
        d+=20;


        //final后不可修改
        final int e = 10;
        //e = 20;
        //编译器报错


        //在用final修饰后，List引用不可变
        //但其引用的值仍然可变
        final List<Integer> f = new ArrayList<Integer>();

        f.add(30);


        String s = "a";
        s = s+"b";

        StringBuilder sb = new StringBuilder("a");
        sb.append("b");
        sb.append("c");
        int po = 20;

    }


}
