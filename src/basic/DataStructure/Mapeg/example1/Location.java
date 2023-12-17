package basic.DataStructure.Mapeg.example1;

public class Location {
    public int locationId;
    public String description;

    @Override
    public String toString() {
        return "Location{" +
                "locationId=" + locationId +
                ", description='" + description + '\'' +
                '}';
    }

    public Location(int locationId, String description) {
        this.locationId = locationId;
        this.description = description;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
