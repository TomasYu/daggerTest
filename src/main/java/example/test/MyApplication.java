package example.test;

import dagger.Component;

import javax.inject.Inject;

public class MyApplication {

    @Inject
    public MyApplication(){}
    @Inject
    Config config;
    @Inject
    DataServiceFactory dataServiceFactory;

    public void get(){
        DataService dataService = dataServiceFactory.create(config);
        System.out.println(dataService.config);

    }


}
