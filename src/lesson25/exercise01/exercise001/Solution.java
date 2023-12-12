package lesson25.exercise01.exercise001;

public class Solution {

    public static void main(String[] args) {
        DataSource<MyData> myDataDataSource = new Repository<>(new CloudDataSource(), new CachedDataSource<>());

        DataSource<GeoData> geoDataDataSource = new GeoRepository(new GeoDataCloudDataSource(), new CachedDataSource<>());

        MyData data = myDataDataSource.getData();
        GeoData geoData = geoDataDataSource.getData();
        print(data.toString());
        print(geoData.toString());
    }

    private static void print(Object o) {
        System.out.println(o);
    }
}
