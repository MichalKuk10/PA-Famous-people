public class Main {

    public static void main(String[] args) {
        FamousPeople[] famousPeople = new FamousPeople[3];

        famousPeople[0] = new Napoleon("French", "Male");
        famousPeople[1] = new Shakespeare("British", "Male");
        famousPeople[2] = new Archimedes("Greek", "Male");
        
        int i = 0;
        while (i < famousPeople.length) {
            System.out.println("Hello, I am a famous person, my nationality is: " + famousPeople[i].getNationality());
            System.out.println("My gender is: " + famousPeople[i].getGender());
            System.out.println("Here is my artifact: " + famousPeople[i].createArtifact());
            System.out.println(famousPeople[i].shout());
            System.out.println(" ");
            i++;
        }
    }
}
