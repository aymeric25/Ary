public class Condo extends Listing {
    private int number_of_units;
    private int num_of_floors;

    /**
     * @param host_location
     * @param host_id
     * @param listing_area
     * @param type_of_listing
     * @param number_of_units
     * @param num_of_floors
     */
    public Condo(String host_location, int host_id, double listing_area, String type_of_listing, int number_of_units, int num_of_floors){
        super(host_location, host_id, listing_area, type_of_listing);
        this.number_of_units = number_of_units;
        this.num_of_floors = num_of_floors;
    }
    public int getNum_of_units(){
        return this.number_of_units;
    }

    public int getNum_of_floors(){
        return this.num_of_floors;
    }
    
    @Override
    public String toString(){
        return "number of units : " + this.number_of_units + " number of floors : " + this.num_of_floors; 
    }
}
