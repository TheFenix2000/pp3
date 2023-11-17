import java.time.Year;

public class DrivingLicence {
    private String name;
    private String surname;
    private String postalCode;
    private String city;
    private String licenseNumber;
    private int year;
    private String category;

    DrivingLicence(String name, String surname, String postalCode, String city, String licenseNumber, int year, String category) {
        this.setName(name);
        this.setSurname(surname);
        this.setPostalCode(postalCode);
        this.setCity(city);
        this.setLicenseNumber(licenseNumber);
        this.setYear(year);
        this.setCategory(category);
    }

    public void setName(String name) {
        this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public void setYear(int year) {
        if (year >= 1980 && year <= Year.now().getValue()) {
            this.year = year;
        }
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public int getYear() {
        return year;
    }

    public String getCategory() {
        return category;
    }

    public void display() {
        System.out.println("DRIVING LICENSE"); 
        System.out.println("Personal Info: " + getName() + " " + getSurname()); 
        System.out.println("Adress: " + getCity() + ", " + getPostalCode());
        System.out.println("License Number: " + getLicenseNumber());
        System.out.println("License Issued: " + getYear());
        System.out.println("License Category: " + getCategory());
    }

    @Override
    public String toString() {
        return "Personal Info: " + getName() + " " + getSurname() +
            "\nAdress: " + getCity() + ", " + getPostalCode() +
            "\nLicense Number: " + getLicenseNumber() +
            "\nLicense Issued: " + getYear() +
            "\nLicense Category: " + getCategory();
    }

    public static void main(String[] args) {
        DrivingLicence license = new DrivingLicence("janAnAA", "Kowalski", "30-100", "Warszawa", "234GH786RT", 2021, "B");
        System.out.println(license.toString());
    }
}
