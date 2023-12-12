package lesson25.exercise01.exercise001;


public class Repository<T> implements DataSource<T> {
    private final DataSource<T> cloudDataSource;
    private final MutableDataSource<T> cachedDataSource;

    public Repository(DataSource<T> cloudDataSource, MutableDataSource<T> cachedDataSource) {
        this.cloudDataSource = cloudDataSource;
        this.cachedDataSource = cachedDataSource;
    }

    @Override
    public T getData() {
        T result = cachedDataSource.getData();
        if (result == null) {
            print("no data in cache");
            result = cloudDataSource.getData();
            cachedDataSource.saveData(result);
        } else {
            print("getting from cache");
        }
        return result;
    }

    private void print(Object o) {
        System.out.println(o);
    }

}
