package lesson25.exercise01.exercise001;

public interface MutableDataSource<T> extends DataSource<T> {

    void saveData(T data);
}
