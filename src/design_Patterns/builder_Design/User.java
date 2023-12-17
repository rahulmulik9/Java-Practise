package design_Patterns.builder_Design;

public class User {
    //in this class only getter is present ...setter are in the inner class(UserBuilder)
    private String firstName;
    private String lastName;

    public User(UserBuilder userBuilder){
        //using below class we can set the property
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    //setter are provide here
    public static class UserBuilder{

        private String firstName;
        private String lastName;

        public User build(){
            return new User(this);
        }

        public UserBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
    }
}
