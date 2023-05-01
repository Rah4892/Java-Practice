public class HotelReview {
    public static void main(String[] args) {
        String review = "The stay was nice. Rooms were good. Food could be better. Average service";

        String[] positive = {"nice", "good", "great", "awesome"};
        String[] negative = {"better", "poor", "average"};

        int posCount =0, negCount = 0;
        for(int i = 0;i<positive.length;i++) {
            if(review.toLowerCase().contains(positive[i])){
                posCount++;
            }
        }
        for(int i = 0;i<negative.length;i++) {
            if(review.toLowerCase().contains(negative[i])){
                negCount++;
            }
        }
        if(posCount > negCount)
            System.out.println("Positive");
        else
            System.out.println("Negative");
    }
}
