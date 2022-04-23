public class question2 {
    public static Object Equilibrium(int[][] Forces){
        int []forcesSum=new int[3];
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                forcesSum[j]+=Forces[i][j];
            }
        }
        if (forcesSum[0]==0 && forcesSum[1]==0 && forcesSum[2]==0) {
            return "yes";
        }
        else{
            return "no";
        }
    }

}
