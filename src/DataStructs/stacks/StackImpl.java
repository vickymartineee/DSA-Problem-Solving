package DataStructs.stacks;

public class StackImpl {
    int capacity;
    Integer [] arr;
    int t = -1;

    StackImpl(int size){
        capacity = size;
        arr = new Integer[size];
    }

    public boolean push(int e){
        if(t+1 < capacity){
            arr[t+1] = e;
            t++;
            return true;
        }
        return false;
    }

    public Integer pop(){
        if(t!=-1){
            int result = arr[t];
            arr[t]= null;
            t--;
            return result;
        }
        return null;
    }

    public Integer peek(){
        if(t!=-1){
            return arr[t];
        }
        return null;
    }

    public int size(){
        return t+1;
    }

}
