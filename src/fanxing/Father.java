package fanxing;

/**
 * 泛型父类
 */
public abstract class Father<T1,T2> {
}

/**
 * 子类继承时T1,T2的实现
 * 保留
 1，全部保留2，部分保留
 //不保留
 1.指定具体类型，2.没有类型擦除 Object
 */
//全部保留
    //泛型子类
    class C2<T1,T2> extends Father<T1,T2>{}
//部分保留
    class C3<T2> extends Father<String,T2>{}
//不保留-》按需实现
//具体类型
class C1 extends Father<Integer,String>{

}

