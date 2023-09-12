public class Candidate {
    private String name;
    private String politicalParty;

    public Candidate(String name, String politicalParty) {
        this.name = name;
        this.politicalParty = politicalParty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        this.politicalParty = politicalParty;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                '}';
    }
}
