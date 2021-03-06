import java.util.Arrays;
import java.util.Scanner;

public class operate
{
    static Scanner sc = new Scanner(System.in);//定义扫描器
    static int[] arr1;
    static int[] arr2;

    public static void main(String[] args)
    {
        input();
        handle();
        output();
    }

    public static void input()
    {
        System.out.println("Program:input array1.");//提示输入
        System.out.print("User:");//提示输入
        arr1 = array_input();
        /*
        for(int x:arr1)
        {
            System.out.print(x+" ");
        }

         */
    }

    public static int[] array_input()//这是一个不需要先给定数组长度就能直接输入数组的方法
    {
        String Str = sc.nextLine();//输入字符串Str
        Str = Str.trim();//去掉字符串Str首尾的空格
        //System.out.println(Str);
        String[] split_array = Str.split("\\s+");//根据空白字符分割字符串Str
        /*//测试字符串分割效果
        System.out.println("Test output started");
        for(String s:split_array)
        {
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println(split_array.length);//输出字符串分割后子字符串的数量
        System.out.println("Test output end");
        //*/
        int[] array = new int[split_array.length];//定义数组
        for(int i = 0; i < split_array.length; i++)
        {
            array[i] = Integer.parseInt(split_array[i]);//将分割得到的子字符串中的字符类文本转化为数字类文本赋值到数组中
        }
        /*//测试输出数组
        System.out.println("Test output started");
        for(int x:array)
        {
            System.out.print(x+" ");
        }
        System.out.println("\nTest output end");
        //*/
        return array;//返回数组
    }

    public static void handle()
    {
        arr2 = Arrays.copyOfRange(arr1,0,3);
    }

    public static void output()
    {
        for(int x:arr2)
        {
            System.out.print(x+" ");
        }
    }
}
