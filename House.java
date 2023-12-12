public class House extends Listing {
    int num_of_levels;
    int year_of_cons;
    /**
     * @param host_location
     * @param host_id
     * @param listing_area
     * @param type_of_listing
     * @param num_of_levels
     * @param year_of_cons
     */
    public House(String host_location, int host_id, double listing_area, String type_of_listing, int num_of_levels, int year_of_cons){
        super(host_location, host_id, listing_area, type_of_listing);
        this.num_of_levels = num_of_levels;
        this.year_of_cons = year_of_cons;
    }
    @Override 
    public String toString(){
        return "Host_id : " + this.host_id + " Host location : " + this.host_location + "Ttype of listing : " + this.type_of_listing + " Listing area : " + this.listing_area + " Number of levels : " + this.num_of_levels + " Year of construction : " + this.year_of_cons;  }
}
