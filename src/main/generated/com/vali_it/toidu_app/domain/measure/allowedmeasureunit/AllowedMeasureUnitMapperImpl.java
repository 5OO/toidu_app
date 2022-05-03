package com.vali_it.toidu_app.domain.measure.allowedmeasureunit;

import com.vali_it.toidu_app.domain.ingredient.ingredient.Ingredient;
import com.vali_it.toidu_app.domain.ingredient.ingredient.IngredientDto;
import com.vali_it.toidu_app.domain.measure.measureunit.MeasureUnit;
import com.vali_it.toidu_app.domain.measure.measureunit.MeasureUnitDto;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-03T09:59:27+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class AllowedMeasureUnitMapperImpl implements AllowedMeasureUnitMapper {

    @Override
    public AllowedMeasureUnit allowedMeasureUnitDtoToAllowedMeasureUnit(AllowedMeasureUnitDto allowedMeasureUnitDto) {
        if ( allowedMeasureUnitDto == null ) {
            return null;
        }

        AllowedMeasureUnit allowedMeasureUnit = new AllowedMeasureUnit();

        allowedMeasureUnit.setId( allowedMeasureUnitDto.getId() );
        allowedMeasureUnit.setIngredient( ingredientDtoToIngredient( allowedMeasureUnitDto.getIngredient() ) );
        allowedMeasureUnit.setMeasureUnit( measureUnitDtoToMeasureUnit( allowedMeasureUnitDto.getMeasureUnit() ) );
        allowedMeasureUnit.setConversionMultiplier( allowedMeasureUnitDto.getConversionMultiplier() );
        allowedMeasureUnit.setOnversionDescription( allowedMeasureUnitDto.getOnversionDescription() );

        return allowedMeasureUnit;
    }

    @Override
    public AllowedMeasureUnitDto allowedMeasureUnitToAllowedMeasureUnitDto(AllowedMeasureUnit allowedMeasureUnit) {
        if ( allowedMeasureUnit == null ) {
            return null;
        }

        Integer id = null;
        IngredientDto ingredient = null;
        MeasureUnitDto measureUnit = null;
        BigDecimal conversionMultiplier = null;
        String onversionDescription = null;

        id = allowedMeasureUnit.getId();
        ingredient = ingredientToIngredientDto( allowedMeasureUnit.getIngredient() );
        measureUnit = measureUnitToMeasureUnitDto( allowedMeasureUnit.getMeasureUnit() );
        conversionMultiplier = allowedMeasureUnit.getConversionMultiplier();
        onversionDescription = allowedMeasureUnit.getOnversionDescription();

        AllowedMeasureUnitDto allowedMeasureUnitDto = new AllowedMeasureUnitDto( id, ingredient, measureUnit, conversionMultiplier, onversionDescription );

        return allowedMeasureUnitDto;
    }

    @Override
    public void updateAllowedMeasureUnitFromAllowedMeasureUnitDto(AllowedMeasureUnitDto allowedMeasureUnitDto, AllowedMeasureUnit allowedMeasureUnit) {
        if ( allowedMeasureUnitDto == null ) {
            return;
        }

        if ( allowedMeasureUnitDto.getId() != null ) {
            allowedMeasureUnit.setId( allowedMeasureUnitDto.getId() );
        }
        if ( allowedMeasureUnitDto.getIngredient() != null ) {
            if ( allowedMeasureUnit.getIngredient() == null ) {
                allowedMeasureUnit.setIngredient( new Ingredient() );
            }
            ingredientDtoToIngredient1( allowedMeasureUnitDto.getIngredient(), allowedMeasureUnit.getIngredient() );
        }
        if ( allowedMeasureUnitDto.getMeasureUnit() != null ) {
            if ( allowedMeasureUnit.getMeasureUnit() == null ) {
                allowedMeasureUnit.setMeasureUnit( new MeasureUnit() );
            }
            measureUnitDtoToMeasureUnit1( allowedMeasureUnitDto.getMeasureUnit(), allowedMeasureUnit.getMeasureUnit() );
        }
        if ( allowedMeasureUnitDto.getConversionMultiplier() != null ) {
            allowedMeasureUnit.setConversionMultiplier( allowedMeasureUnitDto.getConversionMultiplier() );
        }
        if ( allowedMeasureUnitDto.getOnversionDescription() != null ) {
            allowedMeasureUnit.setOnversionDescription( allowedMeasureUnitDto.getOnversionDescription() );
        }
    }

    protected Ingredient ingredientDtoToIngredient(IngredientDto ingredientDto) {
        if ( ingredientDto == null ) {
            return null;
        }

        Ingredient ingredient = new Ingredient();

        ingredient.setId( ingredientDto.getId() );
        ingredient.setName( ingredientDto.getName() );
        ingredient.setDescription( ingredientDto.getDescription() );
        ingredient.setEnergy( ingredientDto.getEnergy() );
        ingredient.setCarbs( ingredientDto.getCarbs() );
        ingredient.setFat( ingredientDto.getFat() );
        ingredient.setProtein( ingredientDto.getProtein() );

        return ingredient;
    }

    protected MeasureUnit measureUnitDtoToMeasureUnit(MeasureUnitDto measureUnitDto) {
        if ( measureUnitDto == null ) {
            return null;
        }

        MeasureUnit measureUnit = new MeasureUnit();

        measureUnit.setId( measureUnitDto.getId() );
        measureUnit.setName( measureUnitDto.getName() );

        return measureUnit;
    }

    protected IngredientDto ingredientToIngredientDto(Ingredient ingredient) {
        if ( ingredient == null ) {
            return null;
        }

        Integer id = null;
        String name = null;
        String description = null;
        BigDecimal energy = null;
        BigDecimal carbs = null;
        BigDecimal fat = null;
        BigDecimal protein = null;

        id = ingredient.getId();
        name = ingredient.getName();
        description = ingredient.getDescription();
        energy = ingredient.getEnergy();
        carbs = ingredient.getCarbs();
        fat = ingredient.getFat();
        protein = ingredient.getProtein();

        IngredientDto ingredientDto = new IngredientDto( id, name, description, energy, carbs, fat, protein );

        return ingredientDto;
    }

    protected MeasureUnitDto measureUnitToMeasureUnitDto(MeasureUnit measureUnit) {
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

    protected void ingredientDtoToIngredient1(IngredientDto ingredientDto, Ingredient mappingTarget) {
        if ( ingredientDto == null ) {
            return;
        }

        if ( ingredientDto.getId() != null ) {
            mappingTarget.setId( ingredientDto.getId() );
        }
        if ( ingredientDto.getName() != null ) {
            mappingTarget.setName( ingredientDto.getName() );
        }
        if ( ingredientDto.getDescription() != null ) {
            mappingTarget.setDescription( ingredientDto.getDescription() );
        }
        if ( ingredientDto.getEnergy() != null ) {
            mappingTarget.setEnergy( ingredientDto.getEnergy() );
        }
        if ( ingredientDto.getCarbs() != null ) {
            mappingTarget.setCarbs( ingredientDto.getCarbs() );
        }
        if ( ingredientDto.getFat() != null ) {
            mappingTarget.setFat( ingredientDto.getFat() );
        }
        if ( ingredientDto.getProtein() != null ) {
            mappingTarget.setProtein( ingredientDto.getProtein() );
        }
    }

    protected void measureUnitDtoToMeasureUnit1(MeasureUnitDto measureUnitDto, MeasureUnit mappingTarget) {
        if ( measureUnitDto == null ) {
            return;
        }

        if ( measureUnitDto.getId() != null ) {
            mappingTarget.setId( measureUnitDto.getId() );
        }
        if ( measureUnitDto.getName() != null ) {
            mappingTarget.setName( measureUnitDto.getName() );
        }
    }
}
