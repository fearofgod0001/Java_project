package 인터페이스활용;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Buy buyer = customer;
        buyer.order(); //

        Sell seller = customer;
        seller.sell();
        seller.order();


    }
}
