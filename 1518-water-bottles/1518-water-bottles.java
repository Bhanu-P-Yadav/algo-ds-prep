class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int solution=numBottles;
        while(numBottles>=numExchange){
            int newBottles=numBottles/numExchange;
            int remBottles=numBottles%numExchange;
            solution=solution+newBottles;
            numBottles=newBottles+remBottles;
        }
        return solution;
    }
}