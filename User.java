 public class User {
    private static int lastUserId = 0;

    private int user_id;
    private String name;
    private String firstname;
    private String userEmail;

    public User(String name, String firstname, String userEmail) {
        this.user_id = ++lastUserId; // Increment and assign the new user_id
        this.firstname = firstname;
        this.name = name;
        this.userEmail = userEmail;
    }

    public static int getLastUserId() {
        return lastUserId;
    }
    //first we are making getter functions 

    public String getName(){
        return this.name;
    }

    public String getFirstname(){
        return this.firstname;
    }

    public int getUser_id(){
        return this.user_id;
    }

    public String getEmail(){
        return this.userEmail;
    }
    // now we are handling setter functions

    public void setName(String n){
        this.name = n;
    }
    public void setFirstname(String f){
        this.firstname = f;
    }
    
    public void setEmail(String email){
        this.userEmail = email;
    }

    

    public String toString(){
        return " Name : " + this.name + " Firstname : " + this.firstname;
    }



}
