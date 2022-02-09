import java.util.List;

public class L064MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int i,j;
        for(i=r-1;i>=0;i--){
            for(j=c-1;j>=0;j--){
                if(i==r-1&&j<c-1)
                    grid[i][j]=grid[i][j]+grid[i][j+1];
                if(i<r-1&&j==c-1)
                    grid[i][j]=grid[i][j]+grid[i+1][j];
                if(i==r-1&&j==c-1)
                    grid[i][j]=grid[i][j];
                if(i<r-1&&j<c-1)
                    grid[i][j]=grid[i][j]+Math.min(grid[i+1][j],grid[i][j+1]);
            }
        }
        return grid[0][0];

    }
    public static void main(String[] args) {
        int[][] case1 ={{1,3,1},{1,5,1},{4,2,1}};

        L064MinimumPathSum solution = new L064MinimumPathSum();
         System.out.println(solution.minPathSum(case1));
    }
}
