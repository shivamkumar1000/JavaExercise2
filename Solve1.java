import java.util.*;
class Solve1{
    public static void main(String[] args){
        List<Float> l = new ArrayList<Float>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            Float n = sc.nextFloat();
            l.add(n);
        }

        Float sum= Float.valueOf(0);
        Iterator<Float> it = l.listIterator();
        while(it .hasNext()){
            sum+=it.next();

        }
        System.out.println(sum);
    }

}