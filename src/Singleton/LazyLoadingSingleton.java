package Singleton;

public class LazyLoadingSingleton {
    private static LazyLoadingSingleton lls = null;
    private LazyLoadingSingleton(){};

    public static synchronized LazyLoadingSingleton getInstance(){
        if(lls == null){
            lls = new LazyLoadingSingleton();
        }
        return lls;
    }
}
