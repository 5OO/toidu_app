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

//    AllowedMeasureUnitResponse allowedMeasureUnitDtoToAllowedMeasureUnit(Optional allowedMeasureUnitDto);


    List<AllowedMeasureUnitDto> toEntities(List<AllowedMeasureUnit> allowedMeasureUnit);

    List<AllowedMeasureUnitResponse> toList(List<AllowedMeasureUnit> allowedMeasureUnits);

//    List<MeasureUnitDto> allowedMeasureUnitsToMeasureUnits(List<AllowedMeasureUnit> allowedMeasureUnits);

//    UnitMultiplierResponse unitMultiplierDto(AllowedMeasureUnit allowedMeasureUnit);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateAllowedMeasureUnitFromAllowedMeasureUnitDto(AllowedMeasureUnitDto allowedMeasureUnitDto, @MappingTarget AllowedMeasureUnit allowedMeasureUnit);

    @Mapping(source = "measureUnitId", target = "measureUnit.id")
    @Mapping(source = "measureUnitName", target = "measureUnit.name")
    AllowedMeasureUnit allowedMeasureUnitDto1ToAllowedMeasureUnit(AllowedMeasureUnitResponse allowedMeasureUnitResponse);

    @InheritInverseConfiguration(name = "allowedMeasureUnitDto1ToAllowedMeasureUnit")
    AllowedMeasureUnitResponse allowedMeasureUnitToAllowedMeasureUnitDto1(AllowedMeasureUnit allowedMeasureUnit);

    @InheritConfiguration(name = "allowedMeasureUnitDto1ToAllowedMeasureUnit")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateAllowedMeasureUnitFromAllowedMeasureUnitDto1(AllowedMeasureUnitResponse allowedMeasureUnitResponse, @MappingTarget AllowedMeasureUnit allowedMeasureUnit);
}
