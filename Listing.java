 public class Listing {
    protected String host_location;
    protected int host_id;
    protected double listing_area;
    protected String type_of_listing;


    /**
     * 
     * @param host_location
     * @param host_id on fera appel à la méthode getUser_iD afin d'allouer une valeur à l'attribut 
     * @param listing_area
     * @param type_of_listing
     */
    public Listing(String host_location, int host_id, double listing_area, String type_of_listing){
        this.host_id = host_id;
        this.host_location = host_location;
        this.type_of_listing = type_of_listing;
        this.listing_area = listing_area;
    }


    public String toString(){
        return "Host_id : " + this.host_id + " Host location : " + this.host_location + "Ttype of listing : " + this.type_of_listing + " Listing area : " + this.listing_area;
    }


}

// condo 

// house 

//co-op 

//on pourrait faire une interface afin de pouvoir utiliser get_userid sur différentes classes qui n'ont pas de lien d'héritage 