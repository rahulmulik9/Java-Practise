package Design_Patterns.Factory_Design;

public class OperatingSystemFactory {
    private OperatingSystemFactory(){}
    public static OperatingSystem getInstance(String type,String version, String year)  {
        switch (type){
            case "Win" :
                return new Windows(version, year);
            case "Lin":
                return new Linux(version,year);
            default:
                throw new IllegalArgumentException("OS not found");
        }
    }
}
