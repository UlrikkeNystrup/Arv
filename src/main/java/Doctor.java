public class Doctor extends HealthCarePerson{
    private String authID;

    @Override //ændringen skal overskrive en anden metode
    public String getName() { //laver en specialisering af getName() metoden i denne underklasse
        return "Dr. " + name;
    }

    @Override
    public String toString() {
        return "Dr. " + name;
    }

}
