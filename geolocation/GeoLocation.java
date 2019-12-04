public class GeoLocation {

    private double latitude;
    private double longitude;
    private String name;

    public GeoLocation(double latitude, double longitude, String name) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
    }

    public GeoLocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        name = "no name";
    }

    public String name() {
        return name;
    }

    public double latitude() {
        return latitude;
    }

    public double longitude() {
        return longitude;
    }

    public double distanceToGeoLocation(GeoLocation g) {
        double lat1 = latitude*Math.PI / 180.0;
        double lon1 = longitude*Math.PI / 180.0;
        double lat2 = g.latitude()*Math.PI / 180.0;
        double lon2 = g.longitude()*Math.PI / 180.0;
        double dlat = Math.abs(lat1 - lat2);
        double dlon = Math.abs(lon1 - lon2);
        double a = Math.pow(Math.sin(dlat/2), 2) + Math.cos(lat1)*Math.cos(lat2)*Math.pow(Math.sin(dlon/2), 2);
        double c = 2*Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        return 6371 * c;
    }

    public boolean withinDistance(GeoLocation g, int maxdistance) {
        double distance = distanceToGeoLocation(g);
        if (distance <= maxdistance) {
            return true;
        }
        else {
            return false;
        }
    }

}
