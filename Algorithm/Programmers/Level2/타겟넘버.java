class Solution {
    public int solution(int[] numbers, int target) {
        int answer = dfs(numbers,0,0,target);
        return answer;
    }
    private int dfs(int[] num, int depth,int sum, int target) {
        if(depth == num.length) { // 전부 탐색했을때
            if(target == sum) { // 타겟과 sum이 같다면
                return 1;
            } else {
                return 0;
            }
        } else {
            return dfs(num, depth+1, sum+num[depth], target) 
                + dfs(num, depth+1, sum-num[depth], target);
        }
    }
}
