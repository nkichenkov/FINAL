package lesson25.exercise01.exercise001;

public class GeoDataCloudDataSource implements DataSource<GeoData> {

    @Override
    public GeoData getData() {
        return new GeoData(12, 52.12, 43.98);
    }
}
