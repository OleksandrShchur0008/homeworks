package de.ait.homework42;

public class Sportsman {

    private String name;

    private int age;

    private String sport;

    private int records;

    public Sportsman(String name, int age, String sport, int records) {
        this.name = name;
        this.age = age;
        this.sport = sport;
        this.records = records;
    }

    @Override
    public String toString() {
        return "Sportsman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sport='" + sport + '\'' +
                ", records=" + records +
                '}';
    }

    public int updateRecord(int newRecord) {
        if(newRecord > records) {
            records = newRecord;
            return records;
        } else {
            return records;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public int getRecords() {
        return records;
    }

    public void setRecords(int records) {
        this.records = records;
    }
}
