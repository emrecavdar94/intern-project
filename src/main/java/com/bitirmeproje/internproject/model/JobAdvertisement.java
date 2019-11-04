package com.bitirmeproje.internproject.model;

import com.bitirmeproje.internproject.enums.AdvertisementType;

import javax.persistence.Entity;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

@Entity
public class JobAdvertisement {
    private UUID Id;
    private UUID companyId;
    private Date deadline;
    private String description;
    private String photo;
    private String centerOfCompany;
    private int locationCityId;
    private AdvertisementType advertisementType;
    private Date createdDate;
    private int createdById;



    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        JobAdvertisement that = (JobAdvertisement) o;
        return locationCityId == that.locationCityId &&
                advertisementType == that.advertisementType &&
                createdById == that.createdById &&
                Objects.equals(Id, that.Id) &&
                Objects.equals(companyId, that.companyId) &&
                Objects.equals(deadline, that.deadline) &&
                Objects.equals(description, that.description) &&
                Objects.equals(photo, that.photo) &&
                Objects.equals(centerOfCompany, that.centerOfCompany) &&
                Objects.equals(createdDate, that.createdDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, companyId, deadline, description, photo, centerOfCompany, locationCityId, advertisementType, createdDate, createdById);
    }

    @Override
    public String toString() {
        return "JobAdvertisement{" +
                "Id=" + Id +
                ", companyId=" + companyId +
                ", deadline=" + deadline +
                ", description='" + description + '\'' +
                ", photo='" + photo + '\'' +
                ", centerOfCompany='" + centerOfCompany + '\'' +
                ", locationCityId=" + locationCityId +
                ", advertisementType=" + advertisementType +
                ", createdDate=" + createdDate +
                ", createdById=" + createdById +
                '}';
    }

    public JobAdvertisement() {
    }

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public UUID getCompanyId() {
        return companyId;
    }

    public void setCompanyId(UUID companyId) {
        this.companyId = companyId;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getCenterOfCompany() {
        return centerOfCompany;
    }

    public void setCenterOfCompany(String centerOfCompany) {
        this.centerOfCompany = centerOfCompany;
    }

    public int getLocationCityId() {
        return locationCityId;
    }

    public void setLocationCityId(int locationCityId) {
        this.locationCityId = locationCityId;
    }

    public AdvertisementType getAdvertisementType() {
        return advertisementType;
    }

    public void setAdvertisementType(AdvertisementType advertisementType) {
        this.advertisementType = advertisementType;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public int getCreatedById() {
        return createdById;
    }

    public void setCreatedById(int createdById) {
        this.createdById = createdById;
    }

    public JobAdvertisement(UUID id, UUID companyId, Date deadline, String description, String photo, String centerOfCompany, int locationCityId, AdvertisementType advertisementType, Date createdDate, int createdById) {
        Id = id;
        this.companyId = companyId;
        this.deadline = deadline;
        this.description = description;
        this.photo = photo;
        this.centerOfCompany = centerOfCompany;
        this.locationCityId = locationCityId;
        this.advertisementType = advertisementType;
        this.createdDate = createdDate;
        this.createdById = createdById;
    }
}
