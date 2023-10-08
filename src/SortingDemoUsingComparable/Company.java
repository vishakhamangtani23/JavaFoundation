package SortingDemoUsingComparable;

import java.util.Objects;

public class Company implements Comparable<Company> {
    private int id;
    private String name;
    private float rating;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return getId() == company.getId() && Float.compare(getRating(), company.getRating()) == 0 && Objects.equals(getName(), company.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getRating());
    }

    public Company(int id, String name, int rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }

    @Override
    public int compareTo(Company o) {
        return this.getRating()>o.getRating()?1:this.getRating()<o.getRating()?-1:this.getName().compareTo(o.getName());
    }

//    @Override
//    public int compareTo(Company o) {
//        return this.getName().compareTo(o.getName());
//    }

}
