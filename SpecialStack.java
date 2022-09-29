import java.util.Stack;
import java.util.*;

public class SpecialStack{
    static Stack<Integer> st = new Stack<Integer>();
    static Integer minEle = Integer.MAX_VALUE;
    public static void pushEle(int num){
        if(num<minEle) {
            minEle = num;
//            st1.push(minEle);
        }
        st.push(num);

    }
    public static void popEle(){
        if(st.empty())
            System.out.println("Can't pop the element");
        else {
            int top = st.peek();
            if(top==minEle)

            st.pop();
        }
    }
    public static int getMin(){
        if(minEle==Integer.MAX_VALUE) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return minEle;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1 : Push Element");
        System.out.println("2 : Pop Element");
        System.out.println("3 : Get Min Element");
        System.out.println("4 : Exit");
        while(true){
            int n = sc.nextInt();
            switch(n){
                case 1:
                    int num = sc.nextInt();
                    pushEle(num);
                    break;
                case 2:
                    popEle();
                    break;
                case 3:
                    System.out.println(getMin());
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid Choice");
                    break;
            }
        }

    }



}