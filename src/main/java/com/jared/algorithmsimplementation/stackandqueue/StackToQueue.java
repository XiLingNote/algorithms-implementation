package com.jared.algorithmsimplementation.stackandqueue;

import java.util.Iterator;
import java.util.Stack;

/**
 * 通过堆
 */
public class StackToQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    /**
     * 入队
     * @param node
     */
    public void push(int node){
        stack1.push(node);
    }
    /**
     * 出队
     * @return
     */
    public int pop(){
        /**
         * 清空stack2
         */
        stack2.isEmpty();
        /**
         * 将栈1插入栈2中
         */
        Iterator<Integer> iterator = stack1.iterator();
        while (iterator.hasNext()){
            stack2.push( iterator.next());
        }
        //弹出栈2的第一个元素清空栈1
        int st =stack2.pop();
        stack1.isEmpty();
        //将栈2中的元素加入到栈1中
        Iterator<Integer> iterator1 = stack2.iterator();
        while (iterator1.hasNext()){
            stack1.push(iterator1.next());
        }
        return  st;
    }

    public static void main(String[] args) {
        StackToQueue stackToQueue = new StackToQueue();
        stackToQueue.push(1);
        stackToQueue.push(10);
        stackToQueue.push(11);
        stackToQueue.push(12);
        System.out.println(stackToQueue.pop());
        System.out.println(stackToQueue.pop());
        System.out.println(stackToQueue.pop());
        System.out.println(stackToQueue.pop());


    }

}
