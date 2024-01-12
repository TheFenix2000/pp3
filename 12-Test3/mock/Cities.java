import java.util.Arrays;

public class Cities {
    String[] cityNames;
    Cities(String[] array) {
        this.cityNames = array;
    }

    public Cities filter(char character) {
        String[] filteredCities = Arrays.stream(cityNames)
        .filter(city -> city.charAt(0) == character)
        .toArray(String[]::new);

        return new Cities(filteredCities);
    }

    public String cities() {
        return String.join("", cityNames);
    }

    public static void main(String[] args) {
        String[] names = {"Warszawa", "Sopot", "Kielce", "Szczecin"};
        Cities o = new Cities(names).filter('S');
        System.out.println(o.cities());
    }
}
