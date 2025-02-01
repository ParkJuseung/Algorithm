class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] word = s.split(" ", -1); // 공백 유지 split

        for (int i = 0; i < word.length; i++) {
            if (!word[i].isEmpty()) { // 빈 문자열이 아닐 때만 처리
                word[i] = word[i].toLowerCase();
                word[i] = word[i].substring(0, 1).toUpperCase() + word[i].substring(1);
            }
            answer.append(word[i]);
            if (i < word.length - 1) {
                answer.append(" "); // 단어 사이의 공백 유지
            }
        }
        return answer.toString();
    }
}
