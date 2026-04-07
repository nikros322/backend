package org.example.server.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "cabinets")
public class Cabinet {

    @Id
    @NotBlank
    @Column(nullable = false, unique = true)
    private String id;

    @Min(0)
    @Column(nullable = false)
    private int places;

    @Min(0)
    @Column(nullable = false)
    private int compPlaces;

    public Cabinet() {
    }

    public Cabinet(String id, int places, int compPlaces) {
        this.id = id;
        this.places = places;
        this.compPlaces = compPlaces;
    }

    public String getId() {
        return id;
    }

    public int getPlaces() {
        return places;
    }

    public int getCompPlaces() {
        return compPlaces;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public void setCompPlaces(int compPlaces) {
        this.compPlaces = compPlaces;
    }
}
