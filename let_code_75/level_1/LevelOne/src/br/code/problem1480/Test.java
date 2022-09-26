package br.code.problem1480;

public class Test {
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] ex1 = {1,2,3,4,5};
        int[] ex2 = {2, 4, 5};
        int[] result1 = sol.runningSum(ex1);
        int[] result2 = sol.runningSum(ex2);
        
        for(int numb : result2){
            System.out.print(numb+" ");
        }
        
    }

}
