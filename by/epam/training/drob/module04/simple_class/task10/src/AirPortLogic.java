import java.time.LocalTime;

public class AirPortLogic {
    public void getAirlinesByDestination(String dest,AirPort airPort){

        boolean isDest = false;

        for (Airline airline : airPort.getAirlines()){
            if (airline.getDestination().equalsIgnoreCase(dest.trim())){
                System.out.println(airline);
                isDest = true;
            }
        }

        if (!isDest){
            System.out.println("There are no airlines to " + dest + " at the time.");
        }
    }
    public void getAirlinesByDayOfWeek(DayOfWeek day,AirPort airPort){

        boolean isDay = false;

        for (Airline airline : airPort.getAirlines()){
            if (airline.getDayOfWeek().name().equalsIgnoreCase(day.name())){
                System.out.println(airline);
                isDay = true;
            }
        }

        if (!isDay){
            System.out.println("There are no airlines on " + day);
        }
    }
    public void getAirlinesByDayTime(DayOfWeek day, LocalTime time,AirPort airPort){

        boolean isTime = false;

        for (Airline airline : airPort.getAirlines()){
            if (airline.getDayOfWeek().name().equalsIgnoreCase(day.name())){
                if (airline.getDeparture().compareTo(time) > 0){
                    System.out.println(airline);
                    isTime = true;
                }
            }
        }

        if (!isTime){
            System.out.println("There are no airlines on " + day + " after " + time);
        }
    }
}
