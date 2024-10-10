public class NormalUser implements User{

    private int id;
    private String name;
    
    /* Constructor of the class
     * @param int ID
     * @param String name
     */
    public NormalUser(int id, String name){
        this.id = id;
        this.name = name;
    }

    //returns ID of the user
    @Override
    public int getID(){
        return this.id;
    }

    //returns name of the user
    @Override
    public String getName(){
        return this.name;
    }
}
