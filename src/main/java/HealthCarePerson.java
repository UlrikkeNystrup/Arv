public abstract class HealthCarePerson {

    //nøgleordet abstract gør at man ikke kan oprette et objekt også kaldet instans af denne klasse.
    // der er ikke nogen d
    //man kan godt have referencenavnet, men ikke oprette et objekt ud fra denne type...
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    //vi undgår "DRY" ved at skrive get og set metoderne her og så arves de i læge og sygeplejerske klassen
}
