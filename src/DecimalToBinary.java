import java.util.ArrayList;
import java.util.stream.Collectors;


public class DecimalToBinary{

    public ArrayList<Integer> convert(int num) {
        ArrayList<Integer> remList = new ArrayList<>();
        int numLength = Integer.toString(num).length();
        for (int i = 0; i <= numLength + 1; i++) {
            int rem = num % 2;
            remList.add(rem);
            num = num / 2;
        }
        System.out.println(remList.stream().map(Object::toString).collect(Collectors.joining()));
        return remList;
    }

    

    
}