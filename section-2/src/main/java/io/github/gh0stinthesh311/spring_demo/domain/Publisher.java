package io.github.gh0stinthesh311.spring_demo.domain;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    String publisherName;
    String address;
    String state;
    String zip;

    @OneToMany(mappedBy = "publisher") // One publisher has many books
    private Set<Book> books;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Publisher publisher)) return false;

        return id == publisher.id && publisherName.equals(publisher.publisherName) && address.equals(publisher.address) && state.equals(publisher.state) && zip.equals(publisher.zip);
    }

    @Override
    public int hashCode() {
        int result = Long.hashCode(id);
        result = 31 * result + publisherName.hashCode();
        result = 31 * result + address.hashCode();
        result = 31 * result + state.hashCode();
        result = 31 * result + zip.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", publisherName='" + publisherName + '\'' +
                ", address='" + address + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
