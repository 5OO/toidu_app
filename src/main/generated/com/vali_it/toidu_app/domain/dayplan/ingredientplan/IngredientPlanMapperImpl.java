package com.vali_it.toidu_app.domain.dayplan.ingredientplan;

import com.vali_it.toidu_app.domain.ingredient.ingredient.Ingredient;
import com.vali_it.toidu_app.domain.ingredient.ingredient.IngredientDto;
import com.vali_it.toidu_app.domain.measure.measureunit.MeasureUnit;
import com.vali_it.toidu_app.domain.measure.measureunit.MeasureUnitDto;
import com.vali_it.toidu_app.service.dayplan.PlanIngredientRequest;
import com.vali_it.toidu_app.service.dayplan.PlanRequest;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-03T09:59:27+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class IngredientPlanMapperImpl implements IngredientPlanMapper {

    @Override
    public IngredientPlan toEntity(PlanIngredientRequest planIngredientRequest) {
        if ( planIngredientRequest == null ) {
            return null;
        }

        IngredientPlan ingredientPlan = new IngredientPlan();

        ingredientPlan.setServingSize( planIngredientRequest.getServingSize() );

        return ingredientPlan;
    }

    @Override
    public PlanIngredientRequest ingredientPlanToIngredientPlanDto(IngredientPlan ingredientPlan) {
        if ( ingredientPlan == null ) {
            return null;
        }

        PlanIngredientRequest planIngredientRequest = new PlanIngredientRequest();

        planIngredientRequest.setServingSize( ingredientPlan.getServingSize() );

        return planIngredientRequest;
    }

    @Override
    public void updateIngredientPlanFromIngredientPlanDto(IngredientPlanDto ingredientPlanDto, IngredientPlan ingredientPlan) {
        if ( ingredientPlanDto == null ) {
            return;
        }

        if ( ingredientPlanDto.getId() != null ) {
            ingredientPlan.setId( ingredientPlanDto.getId() );
        }
        if ( ingredientPlanDto.getDayPlan() != null ) {
            if ( ingredientPlan.getDayPlan() == null ) {
                ingredientPlan.setDayPlan( new DayPlan() );
            }
            planRequestToDayPlan( ingredientPlanDto.getDayPlan(), ingredientPlan.getDayPlan() );
        }
        if ( ingredientPlanDto.getIngredient() != null ) {
            if ( ingredientPlan.getIngredient() == null ) {
                ingredientPlan.setIngredient( new Ingredient() );
            }
            ingredientDtoToIngredient( ingredientPlanDto.getIngredient(), ingredientPlan.getIngredient() );
        }
        if ( ingredientPlanDto.getServingSize() != null ) {
            ingredientPlan.setServingSize( ingredientPlanDto.getServingSize() );
        }
        if ( ingredientPlanDto.getMeasureUnit() != null ) {
            if ( ingredientPlan.getMeasureUnit() == null ) {
                ingredientPlan.setMeasureUnit( new MeasureUnit() );
            }
            measureUnitDtoToMeasureUnit( ingredientPlanDto.getMeasureUnit(), ingredientPlan.getMeasureUnit() );
        }
    }

    protected void planRequestToDayPlan(PlanRequest planRequest, DayPlan mappingTarget) {
        if ( planRequest == null ) {
            return;
        }

        if ( planRequest.getDescription() != null ) {
            mappingTarget.setDescription( planRequest.getDescription() );
        }
    }

    protected void ingredientDtoToIngredient(IngredientDto ingredientDto, Ingredient mappingTarget) {
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

    protected void measureUnitDtoToMeasureUnit(MeasureUnitDto measureUnitDto, MeasureUnit mappingTarget) {
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
