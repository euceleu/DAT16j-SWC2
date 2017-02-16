/**
 * Created by coag on 16-02-2017.
 */
public class Run {
    public static void main(String[] args) {
        MyIntStack eduards = new MyIntStack();
        eduards.push(Integer.MAX_VALUE);
        eduards.push(7);
        eduards.push(Integer.MIN_VALUE);
        eduards.push(3);
        eduards.push(666);
        eduards.push(-89);
        System.out.println(eduards.size()); // 6
        System.out.println(eduards.peak()); // -89
        System.out.println(eduards.pop()); // -89
        System.out.println(eduards.pop()); // 666
        System.out.println(eduards.pop()); //3
        System.out.println(eduards.pop()); // -2147483648
        System.out.println(eduards.peak()); //7
        System.out.println(eduards.pop()); //7
        System.out.println(eduards.pop()); //7
    }
}
