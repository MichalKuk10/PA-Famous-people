public abstract class Mathematician extends FamousPeople {

    public Mathematician(String nationality, String gender){
        super(nationality, gender);
    }

    public String createArtifact() {
        return "0, 1, 2, 3, 4";
    }
}
