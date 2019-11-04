package com.bitirmeproje.internproject.model;

import java.util.Objects;
import java.util.UUID;

public class District {
    private UUID id;
    private String district;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        District district1 = (District) o;
        return Objects.equals(id, district1.id) &&
                Objects.equals(district, district1.district);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, district);
    }

    @Override
    public String toString() {
        return "District{" +
                "id=" + id +
                ", district='" + district + '\'' +
                '}';
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public District() {
    }

    public District(UUID id, String district) {
        this.id = id;
        this.district = district;
    }
}
