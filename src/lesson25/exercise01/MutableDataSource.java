package lesson25.exercise01;

public interface MutableDataSource extends DataSource {

    void saveData(MyData data);
}
