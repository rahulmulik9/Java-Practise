package design_Patterns.solid_Principle.Interfac_Segregation.bad;

//This dao interface defined to support data access using file system
// or database system. So we have added openConnection and openFile for it
// this bad because we have accomodate all operation in single interface.
//when any class implent this method then that class have to implent this method
public interface BadDAOInterface {
    public void openConnection();
    public void createRecord();
    public void openFile();
    public void deleteRecord();
}
