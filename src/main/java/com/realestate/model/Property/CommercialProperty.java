package com.realestate.model.Property;

import com.realestate.enums.BuildingType;
import com.realestate.enums.TypeOfBusiness;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "commercial_property")
public class CommercialProperty extends Property {

    private Double area;
    private Integer rooms;
    private Integer bathrooms;
    @Enumerated(EnumType.STRING)
    private BuildingType buildingType;
    private Integer floor;
    @Enumerated(EnumType.STRING)
    private TypeOfBusiness typeOfBusiness;
}
