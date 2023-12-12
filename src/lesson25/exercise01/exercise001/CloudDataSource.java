package lesson25.exercise01.exercise001;

public class CloudDataSource implements DataSource<MyData> {

    @Override
    public MyData getData() {
        return new MyData(1, "description_1");
    }
}
