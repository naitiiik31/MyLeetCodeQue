class Solution {
    public String rearrangeString(String s, char x, char y) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String t = new String(arr);
        return y < x ? t : new StringBuilder(t).reverse().toString();   
    }
}