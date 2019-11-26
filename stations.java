/**********

A PROGAM THAT PROVIDES INFORMATION ABOUT
UNDERGROUND STATIONS IN LONDON AND IF THEY HAVE A TOILET 
AVAILABLE AND WHAT THE COST OF IT IS

***********/

import java.util.*; //impoerting java

import javax.lang.model.util.ElementScanner6;

public class records
{
    public static void main(String[] args) // MAIN
    {
    Station s1 = new Station();
        s1 = setName(s1, "King's Cross");
        s1 = setToilet(s1, false);
        s1 = setCost(s1, 0);

        // NEW STATION BEING CREATED
     
    Station s2 = new Station();
        s2 = setName(s2, "Oxford Circus");
        s2 = setToilet(s2, true);
        s2 = setCost(s2, 10);

        // NEW STATION BEING CREATED

    Station s3 = new Station();
        s3 = setName(s3, "Bakers Street");
        s3 = setToilet(s3, true);
        s3 = setCost(s3, 30);

        // NEW STATION BEING CREATED  

    Station s4 = new Station();
        s4 = setName(s4, "Bakers Street");
        s4 = setToilet(s4, false);
        s4 = setCost(s4, 0);

        // NEW STATION BEING CREATED     

        String answer;
        Scanner scanner; new Scanner(System.in);
        System.out.println("What station do you need to know about?");
        answer = scanner.nextLine();

        String test;
        String pence = "p.";

        if (answer.equals(getName(s1))) //USE IF/ELSE STATEMENTS

            if (getToilet(s1) == true)
            {
                test = " This Station does have a toilet it costs ";
            }
           else 
            {
                test = " This Station does not have a toilet ";
            }          
            if (s1.cost <= 0)
            {
                System.out.println(s1.name + test);
            }

            else 
            {
                System.out.println(s1.name + test + s1.cost + pence);
            }   
        }

        {if (answer.equals(getToilet(s2)))
        {
             if (getToilet(s2) == true)
            { 
                test = " This Station does have a toilet it costs ";
            }
           else 
            {
                test = " This Station does not have a toilet ";
            }          
            if (s2.cost <= 0)
            {
                System.out.println(s2.name + test);
            }

            else 
            {
                System.out.println(s2.name + test + s2.cost + pence);
            }   
        }
    }

    {
    if (answer.equals(getName(s3)))
        {
             if (getToilet(s3) == true)
            { 
                test = " This Station does have a toilet it costs ";
            }
           else 
            {
                test = " This Station does not have a toilet ";
            }          
            if (s3.cost <= 0)
            {
                System.out.println(s3.name + test);
            }

            else 
            {
                System.out.println(s3.name + test + s3.cost + pence);
            }   
        }
        

        else if (answer.equals(getName(s4)))
        {
             if (getToilet(s4) == true)
            { 
                test = " This Station does have a toilet it costs ";
            }
           else 
            {
                test = " This Station does not have a toilet ";
            }          
            if (s4.cost <= 0)
            {
                System.out.println(s4.name + test);
            }

            else 
            {
                System.out.println(s4.name + test + s4.cost + pence);
            }   
        }
else // IF THE ANSWER IS NOT KNOWN
        {
            System.out.println("is" + answer + "Please check the spelling, unable to identify station.");
        }
    } // END MAIN 

    public static String getName(station s)
    {
        return s.name;
    } // METHOD TO RETURN THE NAME OF THE STATION

    public static Boolean getToilet(Station s)
    {
        return s.toilet;
    } // METHOD TO RETURN IF THEIR IS A TOILET PRESENT.

        public static Integer getCost(Station s)
    {
        return s.cost;
    } // METHOD TO RETURN THE COST.

    public static Station setName(Station s, String stationname)
    {
        s.name = stationname;
        return s;
    } // METHOD TO SET STATION NAME.

    public static Station getCost(Station s, int stationcost)
    {
        s.cost = stationcost;
        return s;
    } // METHOD TO SET COST
         
         
} /// END CLASS RECORDS

class Station
{
    String name;
    Boolean toilet;
    int cost;
} // END PROGRAM

