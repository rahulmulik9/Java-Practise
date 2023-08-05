package Design_Patterns.Prototype_Desing;
/*
* Prototype allows us to hide the complexity of making new instances from the client.
* The concept is to copy an existing object rather than creating a new instance from scratch*/

/*
* Use clonable interface
* override clone method
*When this method is used
* Suppose object atking longer time to create and craeting again other object will also take time ..at that time we can use this
*
* */
public class Main {
    public static void main(String[] args) {

        User user1= new User("Rahul","rahulmulik@gmail.com");



        try {
          User user2 = (User)user1.clone();
            System.out.println(user2.getName()+""+user2.getEmail());
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }


    }
}
