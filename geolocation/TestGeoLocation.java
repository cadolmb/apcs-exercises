class TestGeoLocation {

    public static void main(String[] args) {
        GeoLocation denver = new GeoLocation(39.7392, -104.9903, "Denver");
        GeoLocation paris = new GeoLocation(48.8566, 2.3522, "Paris");

        System.out.println(denver.distanceToGeoLocation(paris));
        System.out.println(paris.distanceToGeoLocation(denver));

        System.out.println("is paris within 5000 km of denver?");
        System.out.println(denver.withinDistance(paris, 5000));
    }

}
