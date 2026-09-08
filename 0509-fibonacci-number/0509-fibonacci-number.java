class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
        int f_num=0;
        int s_num=1;
        for(int i=0;i<n;i++){
            int t_num=f_num+s_num;
            f_num=s_num;
            s_num=t_num;
        }
        return f_num;
    }
}