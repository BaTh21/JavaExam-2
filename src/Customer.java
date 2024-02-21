class Customer implements DiscountRate {
    private String name;
    private String type;

    public Customer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public double getServiceDiscountRate(String type) {
        switch (type) {
            case "Premium": return 0.20;
            case "Gold": return 0.15;
            case "Silver": return 0.10;
            default: return 0.0;
        }
    }

    @Override
    public double getProductDiscountRate(String type) {
        switch (type) {
            case "Premium": return 0.10;
            case "Gold": return 0.10;
            case "Silver": return 0.10;
            default: return 0.0;
        }
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}

