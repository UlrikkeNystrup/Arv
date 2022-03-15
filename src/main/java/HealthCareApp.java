import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HealthCareApp {
    //dette er hovedklassen også kaldet kontrolklassen. altså den klasse som laver noget
    public static void main(String[] args) {
        HealthCarePerson healthCarePerson1 = new Nurse(); //laver et objekt af typen nurse
        Doctor doc = new Doctor(); //laver et objekt
        HealthCarePerson nurse = new Nurse();
        /*man kan godt oprette en nurse på denne måde, fordi en nurse er en healthcarepeson. man kan ikke gøre det omvendte
        */
        healthCarePerson1.setName("Johnny");
        doc.setName("Hollywood"); //man kan godt kalde metoderne defineret i HealthCarePerson på objektet doc og nurse
        nurse.setName("Rachel");

        /*Arraylist er mere praktisk at bruge end Arrays. en Array er statisk dvs. har samme størrelse efter oprettelse
        en arrayList kan ændre størrelse
       en List kan godt indeholde en ArrayList
        */
        List<HealthCarePerson> hcps = new ArrayList<>(); //opretter ny ArrayList ud fra interfacet List
        hcps.addAll(Arrays.asList(healthCarePerson1, doc, nurse));

        for(int i=0; i< hcps.size(); i++) {
            System.out.println(hcps.get(i)); //giver hukommelsesplaceringen
            System.out.print(hcps.get(i).getName());  //finder elementet og finder navnet på elementet
            System.out.println(" ," +hcps.get(i).getClass());
        }

       // HealthCarePerson[] hcps = new HealthCarePerson[3];  //man kan tilføje typer af healthcarepersons ind i det her array
        //det er smart at man kan samle flere forskellige typer af data i samme array.
        //så kan man fx printe alle navne på afdelingen
      //  hcps[0] = doc;
      //  hcps[1] = nurse;



    }
}
