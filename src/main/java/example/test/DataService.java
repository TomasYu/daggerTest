package example.test;

import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;

import javax.inject.Inject;


final class DataService {
    public final DataFetcher dataFetcher;
    public final Config config;

    @AssistedInject
    DataService(DataFetcher dataFetcher,  @Assisted Config config) {
        this.dataFetcher = dataFetcher;
        this.config = config;
    }
}

@AssistedFactory
interface DataServiceFactory {
    DataService create(Config config);
}


