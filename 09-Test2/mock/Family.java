public class Family {
    Person[] people;
    Family(Person[] people){
        this.people = people;
    }
    public int adults(){
        int counter = 0;
        for (int i = 0;i<people.length;i++) {
            if (people[i].getAge() >= 18){
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        Person[] familyMembers = {
            new Person("Alice", 30),
            new Person("Bob", 35),
            new Person("Charlie", 10)
    };

        Family family = new Family(familyMembers);
        System.out.println(family.adults());
    }
}
