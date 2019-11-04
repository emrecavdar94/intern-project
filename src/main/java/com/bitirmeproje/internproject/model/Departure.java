package com.bitirmeproje.internproject.model;

import javax.persistence.Entity;
import java.util.Objects;
import java.util.UUID;

@Entity
public class Departure {

    private UUID id;
    private String departure;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Departure departure1 = (Departure) o;
        return Objects.equals(id, departure1.id) &&
                Objects.equals(departure, departure1.departure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, departure);
    }

    @Override
    public String toString() {
        return "Departure{" +
                "id=" + id +
                ", departure='" + departure + '\'' +
                '}';
    }

    public Departure() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public Departure(UUID id, String departure) {
        this.id = id;
        this.departure = departure;
    }
}
