public class Customer extends Observer {
    //member vars
    String name;
    float discount;

    //constructors
    public Customer(String name){
        this.name = name;
    }
    public Customer(String name, Store favStore){
        this.name = name;
        favStore.register(this);
        this.update(favStore.discount);
    }

    //update customer's discount
    @Override
    void update(float discount){
        this.discount = discount;
        System.out.println(name+"'s updated discount: "+ this.discount);
        System.out.println();
    }

    //register customer to favStore
    void register(Store favStore){
        favStore.register(this);
        this.update(favStore.discount);
    }

    //unregister customer from favStore
    void unregister(Store favStore){
        favStore.unregister(this);
        this.update(0F);
    }

    //better printing
    public String toString(){
        return this.name;
    }


}
