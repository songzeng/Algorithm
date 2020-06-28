package cn.maxzeng.algorithm.Linked;

/**
 * @ClassName MyLinked
 * @Description 实现链表
 * @Author max.zeng
 * @Date 2020/5/15 21:56
 */
public class MyLinked {
    private int value;
    private MyLinked next;
    public void myLinked(int value)
    {
        this.value = value;
    }
    public MyLinked getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }

    public MyLinked add(MyLinked node)
    {
        this.next = node;
        return  this.next;
    }
}
