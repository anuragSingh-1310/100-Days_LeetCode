public class Water_Bottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;

        while (numBottles >= numExchange) {
            int newBottles = numBottles / numExchange;
            int extra = numBottles % numExchange;

            total += newBottles;
            numBottles = newBottles + extra;
        }

        return total;
    }
}
