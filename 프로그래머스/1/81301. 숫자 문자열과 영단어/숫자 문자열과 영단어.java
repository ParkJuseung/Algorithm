class Solution {
    public int solution(String s) {
        String[] nameArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i=0; i<nameArr.length;i++){
            String num = i + "";
            s= s.replace(nameArr[i], num);
        }
        
        int answer = Integer.parseInt(s);
        return answer;
    }
}