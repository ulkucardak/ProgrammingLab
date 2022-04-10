package group_Studies;

public class ArrayloopWithCondition {
    public static void main(String[] args) {

        // amazon website search results for a product
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};

        int count = 0;
        for (double price : prices) {

            if(price>50){
                count += 1;
            }
        }
        System.out.println("count = " + count);
    }
}
