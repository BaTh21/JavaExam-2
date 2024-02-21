class Sale {
    private Customer customer;
    private String date;
    private double serviceExpense;
    private double productExpense;

    public Sale(Customer customer, String date) {
        this.customer = customer;
        this.date = date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public void displayInfo() {
        System.out.println("=========Data=========");
        System.out.println("Date: " + date);
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Type: " + customer.getType());
        System.out.println("Service Expense: $" + serviceExpense);
        System.out.println("Product Expense: $" + productExpense);
        System.out.println("Bill: $" + getTotalBill());
        System.out.println("Discount: $" + getTotalDiscount());

    }

    public double getServiceDiscount() {
        return serviceExpense * customer.getServiceDiscountRate(customer.getType());
    }

    public double getProductDiscount() {
        return productExpense * customer.getProductDiscountRate(customer.getType());
    }
    public double getTotalDiscount() {
        return getServiceDiscount() + getProductDiscount();
    }

    public double getTotalBill() {
        return serviceExpense + productExpense - getTotalDiscount();
    }
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


}

