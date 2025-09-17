public class Customer extends Observer {
    //member vars
    String name;
    Store favStore;
    float discount;

    //constructor
    public Customer(String name, Store favStore, float discount){
        this.name = name;
        this.favStore = favStore;
        this.discount = discount;
    }

    @Override
    void update(float discount){
        this.discount = discount;
        System.out.println(name+"'s updated discount: "+ this.discount);
    }

    void register(Store favStore){
        this.favStore.register(this);
    }

    void unregister(Store favStore){
        this.favStore.unregister(this);
    }


}
