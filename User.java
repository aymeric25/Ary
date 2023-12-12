 public class User {
    private int user_id;
    private String name;
    private String firstname;

    public User (int user_id, String name, String firstname){
        this.firstname = firstname;
        this.name = name;
        this.user_id = user_id;
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

    public String toString(){
        return "User ID : " + this.user_id + " Name : " + this.name + " Firstname : " + this.firstname;
    }



}
