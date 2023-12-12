package lesson25.exercise01;

public class CachedDataSource implements MutableDataSource {

    private MyData myData;

    @Override
    public MyData getData() {
        return myData;
    }

    @Override
    public void saveData(MyData data) {
        myData = data;
    }
}
