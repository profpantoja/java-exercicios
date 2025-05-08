import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class testAttorney {
    
    @Test
    public void testTwoAttorneys() {
        
        // Junior Attorney

        String mockedName = "Junior Attorney";
        int mockedSalary = 5000;
        String mockedDescription = "Junior Attorney is an attorney with 1 year of experience.";

        Attorney attorney = new Attorney(
            mockedName,
            mockedSalary,
            1,
            mockedDescription
        );

        // Senior Attorney

        mockedName = "Senior Attorney";
        mockedSalary = 15000;
        mockedDescription = "Senior Attorney is an attorney with 7+ years of experience. Plus, they use to get a huge amount of money monthly.";  

        Attorney attorney2 = new Attorney(
            mockedName,
            mockedSalary,
            1,
            mockedDescription
        );
    }

    @Test
    public void testAttorneyMethods() {

        Attorney attorney = new Attorney(
            "Pleno Attorney", 
            5000, 
            1, 
            "Pleno Attorney yeeeeey"
        );

        // Client: Pantoja
        attorney.representClients("Pantoja");
        attorney.research("Case of Pantoja");
        attorney.analysis("Contract for Pantoja"); 
        attorney.fileDocument("Contract");

        // Client: Vladimir
        attorney.representClients("Vladimir");
        attorney.research("Case of Vladimir");
        attorney.analysis("Contract for Vladimir"); 
        attorney.fileDocument("Contract");

        assertEquals("Name should be Pantoja",
        "Pantoja", attorney.getClients().get(0));

        assertEquals("Research should be Case of Pantoja",
        "Case of Pantoja", attorney.getResearchs().get(0));
        
        assertEquals("Clients size should be 2",
        2, attorney.getClients().size());
        
        assertEquals("Research size should be 2",
         2, attorney.getResearchs().size()
        );

        assertEquals("Docs size should be 2",
        2, attorney.getDocs().size()
       );

    }

}