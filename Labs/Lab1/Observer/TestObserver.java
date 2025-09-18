public class TestObserver {

    public static void main (String args[]){
        //instantiate stores
        Store Walmart = new Store("Walmart", 0.1F);
        Store Costco = new Store("Costco", 0.2F);
        Store FreshCo = new Store("FreshCo", 0.3F);

        //instantiate Customers using both constructors
        Customer Ajay = new Customer("Ajay");
        Customer Saad = new Customer("Saad", Costco);
        Customer Sameer = new Customer("Sameer", FreshCo);
        Ajay.register(Walmart);

        //set discounts to notify observers
        Costco.setDiscount("Sale", 0.1F);
        Walmart.setDiscount("Sale", 0.2F);
        FreshCo.setDiscount("Sale", 0.1F);

        //unregister all users
        Ajay.unregister(Walmart);
        Saad.unregister(Costco);
        Sameer.unregister(FreshCo);

        //no one will get updated now as they are removed
        Walmart.setDiscount("Sale", 0.2F);
        Costco.setDiscount("Sale", 0.1F);
        FreshCo.setDiscount("Sale", 0.1F);


    }
}
