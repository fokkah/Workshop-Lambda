package se.lexicon.data;

import se.lexicon.model.Person;
import se.lexicon.util.PersonGenerator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


/**
 * Create implementations for all methods. I have already provided an implementation for the first method *
 */
public class DataStorageImpl implements DataStorage {

    private static final DataStorage INSTANCE;

    static {
        INSTANCE = new DataStorageImpl();
    }

    private final List<Person> personList;

    private DataStorageImpl() {
        personList = PersonGenerator.getInstance().generate(1000);
    }


    static DataStorage getInstance() {
        return INSTANCE; // Returning the singleton instance
    }

    @Override
    public List<Person> findMany(Predicate<Person> filter) {
        List<Person> result = new ArrayList<>(); // Creating a list to store filtered Person objects
        for (Person person : personList) { // Iterating over each Person object in personList
            if (filter.test(person)) { // Testing if the Person object satisfies the filter predicate
                result.add(person); // Adding the Person object to the result list if it satisfies the predicate
            }
        }
        return result; // Returning the list of filtered Person objects
    }

    @Override
    public Person findOne(Predicate<Person> filter) {

        return null;
    }

    @Override
    public String findOneAndMapToString(Predicate<Person> filter, Function<Person, String> personToString) {
        // TODO: needs completion
        return null;
    }

    @Override
    public List<String> findManyAndMapEachToString(Predicate<Person> filter, Function<Person, String> personToString) {
        // TODO: needs completion
        return null;
    }

    @Override
    public void findAndDo(Predicate<Person> filter, Consumer<Person> consumer) {
        // TODO: needs completion
    }

    @Override
    public List<Person> findAndSort(Comparator<Person> comparator) {
        // TODO: needs completion
        return null;
    }

    @Override
    public List<Person> findAndSort(Predicate<Person> filter, Comparator<Person> comparator) {
        // TODO: needs completion
        return null;
    }
}
