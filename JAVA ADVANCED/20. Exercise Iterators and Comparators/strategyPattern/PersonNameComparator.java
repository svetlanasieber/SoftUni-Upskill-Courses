package strategyPattern;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {


    @Override
    public int compare(Person firstPerson, Person secondPerson) {


        int nameLengthComparingResult = Integer.compare(firstPerson.getName().length(), secondPerson.getName().length());

        if (nameLengthComparingResult == 0) {
            char firstNameSymbol = firstPerson.getName().toUpperCase().charAt(0);// asen -> ASEN -> A
            char secondNameSymbol = secondPerson.getName().toUpperCase().charAt(0);// Asen -> ASEN -> A
            return Character.compare(firstNameSymbol, secondNameSymbol);
        }
        return nameLengthComparingResult;
    }
}
