import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(5);
        numbers.add(2);
        numbers.add(3);
        numbers.add(6);
        System.out.println("before" + numbers);


        numbers.forEach(number -> {
            numbers.set(numbers.indexOf(number), number * 2);
                });
        System.out.println("after:" + numbers);

        //System.out.println(numbers.toString());
        //.get() index specific printing
        //numbers.remove()
        //integer.valueOf
        //.clear


        //for each loop

    }
}
