interface DiscountRate {
    double getProductDiscountRate(String type);
    double getServiceDiscountRate(String type);

}

public class Main {
    public static void main(String[] args) {
        Customer cus1 = new Customer("Terry", "Normal");
        Customer cus2 = new Customer("Kane", "Premium");
        Customer cus3 = new Customer("Ricky", "Gold");
        Customer cus4 = new Customer("Jade", "Silver");

        Sale sale_cus1 = new Sale(cus1, "2024-02-16");
        Sale sale_cus2 = new Sale(cus2, "2024-02-17");
        Sale sale_cus3 = new Sale(cus3, "2024-02-18");
        Sale sale_cus4 = new Sale(cus4, "2024-02-19");

        sale_cus1.setProductExpense(200);
        sale_cus1.setServiceExpense(140);
        sale_cus1.displayInfo();

        sale_cus2.setProductExpense(300);
        sale_cus2.setServiceExpense(250);
        sale_cus2.displayInfo();

        sale_cus3.setProductExpense(400);
        sale_cus3.setServiceExpense(160);
        sale_cus3.displayInfo();

        sale_cus4.setProductExpense(600);
        sale_cus4.setServiceExpense(190);
        sale_cus4.displayInfo();
    }
}
