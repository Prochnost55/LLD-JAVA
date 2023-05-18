package Singleton;

public class EarlyLoadingSingleton {
    // as els is static, and it points to an EarlyLoadingSingleton object it is an early loading singleton.
    // The static variable gets memory only once in the class area at the time of class loading.
    private static EarlyLoadingSingleton els = new EarlyLoadingSingleton();
    private EarlyLoadingSingleton(){}; // make constructor private;
    public static EarlyLoadingSingleton getInstance(){
        return els;
    }
}
