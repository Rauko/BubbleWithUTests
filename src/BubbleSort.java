import java.util.List;

public class BubbleSort {
    public static void main(String[] args){

    }

    public static List<Double> sort(List<Double> input) {
        if(input == null) {
            throw new RuntimeException("Input is NULL");
        }
        for(int i = 0; i < input.size(); i++) {
            int tryAgain = 0; // sorted indicator, if =/= 0 - need run next FOR iteration cycle at lest one more time
            Double buf = 0.0;
            for(int j = 0; j < input.size()-1; j++) {
                //null element check - nulls will be removed from list
                if(input.get(j) == null || (input.get(j+1) == null && j < input.size()-1)) {
                    if (input.get(j) == null){
                        input.remove(j);
                    } else if (input.get(j+1) == null) {
                        input.remove(j+1);
                    } else if (tryAgain == 0) {
                       return input;
                   }
                }
                if (j==input.size()-1) {
                    j=-1;
                    continue;
                }
                if (input.get(j) > input.get(j+1)) {
                    buf = input.get(j);
                    input.set(j,input.get(j+1));
                    input.set(j+1,buf);
                } tryAgain++;
            }
            if(tryAgain == 0) {
                return input;
            }
        }
        return input;
    }
}