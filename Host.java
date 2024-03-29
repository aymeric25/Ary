import java.util.ArrayList;

public class Host extends User {
    private ArrayList <Double> ratings;
    private int num_of_listings;
    private ArrayList <Listing> hosts_listings;
     

    public Host(String name, String firstname,int user_id,String userEmail,ArrayList <Double> ratings, int num_of_listings, ArrayList <Listing> hosts_listings){
        super(name, firstname,userEmail);
        this.num_of_listings = num_of_listings;
        this.ratings = new ArrayList<Double>();
        this.hosts_listings = new ArrayList<Listing>();
    }
    /**
     * @param arraylist de type Double, contenant toutes les notes de notre hôte
     * @return une variable de type double qui correspond à la note moyenne de notre hôte
     */
    /*public double meanRatings(){

    }*/
    /**
     * 
     * @param rating correspond à la nouvelle note que l'on va donné à notre hôte
     * @return néant 
     */
    public void addRating(double rating){
        ratings.add(rating);
    }

    /**
     * 
     * @param listing correspond à la nouvelle propriété que l'on va ratacher à notre hôte 
     */
    public void addListing(Listing listing){ //il va falloir utiliser une fenêtre qui permettra à l'hôte d'ajouter la photo de son bien
        hosts_listings.add(listing);
    }
    /**
     * redéfinition de la méthode toString()
     */
    @Override
    public String toString(){
        return  "number of listings : " + this.num_of_listings + "Host's average rating : " + this.ratings;
    }

    //faire la fonction de calcul de la moyenne 
    //faire un arraylist qui contiendra toutes les notes 
}
