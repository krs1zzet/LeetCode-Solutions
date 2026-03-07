class Cashier {

    Map<Integer,Integer> map;
    private int n;
    private int discount;
    private int totalCustomer;

    public Cashier(int n, int discount, int[] products, int[] prices) {
        this.n = n;
        this.discount = discount;
        map = new HashMap<>();
        for(int i = 0 ; i < products.length ; i++){
            map.put(products[i],prices[i]);
        }   
        totalCustomer = 0;
    }
    
    public double getBill(int[] product, int[] amount) {
        totalCustomer++;
        double totalBill =0;
        for(int i = 0 ; i < product.length ; i++){
            totalBill+= amount[i] * map.get(product[i]);
        }
        if(totalCustomer % n ==0){
            return totalBill * (100-discount) / 100;
        }
        return totalBill;
    }
}

/**
 * Your Cashier object will be instantiated and called as such:
 * Cashier obj = new Cashier(n, discount, products, prices);
 * double param_1 = obj.getBill(product,amount);
 */