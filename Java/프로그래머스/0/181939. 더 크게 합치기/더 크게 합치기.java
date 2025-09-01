class Solution {
    public int solution(int a, int b) {
        int case1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int case2 = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        return case1 > case2 ? case1 : case2;
    }
}