package Singleton;

public class SingleThreadSingleton {
    private static SingleThreadSingleton singleThreadSingleton = null;
    private SingleThreadSingleton(){};
    // declaring private constructor prevents access of constructor from outside.

    // therefore the only way to get an instance of this singleton class is getInstance method
    public static SingleThreadSingleton getInstance(){
        if(singleThreadSingleton == null){
            singleThreadSingleton = new SingleThreadSingleton();
        }

        return singleThreadSingleton;
    }

}
