package com.vali_it.toidu_app.domain.measure.measureunit;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-03T09:59:27+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class MeasureUnitMapperImpl implements MeasureUnitMapper {

    @Override
    public MeasureUnit measureUnitDtoToMeasureUnit(MeasureUnitDto measureUnitDto) {
        if ( measureUnitDto == null ) {
            return null;
        }

        MeasureUnit measureUnit = new MeasureUnit();

        measureUnit.setId( measureUnitDto.getId() );
        measureUnit.setName( measureUnitDto.getName() );

        return measureUnit;
    }

    @Override
    public MeasureUnitDto measureUnitToMeasureUnitDto(MeasureUnit measureUnit) {
        if ( measureUnit == null ) {
            return null;
        }

        Integer id = null;
        String name = null;

        id = measureUnit.getId();
        name = measureUnit.getName();

        MeasureUnitDto measureUnitDto = new MeasureUnitDto( id, name );

        return measureUnitDto;
    }

    @Override
    public void updateMeasureUnitFromMeasureUnitDto(MeasureUnitDto measureUnitDto, MeasureUnit measureUnit) {
        if ( measureUnitDto == null ) {
            return;
        }

        if ( measureUnitDto.getId() != null ) {
            measureUnit.setId( measureUnitDto.getId() );
        }
        if ( measureUnitDto.getName() != null ) {
            measureUnit.setName( measureUnitDto.getName() );
        }
    }
}
