package lesson25.exercise01.exercise001;

public class CachedDataSource<T> implements MutableDataSource<T> {

    private T myData;

    @Override
    public T getData() {
        return myData;
    }

    @Override
    public void saveData(T data) {
        myData = data;
    }
}
