package br.code.problem724;

public class Test {
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] test1 = {-1,-1,0,1,1,0};
        
        System.out.println(solution.pivotIndex(test1));

        SolutionOptimal solutionOptimal = new SolutionOptimal();
        System.out.println(solutionOptimal.pivotIndex(test1));
    }
}
