class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int ans[][]=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=grid[i][j];
            }
        }
        while (k-- > 0) {
            int last = ans[m - 1][n - 1];

            for (int i = m - 1; i >= 0; i--) {
                for (int j = n - 1; j >= 0; j--) {
                    if (j > 0) {
                        ans[i][j] = ans[i][j - 1];
                    } else if (i > 0) {
                        ans[i][j] = ans[i - 1][n - 1];
                    }
                }
            }
            ans[0][0] = last;
        }
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < ans.length; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < ans[i].length; j++) {
                row.add(ans[i][j]);
            }
            list.add(row);
        }
        return list;
    }
}