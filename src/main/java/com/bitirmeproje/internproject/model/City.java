package com.bitirmeproje.internproject.model;

import javax.persistence.Entity;
import java.util.Objects;
import java.util.UUID;

@Entity
public class City {
    private UUID id;

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        City city1 = (City) o;
        return Objects.equals(id, city1.id) &&
                Objects.equals(city, city1.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, city);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public City() {
    }

    public City(UUID id, String city) {
        this.id = id;
        this.city = city;
    }

    private String city;
}