public class MaxValueInArray {

    public static int Maxvalue( int[] args ){

        int MaximumArrayValue =args[0] ;
        for(int i=1; i<args.length;i++){
            if (MaximumArrayValue <args[i]){
                MaximumArrayValue = args[i];
            }
        }
        return MaximumArrayValue;
    }

    public static void main(String[] args){

        int[] ArrayValue = {6,4,2,0,10,-1,-230,1};
        System.out.print(Maxvalue(ArrayValue));
    }
}
