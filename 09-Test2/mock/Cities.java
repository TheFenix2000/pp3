import java.util.Arrays;

public class Cities {
    private String[] cityNames;

    public Cities(String[] cities) {
        this.cityNames = cities;
    }

    public Cities filter(char startingChar) {
        // Filter cities whose names start with the given character
        String[] filteredCities = Arrays.stream(cityNames)
                .filter(city -> city.charAt(0) == startingChar)
                .toArray(size -> new String[size]);

        return new Cities(filteredCities);
    }

    public String cities() {
        // Concatenate city names into a single string
        return String.join("", cityNames);
    }

    public static void main(String[] args) {
        // Example usage
        Cities citiesObject = new Cities(new String[]{"Warszawa", "Sopot", "Kielce", "Szczecin"});
        
        // Filter cities that start with 'S'
        String filteredCities = citiesObject.filter('S').cities();
        
        // Print the concatenated city names
        System.out.println(filteredCities); // Output: "SopotSzczecin"
    }
}
