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

    @Override
    void update(float discount){
        this.discount = discount;
        System.out.println(name+"'s updated discount: "+ this.discount);
        System.out.println();
    }

    void register(Store favStore){
        favStore.register(this);
        this.update(favStore.discount);
    }

    void unregister(Store favStore){
        favStore.unregister(this);
        this.update(0F);
    }

    public String toString(){
        return this.name;
    }


}
