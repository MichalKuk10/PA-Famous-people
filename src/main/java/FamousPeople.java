public abstract class FamousPeople implements CreateArtifact, Shout {
    protected String nationality;
    protected String gender;

    public FamousPeople(String nationality, String gender) {
        this.nationality = nationality;
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public String getGender() {
        return gender;
    }


}