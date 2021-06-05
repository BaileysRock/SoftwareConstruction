import java.sql.SQLOutput;
import java.util.*;

public class lesson2 {


    public static void main(String[] args) {

//        int a =5;
//        if(a>10)
//        {
//            int b =2;
//        }
//        else
//        {
//            int b =2;
//        }
        // 此时b未被声明,编译器报错
        // b*=3;


        /**
         * 若将else注释掉，此时b将没有定义
         * 即使if里时a<10即满足对定义b时，仍可能存在风险
         * 但将a修饰为final时候，此时final被限定为<10
         * 此时一定会对b定义
         */
//        final int a =5;
//        int b;
//        if(a<10)
//        {
//            b =2;
//        }
////        else
////        {
////            b =4;
////        }
//        b*=3;
//        System.out.println(b);



        Double fahrenheit = 212.0;
        Double celsius = (fahrenheit - 32)*5/9;
        System.out.println(celsius);

        //List
        //若用Arrays.asList创建List，则其长度固定
        List array1 = Arrays.asList("a","b","c");
        System.out.println(array1);
        //使用聚合类时候，保证聚合类的元素类型相同
        //一个String的list
        List <String> list1;
        //一个Integer的list
        List <Integer> list2;
        //一个Double的list
        List <Double> list3;
        //需要初始化后才能赋值
        //List是接口，不能直接实例化
        //若左右类型参数一致
        //则可以自动识别为String
        list1 = new LinkedList<>();


        //set 集合
        //集合没有顺序概念
        //默认使用HashSet
        Set <String> set = new HashSet<>();
        String str1 ="hello";
        String str2 = " ";
        String str3 = "world!";
        set.add(str1);
        set.add(str2);
        set.add(str3);
        System.out.println("set中是否含有"+str1+":"+set.contains(str1));
        Set <String> set2 = new HashSet<>();
        set2.add(str1);
        set2.add(str3);
        System.out.println("set2中是否完全包含set1："+set.containsAll(set2));
        //java也提供了sorted sets
        //可以用Treeset实例化
        SortedSet<Integer> set3 = new TreeSet<>();

        //我们可以用foreach语句来遍历
        for(String string : set)
        {
            System.out.println(string+"\n");
        }





        //map 映射关系
        // 集中常见Map类型
        // HashMap	无序
        // LinkedHashMap 有序 记录插入顺序
        // TreeMap	有序

        Integer i = 10;
        Integer j = 20;
        Integer k = 30;
        String string1 = "helloworld";
        String string2 = "my world!";
        String string3 =  "world!";
        //映射默认使用HashMap
        Map <Integer,String> map = new HashMap();
        //此处先将helloworld加入，却后将helloworld输出
        map.put(i,string1);
        map.put(j,string2);
        map.put(k,string3);
        System.out.println(map.get(i));
        System.out.println(map.containsKey(j));

        //尝试构造有序Map
        Map <Integer,String> map1 = new LinkedHashMap<>();
        map1.put(i,string1);
        map1.put(j,string2);
        map1.put(k,string3);


        //但对于map我们可以根据key对Map遍历
        //通过Map.KeySet方法，获取map中的所有键名

        for(Integer integer:map.keySet())
        {
            System.out.println(map.get(integer));
        }
        System.out.println("\n");
        //通过观察输出可以发现，linkset有顺序的区分
        for(Integer integer:map1.keySet())
        {
            System.out.println(map1.get(integer));
        }

        //实际上for循环中用到了Iterator构造器
        //同时for还提供了数字索引进行迭代
        //不推荐数字索引的迭代，可能引起一些难以发现的bug


        //枚举类型


        //Practice
        //数组声明的变量用List声明(不用初始化)
        List<String> name = new LinkedList<>();
        name.add("hello");
        //此处不可以使用LinkedList<>()初始化
        //String[] names = new LinkedList<String>();


        Map<String,Double> treasures = new HashMap<>();
        String x = "palm";
        treasures.put("beach",25.);
        treasures.put("palm",50.);
        treasures.put("cove",75.);
        treasures.put("x",100.);
        //查看palm对应键值
        treasures.put("palm",treasures.get("palm")+treasures.size());
        treasures.remove("beach");
        double found = 0;

        //遍历键值
        for (double treasure: treasures.values())
        {
            found += treasure;
            System.out.println(treasure);
        }
        System.out.println(found);





    }
}
