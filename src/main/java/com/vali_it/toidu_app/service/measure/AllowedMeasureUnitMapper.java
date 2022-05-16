package com.vali_it.toidu_app.service.measure;

import com.vali_it.toidu_app.domain.measure.allowedmeasureunit.AllowedMeasureUnit;
import com.vali_it.toidu_app.domain.measure.measureunit.MeasureUnitDto;
import org.mapstruct.*;

import java.util.List;
import java.util.Optional;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AllowedMeasureUnitMapper {

    @Mapping(target = "id", source = "measureUnit.id")
    @Mapping(target = "name", source = "measureUnit.name")
    MeasureUnitDto allowedMeasureUnitsToMeasureUnits(AllowedMeasureUnit allowedMeasureUnit);


    List<AllowedMeasureUnitDto> toEntities(List<AllowedMeasureUnit> allowedMeasureUnit);

    List<AllowedMeasureUnitResponse> toList(List<AllowedMeasureUnit> allowedMeasureUnits);


    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateAllowedMeasureUnitFromAllowedMeasureUnitDto(AllowedMeasureUnitDto allowedMeasureUnitDto, @MappingTarget AllowedMeasureUnit allowedMeasureUnit);


    @Mapping(source = "ingredientId", target = "ingredient.id")
    @Mapping(source = "measureUnitId", target = "measureUnit.id")
    AllowedMeasureUnit allowedMeasureUnitDto1ToAllowedMeasureUnit1(AllowedMeasureUnitDto1 allowedMeasureUnitDto1);

    List<AllowedMeasureUnit> dtosToEntities(List<AllowedMeasureUnitDto1> allowedMeasureUnitDto1s);

    @InheritInverseConfiguration(name = "allowedMeasureUnitDto1ToAllowedMeasureUnit1")
    AllowedMeasureUnitDto1 allowedMeasureUnitToAllowedMeasureUnitDto11(AllowedMeasureUnit allowedMeasureUnit);

    @InheritConfiguration(name = "allowedMeasureUnitDto1ToAllowedMeasureUnit1")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateAllowedMeasureUnitFromAllowedMeasureUnitDto11(AllowedMeasureUnitDto1 allowedMeasureUnitDto1, @MappingTarget AllowedMeasureUnit allowedMeasureUnit);
}
