package Design_Patterns.Factory_Design;

public abstract class OperatingSystem {
    private String verson;
    private String year;

    public OperatingSystem(String verson, String year) {
        this.verson = verson;
        this.year = year;
    }

    public String getVerson() {
        return verson;
    }

    public void setVerson(String verson) {
        this.verson = verson;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public abstract void changeVersion(String verson);
    public abstract void changeYear(String year);
}
