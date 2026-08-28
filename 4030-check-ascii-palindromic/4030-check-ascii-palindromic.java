class Solution {
    public boolean isPalindromic(String s) {
    //    int decimal=Integer.parseInt(s,16);

        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            int k=(int)ch;
            String bi = String.format("%8s", Integer.toBinaryString(k)).replace(' ', '0');
            sb.append(bi);
        }
        String binary=sb.toString();


        int i=0;
        int j=binary.length()-1;
        while(i<j){
            if(binary.charAt(i)!=binary.charAt(j)) return false;
            i++;
            j--;
        } 
        return true;
    }
}