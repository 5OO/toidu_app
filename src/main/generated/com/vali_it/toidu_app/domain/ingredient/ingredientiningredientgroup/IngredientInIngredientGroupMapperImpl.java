package com.vali_it.toidu_app.domain.ingredient.ingredientiningredientgroup;

import com.vali_it.toidu_app.domain.ingredient.ingredient.Ingredient;
import com.vali_it.toidu_app.domain.ingredient.ingredient.IngredientDto;
import com.vali_it.toidu_app.domain.ingredient.ingredientgroup.IngredientGroup;
import com.vali_it.toidu_app.domain.ingredient.ingredientgroup.IngredientGroupDto;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-03T09:59:27+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class IngredientInIngredientGroupMapperImpl implements IngredientInIngredientGroupMapper {

    @Override
    public IngredientInIngredientGroup ingredientInIngredientGroupDtoToIngredientInIngredientGroup(IngredientInIngredientGroupDto ingredientInIngredientGroupDto) {
        if ( ingredientInIngredientGroupDto == null ) {
            return null;
        }

        IngredientInIngredientGroup ingredientInIngredientGroup = new IngredientInIngredientGroup();

        ingredientInIngredientGroup.setId( ingredientInIngredientGroupDto.getId() );
        ingredientInIngredientGroup.setIngredient( ingredientDtoToIngredient( ingredientInIngredientGroupDto.getIngredient() ) );
        ingredientInIngredientGroup.setIngredientGroup( ingredientGroupDtoToIngredientGroup( ingredientInIngredientGroupDto.getIngredientGroup() ) );

        return ingredientInIngredientGroup;
    }

    @Override
    public IngredientInIngredientGroupDto ingredientInIngredientGroupToIngredientInIngredientGroupDto(IngredientInIngredientGroup ingredientInIngredientGroup) {
        if ( ingredientInIngredientGroup == null ) {
            return null;
        }

        Integer id = null;
        IngredientDto ingredient = null;
        IngredientGroupDto ingredientGroup = null;

        id = ingredientInIngredientGroup.getId();
        ingredient = ingredientToIngredientDto( ingredientInIngredientGroup.getIngredient() );
        ingredientGroup = ingredientGroupToIngredientGroupDto( ingredientInIngredientGroup.getIngredientGroup() );

        IngredientInIngredientGroupDto ingredientInIngredientGroupDto = new IngredientInIngredientGroupDto( id, ingredient, ingredientGroup );

        return ingredientInIngredientGroupDto;
    }

    @Override
    public void updateIngredientInIngredientGroupFromIngredientInIngredientGroupDto(IngredientInIngredientGroupDto ingredientInIngredientGroupDto, IngredientInIngredientGroup ingredientInIngredientGroup) {
        if ( ingredientInIngredientGroupDto == null ) {
            return;
        }

        if ( ingredientInIngredientGroupDto.getId() != null ) {
            ingredientInIngredientGroup.setId( ingredientInIngredientGroupDto.getId() );
        }
        if ( ingredientInIngredientGroupDto.getIngredient() != null ) {
            if ( ingredientInIngredientGroup.getIngredient() == null ) {
                ingredientInIngredientGroup.setIngredient( new Ingredient() );
            }
            ingredientDtoToIngredient1( ingredientInIngredientGroupDto.getIngredient(), ingredientInIngredientGroup.getIngredient() );
        }
        if ( ingredientInIngredientGroupDto.getIngredientGroup() != null ) {
            if ( ingredientInIngredientGroup.getIngredientGroup() == null ) {
                ingredientInIngredientGroup.setIngredientGroup( new IngredientGroup() );
            }
            ingredientGroupDtoToIngredientGroup1( ingredientInIngredientGroupDto.getIngredientGroup(), ingredientInIngredientGroup.getIngredientGroup() );
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

    protected IngredientGroup ingredientGroupDtoToIngredientGroup(IngredientGroupDto ingredientGroupDto) {
        if ( ingredientGroupDto == null ) {
            return null;
        }

        IngredientGroup ingredientGroup = new IngredientGroup();

        ingredientGroup.setId( ingredientGroupDto.getId() );
        ingredientGroup.setName( ingredientGroupDto.getName() );

        return ingredientGroup;
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

    protected IngredientGroupDto ingredientGroupToIngredientGroupDto(IngredientGroup ingredientGroup) {
        if ( ingredientGroup == null ) {
            return null;
        }

        Integer id = null;
        String name = null;

        id = ingredientGroup.getId();
        name = ingredientGroup.getName();

        IngredientGroupDto ingredientGroupDto = new IngredientGroupDto( id, name );

        return ingredientGroupDto;
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

    protected void ingredientGroupDtoToIngredientGroup1(IngredientGroupDto ingredientGroupDto, IngredientGroup mappingTarget) {
        if ( ingredientGroupDto == null ) {
            return;
        }

        if ( ingredientGroupDto.getId() != null ) {
            mappingTarget.setId( ingredientGroupDto.getId() );
        }
        if ( ingredientGroupDto.getName() != null ) {
            mappingTarget.setName( ingredientGroupDto.getName() );
        }
    }
}
