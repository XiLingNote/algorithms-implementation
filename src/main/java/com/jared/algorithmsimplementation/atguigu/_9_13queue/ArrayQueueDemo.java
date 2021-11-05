package com.jared.algorithmsimplementation.atguigu._9_13queue;

import java.util.Scanner;

public class ArrayQueueDemo {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(3);
        char key = ' ';
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (true){
            System.out.println("s：展示队列");
            System.out.println("e：退出");
            System.out.println("a：添加数据到队列");
            System.out.println("g：获取队列");
            System.out.println("h：查看队列头部");

            key = scanner.next().charAt(0);
            switch (key){
                case 's':
                    arrayQueue.showQueue();
                    break;
                case 'e':
                    System.exit(0);
                    break;
                case 'a':
                    System.out.println("输入数据");
                    arrayQueue.addQueue(scanner.nextInt());
                    break;
                case 'g':
                    arrayQueue.getQueue();
                    break;
                case 'h':
                    arrayQueue.hearQueue();
                    break;

            }
        }
    }

}
class   ArrayQueue{
    private int maxSize;
    private int front;
    /**
     * 队尾
     */
    private int rear ;
    //存储数据
    private int [] arr;
    public ArrayQueue(int arrMaxSize){
        maxSize = arrMaxSize;
        arr = new int[maxSize];
        //指向队列的头部
        front = -1;
        //指向队列尾部
        rear = -1;

    }
    public boolean isFull(){
        return rear == maxSize - 1;
    }

    public boolean isEmpty(){
        return rear == front;
    }
    /**
     * 添加数据
     */
    public void  addQueue(int n){
        if(isFull()){
            System.out.println("队列已满，不可加入！");
            return;
        }
        arr[++rear] = n;
    }
    public int getQueue(){
        if(isEmpty()){
            System.out.println("队列是空！");
            throw new RuntimeException("空队列");
        }
        int temp = arr[++front];
        arr[front] = 0;
        return temp;
    }
    public void showQueue(){
        if(isEmpty()){
            System.out.println("队列为空！");
        return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %d \n",i,arr[i]);
        }

    }

    public int hearQueue(){
        if(isEmpty()){
            throw new RuntimeException("队列是空，没有数据");
        }
       return arr[front+1];
    }
}
