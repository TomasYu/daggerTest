package example.test;

import dagger.BindsInstance;
import dagger.Component;

public class MyApp {


    @Component
    interface MyComponent{
        MyApplication get();
        @Component.Builder
        interface Builder{
            @BindsInstance
            Builder config(Config config);
            MyComponent build();

        }

    }

    public static void main(String[] args) {
        Config config = new Config();
        System.out.println(config);
        MyComponent myComponent = DaggerMyApp_MyComponent.builder().config(config).build();
        myComponent.get().get();

    }
}
