public class Main{
    public static void main(String[] args) {

        Country c1 = new Country("USA", "English", 331000000);
        Country c2 = new Country("France", "French", 67000000);
        Country c3 = new Country("Japan", "Japanese", 126000000);
        Country c4 = new Country("Brazil", "Portuguese", 212000000);
        Country c5 = new Country("Pakistan", "Urdu", 1380000000);

        HashTable ht = new HashTable();
        ht.put("USA", c1);
        ht.put("France", c2);
        ht.put("Japan", c3);
        ht.put("Brazil", c4);
        ht.put("Pakistan", c5);

        System.out.println("Size of Hashtable: " + ht.size());
        System.out.println("Country for key 'USA': " + ht.get("USA"));
        System.out.println("Country for key 'France': " + ht.get("France"));
        System.out.println("Country for key 'Japan': " + ht.get("Japan"));
        System.out.println("Country for key 'Brazil': " + ht.get("Brazil"));
        System.out.println("Country for key 'Pakistan': " + ht.get("Pakistan"));

        System.out.println("Removing key 'Japan': " + ht.remove("Japan"));
        System.out.println("Size of Hashtable after removal: " + ht.size());
    }
}