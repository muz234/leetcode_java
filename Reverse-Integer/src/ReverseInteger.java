public class ReverseInteger {
    public static void main(String [] args){
        System.out.println(Reverse(1534236469
        ));
    }
    public static int Reverse(int x){
        int PrevRevNum = 0;
        int numReverse = 0;
        while(x != 0) {
            int numCurr = x % 10;
            numReverse = numReverse * 10 + numCurr;
             /*
              need to check the reverse x overflows
              (numReverse - numCurr)/10 & PrevRevNum should be same.
              */
            if ((numReverse - numCurr)/10 != PrevRevNum) return 0;

            PrevRevNum = numReverse;
            x = x / 10;

        }
        return numReverse;
    }
    
}
