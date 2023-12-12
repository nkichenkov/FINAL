package lesson25.exercise01;

public class Repository implements DataSource {

    private final DataSource cloudDataSource;
    private final MutableDataSource cachedDataSource;

    public Repository(DataSource cloudDataSource, MutableDataSource cachedDataSource) {
        this.cloudDataSource = cloudDataSource;
        this.cachedDataSource = cachedDataSource;
    }

    @Override
    public MyData getData() {
        MyData result = cachedDataSource.getData();
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
