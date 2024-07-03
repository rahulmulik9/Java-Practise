package basic.b2_OPPS_Concepts.inheritance.ConeptsFromPrototech.ReaderClass.DataSavingParentChild;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*There are different types of reader in project
 * We want to save all read data in one file
 * So making object of each reader class and getting data we can make list in parent class then only parent class data is required to fetch it*/

class ParentReader {
    List<String> dataLines = new ArrayList<String>();

    public boolean readFile() {
        return true;
    }

    public List<String> getData() {
        return dataLines.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
    }
}

class GLTFReader extends ParentReader {
    public boolean readFile() {
        dataLines.add("GLTF version");
        dataLines.add("Extension Added");
        return true;
    }
}

class StepReader extends ParentReader {
    public boolean readFile() {
        dataLines.add("GLTF version");
        dataLines.add("Extension Added");
        return true;
    }
}


public class Main {
    public static void main(String[] args) {

        ParentReader reader;
        boolean isGLTFFile = true;

        if (!isGLTFFile) {
            reader = new StepReader();
        } else {
            reader = new GLTFReader();
        }
        reader.readFile();
        reader.getData().forEach(System.out::println);

    }
}
