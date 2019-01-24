import com.sun.org.apache.xpath.internal.operations.String;

public class DuplicateValueArray {

    public static int DuplicateNumber(int[] args){
        int DubNum = args[0];

        for(int i = 0; i<args.length;i++){
            for (int j = 1 ; j<args.length;i++){
                if (args[j]== args[i]){
                    DubNum = args[j];
                }
            }
        }
        return DubNum;
    }

    public static void main(String[] args){
        int[] array = {2,4,6,7,8,9,0,3,5,2,3};

        System.out.print(DuplicateNumber(array));
    }

}
