public class Local {

    private String ke;
    private String tang;
    public Local(String ke, String tang) {
        this.ke = ke;
        this.tang = tang;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return tang+", "+ke;
    }
    
}
