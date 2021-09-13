package com.jared.algorithmsimplementation.array;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

/**
 * 斐波那契数列
 * @author jared
 * @date 2019-05-29 13:42
 * @return
 **/
public class FibonacciSequence {
    public static void main(String[] args) {
        List<BigInteger> list = new LinkedList();
        for (int i = 0; i < 10000 ; i++) {
            if(list.size()>3){
                list.remove(0);
            }
            Fibonacci(list);
        }
        System.out.println(list.get(list.size()-1));


    }
    //计算函数并且插入函数
    public static void Fibonacci(List<BigInteger> list){
        //1和2插入1 之外插入
        if(list.size()==0){
            list.add(BigInteger.ZERO);
        }else if(list.size()==1){
            list.add(BigInteger.ONE);
        }
        else
            {
            BigInteger s = list.get(list.size()-1).add(list.get(list.size()-2));
            list.add(s);
        }

    }
    //解法二：循环解决兔子问题
    public BigInteger Fibonacci(int n){
        if (n == 1) {
            return new BigInteger("0");
        }
        BigInteger n1 = new BigInteger("0"),
                n2 = new BigInteger("1"),
                sn = new BigInteger("0");
        for (int i = 0; i < n - 1; i++) {
            sn = n1.add(n2);
            n1 = n2;
            n2 = sn;
        }
        return sn;
    }
    //解法一：递归解决兔子问题
    public  static int f(int n){
        if( n == 1 || n == 2 ){
            return 1;
        }
        else{
            return f( n - 1 )+f( n - 2 );
        }
    }
}
