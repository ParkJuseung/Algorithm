class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder(s);

        int iterator = 0;

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ') {
                iterator = 0;
                continue;
            }

            if (iterator % 2 == 0) {
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            } else {
                sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
            }
            
            iterator++; 
        }

        return sb.toString();
    }
}
