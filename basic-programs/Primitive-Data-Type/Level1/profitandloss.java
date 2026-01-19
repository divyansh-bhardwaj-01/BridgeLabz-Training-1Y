public class profitandloss{
public static void main(String[] args){
double costpr=129;
double sellingpr=191;
double profit=sellingpr-costpr;
double profitpercentage=(profit/costpr)*100;
 System.out.println(
            "The Cost Price is INR " + costpr + " and Selling Price is INR " + sellingpr + "\n" +
            "The Profit is INR " + profit + " and the Profit Percentage is " + profitpercentage
        );
}
}