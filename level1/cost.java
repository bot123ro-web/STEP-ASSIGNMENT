public class Main {
    public static void main(String[] args) {
        double costPrice = 129;
        double sellingPrice = 191;
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;

        System.out.println("cost price " + costPrice + " selling price " + sellingPrice +
                           "\the profit " + profit + " percentage" + profitPercentage);
    }
}

