package starters.abstracts.ex2;
public class Auction{
    public static String [] people =
        {"Joe", "Sue", "Lynn", "Bob"};
    public static String [] conditions =
        {"New", "Like New", "Refurbished", "Used"};

    public static void main(String args[]){
        Auctionable a = new Car("Ford", "Mustang");
        auctionIt(a);
    }
    public static void auctionIt(Auctionable item){
        double highBid = 0;
        String highBidder = null;

        // bidding process
        for(int i = 0; i < people.length; i++){
            double bid = getRandomBid();
            print(people[i] + " bidding " + bid);
            if(bid > highBid){
                highBidder = people[i];
                highBid = bid;
            }
        }
        print("------------");
        print("Auction Results:");
        print("Item: " + item);
        print("Desc: " + item.getDescription());
        int c = item.getCondition();
        print("Condition: " + conditions[c]);
        print("HighBidder: " + highBidder);
        print("HighBid: " + highBid);
    }
    public static double getRandomBid(){
        int x = (int) (Math.random() * 10000);
        double b = x / 100.0;
        return b;
    }
    public static void print(String s){
        System.out.println(s);
    }
}