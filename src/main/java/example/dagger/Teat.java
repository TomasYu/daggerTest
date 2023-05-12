package example.dagger;

import dagger.Component;

import javax.inject.Inject;
import javax.inject.Singleton;

public class Teat {


    public static void main(String[] args) {
        CoffeeLogger coffeeLogger = DaggerTeat_ICoffeeLogger.create().get();
        coffeeLogger.log("aaaaa");
        coffeeLogger.log("1111");
        coffeeLogger.logs().forEach(System.out::println);
    }

    @Component()
    @Singleton
    interface  ICoffeeLogger{
        CoffeeLogger get();
    }


}
