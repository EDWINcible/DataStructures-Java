public class NQueenRec {
    public static void main(String[] args){
        int n = 4;
        int[][] chess = new int[n][n];
        if (calcQ(chess, 0) == false) {
            System.out.print("Solution does not exist");
        }
        else{        
            for(int i=0; i<n; i++){
                for(int j=0;j<n;j++){
                    System.out.print(chess[i][j] + "  ");
                }
                System.out.println("");
            }
        }
    }

    static boolean calcQ(int[][] chess, int col){
        // base 
        if(col>3)
            return true;
        for(int i=0; i<4; i++){
            if(isSafe(chess, i, col)){
                chess[i][col]=1;
                if(calcQ(chess, col+1)==true){
                    return true;
                }
                chess[i][col]=0;
            }
        }
        return false;
    }

    static boolean isSafe(int[][] chess, int row, int col){
        // same row 
        for(int i=0; i<col; i++){
            if(chess[row][i]==1)
                return false;
        }
        // upper left diagonal
        for(int j=row,k=col; j>=0 && k>=0; k--,j--){
            if(chess[j][k]==1)
            return false;
        }
        // lower left diagonal
        for(int l=row,m=col; l<4 && m>=0; l++,m--){
            if(chess[l][m]==1)
            return false;
        }
        return true ;        
    }
}
