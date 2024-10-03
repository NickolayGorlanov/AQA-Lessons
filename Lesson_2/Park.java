import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Park {

    public static class Attraction {
        private String name;
        private LocalDateTime startTime;
        private LocalDateTime endTime;
        private double price;

        public Attraction(String name, LocalDateTime startTime, LocalDateTime endTime, double price) {
            this.name = name;
            this.startTime = startTime;
            this.endTime = endTime;
            this.price = price;
        }


        public String getName() {
            return name;
        }

        public LocalDateTime getStartTime() {
            return startTime;
        }

        public LocalDateTime getEndTime() {
            return endTime;
        }

        public double getPrice() {
            return price;
        }
    }

    private List<Attraction> attractions = new ArrayList<>();


    public void addAttraction(Attraction attraction) {
        attractions.add(attraction);
    }


    public List<Attraction> getAttractions() {
        return attractions; // Return the actual list
    }

    public static void main(String[] args) {
        Park park = new Park();


        LocalDateTime startTime = LocalDateTime.of(2024, 10, 3, 12, 0, 0, 0);
        LocalDateTime endTime = LocalDateTime.of(2024, 10, 3, 14,0,0,0);


        Attraction rollercoaster = new Attraction("Американские горки", startTime, endTime, 1000);
        park.addAttraction(rollercoaster);


        for (Attraction attraction : park.getAttractions()) {
            System.out.println(attraction.getName() + ": " + attraction.getStartTime() + " - " + attraction.getEndTime() + ", цена: " + attraction.getPrice());
        }
    }
}