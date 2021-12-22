package com.jared.algorithmsimplementation.atguigu._30_35stack;
/**
 * 数据结构与算法 30讲-35 栈
 * 先进后出的数据结构
 */
public class ArrayStackDemo {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(10);
        for (int i = 1; i < 12; i++) {
            System.out.println(i);
            arrayStack.push(i);
        }
        arrayStack.iteratorStack();

    }
}

class ArrayStack{

    private int maxSize;
    private int [] stack;
    private int top = -1;

     public ArrayStack ( int maxSize){
         this.maxSize = maxSize;
         this.stack = new int[maxSize];
     }

     public boolean isFull (){
         return  top == maxSize-1;
     }
     public boolean isEmpty(){
         return top == -1;
     }
     public void push (int value){
         if(isFull()){
             System.out.println("stack full ");
             return;
         }
         top ++;
         stack[top] = value;
     }
     public int pop(){
         if(isEmpty()){
             System.out.println("stack empty");
             throw  new RuntimeException();
         }
         int value = stack[top] ;
         stack[top] = 0;
         top--;
         return value;
     }
     public void iteratorStack(){
         if(isEmpty()){
             return;
         }
         while (true){

             int pop = this.pop();
             System.out.println("value " + pop);
             if(this.top ==-1){
                 return;
             }
         }
     }
}
