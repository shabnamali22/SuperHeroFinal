public class Controler {
    private Database database;

    public Controler(Database database) {
        this.database = database;
    }

    public void addHeroToDatabase(String name, String realName, String superPower, int yearCreated, String race, String strength) {
        database.addHero(name, realName, superPower, yearCreated, race, strength);
    }
}