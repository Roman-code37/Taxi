public class DistanceService {
    int predict(int landingСost,
                int oneKilometer,
                int costOrderForDiscount,
                int discountPercent,
                int maxDiscount,
                int discount,
                int distance) {
        int costOrder = landingСost + oneKilometer * distance;
        if (costOrder > costOrderForDiscount) {
            discount = costOrder * discountPercent / 100;
            if (discount <= maxDiscount);
        } else
            discount =0;
        int finalyCostOfOrder = costOrder - discount;
        return finalyCostOfOrder;

    }

}