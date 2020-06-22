class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int[][] result=new int[costs.length][2];
        for(int i=0;i<costs.length;i++){
            result[i][0]=i;
            result[i][1]=costs[i][1]-costs[i][0];
        }
        Arrays.sort(result,(a,b)->{
            return a[1]-b[1];
        });
        int sum=0;
        for(int i=0;i<result.length;i++)
        {
            if(i<result.length/2)
                sum+=costs[result[i][0]][1];
            else
                sum+=costs[result[i][0]][0];
        }
        return sum;
        
    }
}
