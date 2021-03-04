package TestCollection;

public class CJYLinkedlist {
        private Node first;
        private Node last;
        private int size;

        public void add(Object object){//链表添加元素
            Node node = new Node();
            if (first==null){
                node.setObject(object);
                node.setNext(null);
                first = node;
                last  = node;
            }else {
            node.setPrevious(last);
            node.setObject(object);
            node.setNext(null);
            last.setNext(node);
            last = node;
            }
            size++;
        }
        public Node findindex(int index){//找到对象
            Node temp =null;
            if (first!=null){
                temp = first;
                for (int i = 0; i < index; i++) {
                    temp = temp.next;
                }
            }
            return temp;
        }
        public int getsize(){
            return size;
        }
        public void remove(int index) {
            if (index == 0) {
                if (first != null) {
                    first.getNext().setPrevious(null);
                    first = first.getNext();
                    size--;
                }
            }
            if (index==size-1){
                last = last.getPrevious();
                last.setNext(null);
                size--;
            }
            else {
                Node temp = findindex(index);
                if (temp != null) {
                    //Node pre = temp.getPrevious();
                    //Node ne = temp.getNext();
                    temp.getPrevious().setNext(temp.getNext());
                    temp.getNext().setPrevious(temp.getPrevious());
                    size--;
                }
            }
        }

    /**
     * 在指定索引位置添加元素
     * @param index
     * @param obj
     */
        public void add(int index,Object obj){//在指定位置添加元素
            Node temp = findindex(index);//找到索引
            Node temp1 = new Node();
            temp1.setObject(obj);
            temp1.setPrevious(temp.getPrevious());//插入元素的上一个节点指向原来元素的上一个节点
            temp.getPrevious().setNext(temp1);//原来元素的上一个节点的next指向插入元素；
            temp1.setNext(temp);//插入元素的next指向原来的元素
            temp.setPrevious(temp1);//原来元素的上一个节点指向插入元素
            size++;
        }
        public Object get(int index) {
            rangchecked(index);
            Node temp = null;
            if (first==null){

            }else {
                 temp = first;
                  for (int i=0;i<index;i++){
                      temp = temp.getNext();
                  }
                }
                return temp.getObject();
            }
            public void rangchecked(int index){
            if (index<0||index>=size){
                try {
                    throw new Exception();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            }

    public static void main(String[] args) {
        CJYLinkedlist list = new CJYLinkedlist();
        list.add("aaaa");
        list.add("bbbb");
        list.add("cccc");
        list.add("eeee");
        list.remove(3);
        list.add(1,"ddd");
        System.out.println(list.getsize());
        System.out.println(list.get(1));
        System.out.println("heeoolosngkdfl");
    }



}
