class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        if(Math.abs(source[0]-target[0])==Math.abs(source[1]-target[1])) return 1;
        if(Math.abs(source[0]-target[0])%2==Math.abs(source[1]-target[1])%2) return 2;
        return -1;

    }
}