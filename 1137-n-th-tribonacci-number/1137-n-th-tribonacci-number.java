class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }else if(n==1||n==2){
            return 1;
        }
        int f_num=0,s_num=1,t_num=1;
        for (int i=0;i<n;i++){
            int new_num=f_num+s_num+t_num;
            f_num=s_num;
            s_num=t_num;
            t_num=new_num;
        }
        return f_num;
    }
}