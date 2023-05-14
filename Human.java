public class Human {
    private String name;
    private String age;
    private String country;
    private String city;
    private String street;
    private String house;
    private String quarter;

    public String obtenirAdrecaCompleta() {
        //Refact: renombrar variable
        //StringBuilder result = new StringBuilder();
        StringBuilder adreça = new StringBuilder();
        return adreça
                .append(country)
                .append(", ")
                .append(city)
                .append(", ")
                .append(street)
                .append(", ")
                .append(house)
                .append(" ")
                .append(quarter).toString();
    }
}

