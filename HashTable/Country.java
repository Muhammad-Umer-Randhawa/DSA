public class Country {
    String name;
    String language;
    int population;
    Country(String name, String language, int population){
        this.name = name;
        this.language = language;
        this.population = population;
    }
    public String toString(){
        return "Country: " + name + ", Language: " + language + ", Population: " + population;
    }
}
