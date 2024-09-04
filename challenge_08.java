package challenge_08;

import java.util.*;

public class challenge_08 {


    public static void main(String[] args) {
        /*
        1. Create a shopping list with Array and print the values
         */
//       Arr();

       /*
       2. Create a wishlist for christmas with ArrayList and print the values.
        */
//        ChristmasWishlist();

        /*
        3. Create
        ○ 2 empty ArrayLists: studentList and graduateStudentList
        ○ populate studentList with 10 students
        ○ copy values from studentList to graduateStudentList
        ○ iterate through graduateStudentList and print each graduated student
         */
//        StudentList();

        /*
        4. Given an array of 10 integers, count how many of them are even numbers and how many are odd. Print out both counts.
       */
//        EvenOddNumbers();
       /*
        5. Create an ArrayList that stores city names. Add at least five city names initially. Then, prompt the user to add a city name. If the city name is
        already in the list, display a message saying it's a duplicate; otherwise, add it to the list.
       */
//        CityList();

        /*
        6. Given a LinkedList storing student names, write a program that checks if a particular student name exists in the list. If it does, remove that
        name from the list
         */
//        StudentNewList();

        /*
        7. Create an ArrayList containing names of fruits. Implement a custom sorting mechanism to arrange them in descending order based on their
        length. If two fruits have the same length, sort them in alphabetical order.
        */
//        FruitSorting();
        /*
        8. In an array of strings representing movie titles, implement a linear search method to find whether a given movie title exists. If it does, print
        out its position in the array.
        */
        MovieSearch();

        /*
        9.Accept a string representation of a binary number, e.g., "1011". Convert this string into an Integer using the Integer wrapper class and the
        method that parses binary. Print out the decimal representation of this number.
         */

        /*
        10. Write a program that manages a personal diary using an ArrayList. Each entry in the diary is a string that contains a date in the format
        "YYYY-MM-DD" followed by a colon and the diary entry for that day. Your program should allow the user to:
        ● Add a new entry (but ensure there's no duplicate date).
        ● Edit an existing entry based on the date.
        ● Delete an entry by date.
        ● Display all entries in reverse chronological order (latest first).
        Ensure that all these operations are efficient, especially the addition of new entries, which should keep the list sorted without resorting it every
        time.
         */

    }


    // Create a shopping list
    private static void Arr(){

        String[] myList = {"banana", "apples", "oranges", "grapes"};
        System.out.println(Arrays.toString(myList));
    }

    // Create a Wish list
    private  static void ChristmasWishlist(){
        ArrayList<String> wishlist = new ArrayList<>();

        wishlist.add("New Laptop");
        wishlist.add("Iphone 16");
        wishlist.add("Books");
        wishlist.add("Gift card");

        System.out.println("Christmas List: ");
        for (String item : wishlist){
            System.out.println("- " + item);
        }
    }

    //    3. Create
    private static void StudentList(){
        ArrayList<String> studentList = new ArrayList<>();
        ArrayList<String> graduateStudentList = new ArrayList<>();

        studentList.add("Dan");
        studentList.add("Cornelia");
        studentList.add("Petru");
        studentList.add("Stefan");

        graduateStudentList.addAll(studentList);


        System.out.println("Graduate student are: ");
        for (String students : graduateStudentList){
            System.out.println("- " + students);
        }

    }

    //Given an array of 10 integers out both counts.
    private static void EvenOddNumbers(){
        int[] numbers = {22, 56, 30, 20, 4 ,8, 10};
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                evenCount++;
            }else {
                oddCount++;
            }
        }
        System.out.println("Numbers of even number are: " + evenCount);
        System.out.println("Numbers of odd number are: " + oddCount);
    }


    //5. Create an ArrayList that stores city names
    private static void CityList(){
        ArrayList<String> cites = new ArrayList<>();

        cites.add("Brasov");
        cites.add("Cluj");
        cites.add("Arad");
        cites.add("Oltenita");
        cites.add("iasi");

        System.out.println("Lista initiala cu orase: " + cites);
        Scanner reader = new Scanner(System.in);
        System.out.print("Introdu orasul in lista: ");
        String newCity = reader.nextLine();

        if (cites.contains(newCity)){
            System.out.println("Orasul introdus de tine este " + newCity + " si este deja in lista!");
            System.out.println("Lista nu a fost modificata si arata astfel: " + cites);
        }else {
            cites.add(newCity);
            System.out.println("Orasul introdus de tine: " +newCity + " a fost adaugat la lista.");
            System.out.println("Nou lista arata astfel: " + cites);
        }
        reader.close();
    }


    //6. Given a LinkedList storing student names
    private static void StudentNewList(){
        LinkedList<String> students = new LinkedList<>();
        students.add("Angel");
        students.add("Lucian");
        students.add("Dan");
        students.add("Oana");
        students.add("Dragos");

        System.out.println("Lista cu studenti arata astfel: " + students);

        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu numele studentului pentru a fi verificat si eliminat din lista:");
        String studentName = sc.nextLine();

        if (students.contains(studentName)){
            students.remove(studentName);
            System.out.println("Studentul cu prenumele " + studentName + " a fost eliminat din lista");
            System.out.println("Lista actualizata arata astfel " + students);
        }else {
            System.out.println("Sudentul " + studentName + " nu este in lists!");
            System.out.println("Lista nu necesita actualizare si este: " + students);
        }
        sc.close();


    }

    //7. Fruit sorting
    private static void FruitSorting(){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("grapes");
        fruits.add("oranges");
        fruits.add("strawberries");

        Collections.sort(fruits, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int lengthComparison  = Integer.compare(o2.length(), o1.length());

                if (lengthComparison == 0){
                    return o1.compareTo(o2);
                }
                return lengthComparison;
            }
        });

        System.out.println("Fructele au fost sortate dupa lungime cuvintelor si in ordine alfabetica:");
        for (String fruit : fruits){
            System.out.println(fruit);
        }


    }


    //8. In an array of strings representing movie titles,
    private static void MovieSearch(){
        Scanner cititor = new Scanner(System.in);
        System.out.print("Introdu titlul de film cautat aici: ");
        String searchTitle = cititor.nextLine();

        boolean found = false;
        String[] movies = {"Robocop", "Wuming", "StarWars", "Total Recall"};
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].equalsIgnoreCase(searchTitle)){
                System.out.println("Filmul cautat " + searchTitle + " fost gasit la pozitia " + i);
                found = true;
                break;
            }

        }

        if (!found){
            System.out.println("Ops, filmul nu a fost gasit in lista!");
        }

    }










}
