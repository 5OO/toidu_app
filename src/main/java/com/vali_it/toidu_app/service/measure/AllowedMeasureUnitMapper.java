package com.vali_it.toidu_app.service.measure;

import com.vali_it.toidu_app.domain.measure.allowedmeasureunit.AllowedMeasureUnit;
import com.vali_it.toidu_app.domain.measure.measureunit.MeasureUnitDto;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AllowedMeasureUnitMapper {

    @Mapping(target = "id", source = "measureUnit.id")
    @Mapping(target = "name", source = "measureUnit.name")
    MeasureUnitDto allowedMeasureUnitsToMeasureUnits(AllowedMeasureUnit allowedMeasureUnit);

    AllowedMeasureUnit allowedMeasureUnitDtoToAllowedMeasureUnit(AllowedMeasureUnitDto allowedMeasureUnitDto);


    List<AllowedMeasureUnitDto> toEntities(List<AllowedMeasureUnit> allowedMeasureUnit);


//    List<MeasureUnitDto> allowedMeasureUnitsToMeasureUnits(List<AllowedMeasureUnit> allowedMeasureUnits);

//    UnitMultiplierResponse unitMultiplierDto(AllowedMeasureUnit allowedMeasureUnit);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateAllowedMeasureUnitFromAllowedMeasureUnitDto(AllowedMeasureUnitDto allowedMeasureUnitDto, @MappingTarget AllowedMeasureUnit allowedMeasureUnit);
}
