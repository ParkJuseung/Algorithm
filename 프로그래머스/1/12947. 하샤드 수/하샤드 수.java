class Solution {
    public boolean solution(int x) {
        int num = x;
        int sum = 0;
        for(int i= 1; i<=(int)(Math.log10(x)+1);i++){
            sum += num%10;
            num /= 10;
        }
        
        return (x % sum == 0)? true : false;
    }
}