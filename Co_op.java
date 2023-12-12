public class Co_op extends Listing {
    private String name_of_company;
    private int num_of_co;
    /**
     * @param host_location
     * @param host_id
     * @param listing_area
     * @param type_of_listing
     * @param name_of_company
     * @param num_of_co
     */
    public Co_op(String host_location, int host_id, double listing_area, String type_of_listing,String name_of_company, int num_of_co){
        super(host_location, host_id, listing_area, type_of_listing);
        this.name_of_company = name_of_company;
        this.num_of_co = num_of_co;
    }

    public String getName_of_company(){
        return this.name_of_company;
    }

    public void setName_of_company(String name){
        this.name_of_company = name;
    }
    
    public int getNum_of_co(){
        return num_of_co;
    }

    public void setNum_of_co(int number){
        this.num_of_co = number;

    }

    public String toString(){
        return "Host location : " + this.host_location + "Host ID : " + this.host_id + "Co-Op area : " + this.listing_area + " Name of the owning company : " + this.name_of_company + "number of Co-OP : " + this.num_of_co; 
    }
}
