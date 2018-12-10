package priv.lint;

import java.util.ArrayList;
import java.util.List;

public class stack {
//    设计一个栈容器
    private List<Object> list = new ArrayList<>();

//    入栈方法
    public void push(Object o ){
        list.add(o);
    }

//    出栈方法
    public Object pop(){
        int size = list.size();
        Object o = list.get(size - 1);
        list.remove(o);
        return o;
    }

}
