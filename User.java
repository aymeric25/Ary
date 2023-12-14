 public class User {
    protected int user_id;
    private String name;
    private String firstname;
    private String userEmail; 

    public User (int user_id, String name, String firstname, String userEmail){
        this.firstname = firstname;
        this.name = name;
        this.user_id = user_id;
        this.userEmail = userEmail;
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
    public void setUser_id(int u){
        this.user_id = u;
    }

    public void setEmail(String email){
        this.userEmail = email;
    }

    public String toString(){
        return "User ID : " + this.user_id + " Name : " + this.name + " Firstname : " + this.firstname;
    }



}
