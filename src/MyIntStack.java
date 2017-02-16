import java.util.Stack;

/**
 * Created by coag on 16-02-2017.
 */
public class MyIntStack implements IStack {

    private int[] data = new int[5];
    private int size = 0;


    @Override
    public boolean push(int element) {
        if(size >= data.length){
            int[] temp = new int[data.length + 20];
            for(int i = 0; i < size; i++){
                temp[i] = data[i];
            }
            data = temp;
        }
        data[size++] = element;
        return true;
    }

    @Override
    public int pop() {
        if(size > 0){
            return data[--size];
        }
        throw new RuntimeException("Go away, no pop here.");
    }

    @Override
    public int peak() {
        if(size > 0){
            return data[size - 1];
        }
        throw new RuntimeException("Go away, no peak here");
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean clear() {
        if(size == 0){
            return false;
        }
        size = 0;
        return true;
    }
}
