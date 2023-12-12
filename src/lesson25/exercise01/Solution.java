package lesson25.exercise01;

public class Solution {
    public static void main(String[] args) {
        DataSource repository = new Repository(new CloudDataSource(), new CachedDataSource());

        MyData data = repository.getData();
        print(data.toString());
        data = repository.getData();
        print(data.toString());
    }

    private static void print(Object o) {
        System.out.println(o);
    }
}
