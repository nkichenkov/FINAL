package lesson25.exercise01;

public class CloudDataSource implements DataSource {
    @Override
    public MyData getData() {
        return new MyData(1, "description_1");
    }

}
