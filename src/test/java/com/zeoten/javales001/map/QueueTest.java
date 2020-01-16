package com.zeoten.javales001.map;



import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        //队列
        queueTest();
        //两端队列
        DequeTest();
        //优先级队列：任务调度
        //特点：内部使用了一种 堆的数据结构，是自我调整的二叉树
        //      当向队列中添加/删除元素时，它能快速的找到队列中的最小的元素并且移动到树的根部，而不必花费时间对元素进行排序
        // 对优先级队列进行遍历的时候，无序
        PriorityQueue<String> priorityQueue =new PriorityQueue<>();
        priorityQueue.add("1");
        priorityQueue.add("3");
        priorityQueue.add("5");
        priorityQueue.add("6");
        priorityQueue.add("2");
        priorityQueue.add("4");
        priorityQueue.add("6");
        priorityQueue.add("8");
        //数组或实现Iterable接口的类可以用于for each 语法
        for(String str:priorityQueue){
            System.out.println(str);
        }
        // 数组实现删除
        // TreeMap   构建TreeMap时，指定Comparator
        // 未指定 Comparator时，Key值对象必须实现Comparable接口
        // Comparable 和 Comparator区别？
        // Comparable  比较自身和另一个对象，compareTo
        //Comparator  比较的是传入的两个对象 compare
        // 优先级如何找最小元素：构建时，指定Comparator或者存放元素实现Comparable接口
        PriorityQueue<Task> taskList =new PriorityQueue<>();


    }
    static class Task{
        private int priority;
        private String name;

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Task(){

        }
    }
    private static void queueTest(){
        //队列  QUeue 接口的方法
        Queue<String> queue =new LinkedList();
        // 增删查改
        //add(E)/offer(E)
        //在队列未满的情况下，添加元素到队列的尾部。
        // 如果队列已满  ：add 抛异常  IllegalStateException        @throws IllegalStateException
        //                  offer 返回false         @return {@code true} if the element was added to this queue, else
        //     *         {@code false}
        queue.add("str1");
        queue.add("str2");
        queue.offer("str3");
        queue.offer("str4");

        // 删   remove/poll
        //如果队列为空，删除并返回对头的元素
        // 如果队列为空：remove 会抛出异常   @throws NoSuchElementException if this queue is empty
        //               poll null      @return the head of this queue, or {@code null} if this queue is empty
        // 如果使用 remove 来获取队尾元素时， remove需要判断队列是否为空
        // 1. isEmpty()一般使用这个  它的内部也是第二种方式    2. size()==0
        //如果使用poll 来获取队尾元素时，获取到结果后，判断这个结果是否为null
        System.out.println(queue);
        System.out.println("remove" + queue.remove());

        // 查 ，仅查看对头元素是什么，不删除
        // element/ peek
        // 如果队列不为空，返回队列的头部元素，但不删除
        //队列为空时： element  抛异常    @throws NoSuchElementException
        //             peek   返回null
        //注意：  调用element 方法前判断队列是否为空
        //        调用peek方法前判断队列是否为null
        //queue.clear();//清空队列
        System.out.println(queue);
        System.out.println("对头元素" + queue.peek());
        System.out.println("对头元素" + queue.element());

        //修改，  一般没有修改操作
    }
    private static void DequeTest(){
        //双端队列（两端队列）Deque：增删查改
        Deque<String> deque =new LinkedList<>();

        //增：（queue：add/offer）(deque: addFirst/addLast/offerFirst/offerLast)
        // 队列不为空时，在队头或队尾添加元素
        //如果队列已满：addFirst/addLast 抛异常  IllegalStateException
        //             offerFirst/offerLast    返回  false
        deque.addFirst("st1");
        deque.addFirst("st2");
        deque.addLast("st3");
        deque.addLast("st4");
        //删：（queue：remove/poll）(deque: removerFirst/removerLast/pollFirst/pollLast)
        // 队列不为空时，在队头或队尾删除元素
        //如果队列已满： removerFirst/removerLast 抛异常  @throws NoSuchElementException
        //             pollFirst/pollLast   返回  null
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque.pollFirst());
        //查：（queue：element/peek）(deque: getFirst/getLast/peekFirst/peekLast)
        // 队列不为空时，在队头或队尾查询元素
        //如果队列已满： getFirst/getLast 抛异常  @throws NoSuchElementException
        //              peekFirst/peekLast    返回  null
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekFirst());
    }
}
