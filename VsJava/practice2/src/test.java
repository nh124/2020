public class test {
    public static void main(String[] args) {
        int [] numbs = {4,5,8,1,9};
        int target = 10;
        for(int i = 0; i <= numbs.length; i++){
            for(int j = i + 1; j <=  numbs.length; j++){
                if(i + j == target){
                    System.out.println(numbs[i] + " , " + numbs[j]);
                }
            }
        }
    }
}