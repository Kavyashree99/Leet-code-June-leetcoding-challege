class Solution {
    public int calculateMinimumHP(int[][] dungeon) {

        int m = dungeon.length;
        int n = dungeon[0].length;
        
        int[][] health = new int[m][n];
        
        // from bottom to origin
        
        for (int i=m-1;i>=0;i--) {
            for (int j=n-1;j>=0;j--) {
                if (i == m-1 && j == n-1) {
                    /*
                    1. health >= 1
                    2. health + dungeon >=1
                    */
                    health[i][j] = Math.max(1, 1 - dungeon[i][j]);
                } else if (i == m -1) {
                    /*
                    1. health >= 1
                    2. health + dungeon >= health_on_right
                    */
                    health[i][j] = Math.max(1, health[i][j+1] - dungeon[i][j]);
                } else if (j == n-1) {
                    health[i][j] = Math.max(1, health[i+1][j] - dungeon[i][j]);
                } else {
                    /*
                    1.health >=1
                    2. Since health should be min, then health + dungeon >= min(right, down)
                    */
                    health[i][j] = Math.max(1, Math.min(health[i+1][j], health[i][j+1]) - dungeon[i][j]);
                }
            }
        }
        
        return health[0][0];
    }
}
