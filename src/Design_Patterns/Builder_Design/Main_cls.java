package Design_Patterns.Builder_Design;

/*
* You want to create a house class
* house have => windows,rooms,kitchen
* also you want house of following parameters
* house=>windows,rooms,kitchen,parking
* someone want house with following parameters
* house => windows, rooms ,kitchen, swiming pool
*
* so you can see here house ..there are some common and some have different parameters
* So we can create builder class of house with common factor and other parameters can be passed as extra

* */




/*
* Create simple class
* Create only getter
* create anothe class as static inside that
* create setter which return the statci class object on each setter
* create constructor in main class which accept static class object
* using this set properties of main class
* please see the User class for better understanding
* */

public class Main_cls {
    public static void main(String[] args) {

        //User.UserBuilde as UserBuilder is static you can access it directly
        //set values of filed
        //call build method to give object of the class
       User ram = new User.UserBuilder()
               .setFirstName("Rahul")
               .setLastName("Mulik")
               .build();


        System.out.println(ram.getFirstName()+" "+ram.getLastName());
    }
}
