package Day13_Tasks;

public class State {

    private String name;
    private String abbrevation;
    private String politicalParty;
    private String Governor;
    private String senator;
    private int population;


    public State(String name, String abbrevation, String politicalParty, String governor, String senator, int population) {
        this.name = name;
        this.abbrevation = abbrevation;
        this.politicalParty = politicalParty;
        Governor = governor;
        this.senator = senator;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.err.println("must not be null, empty, or blank.");
            System.exit(1);
        }

        this.name =name;
}


    public String getAbbrevation() {
        return abbrevation;
    }

    public void setAbbrevation(String abbrevation) {
        if (abbrevation == null || abbrevation.trim().isEmpty()) {
            System.err.println("must not be null, empty, or blank.");
            System.exit(1);
        }

        this.abbrevation = abbrevation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty == null || politicalParty.trim().isEmpty()) {
            System.err.println("must not be null, empty, or blank.");
            System.exit(1);

    }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return Governor;
    }

    public void setGovernor(String governor) {
        if (governor == null || governor.trim().isEmpty()) {
            System.err.println("must not be null, empty, or blank.");
            System.exit(1);
    }
        Governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if (senator == null || senator.trim().isEmpty()) {
            System.err.println("must not be null, empty, or blank.");
            System.exit(1);
        }

        this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population <= 0 ){
            System.err.println("must be greater than zero.");
            System.exit(1);
        }

        this.population = population;
    }

    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", abbrevation='" + abbrevation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", Governor='" + Governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                '}';
    }
}

