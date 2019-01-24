public class MinValue {
    public static int Minvalue( int[] args ){

        int MinimumArrayValue =args[0] ;
        for(int i=1; i<args.length;i++){
            if (MinimumArrayValue >args[i]){
                MinimumArrayValue = args[i];
            }
        }
        return MinimumArrayValue;
    }

    public static void main(String[] args){

        int[] ArrayValue = {6,4,2,0,6,-1,-230,1};
        System.out.print(Minvalue(ArrayValue));
    }
}
