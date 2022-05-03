package com.vali_it.toidu_app.domain.ingredient.ingredient;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-03T09:59:27+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class IngredientMapperImpl implements IngredientMapper {

    @Override
    public Ingredient ingredientDtoToIngredient(IngredientDto ingredientDto) {
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

    @Override
    public IngredientDto ingredientToIngredientDto(Ingredient ingredient) {
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

    @Override
    public List<IngredientDto> toIngredients(List<Ingredient> ingredient) {
        if ( ingredient == null ) {
            return null;
        }

        List<IngredientDto> list = new ArrayList<IngredientDto>( ingredient.size() );
        for ( Ingredient ingredient1 : ingredient ) {
            list.add( ingredientToIngredientDto( ingredient1 ) );
        }

        return list;
    }

    @Override
    public void updateIngredientFromIngredientDto(IngredientDto ingredientDto, Ingredient ingredient) {
        if ( ingredientDto == null ) {
            return;
        }

        if ( ingredientDto.getId() != null ) {
            ingredient.setId( ingredientDto.getId() );
        }
        if ( ingredientDto.getName() != null ) {
            ingredient.setName( ingredientDto.getName() );
        }
        if ( ingredientDto.getDescription() != null ) {
            ingredient.setDescription( ingredientDto.getDescription() );
        }
        if ( ingredientDto.getEnergy() != null ) {
            ingredient.setEnergy( ingredientDto.getEnergy() );
        }
        if ( ingredientDto.getCarbs() != null ) {
            ingredient.setCarbs( ingredientDto.getCarbs() );
        }
        if ( ingredientDto.getFat() != null ) {
            ingredient.setFat( ingredientDto.getFat() );
        }
        if ( ingredientDto.getProtein() != null ) {
            ingredient.setProtein( ingredientDto.getProtein() );
        }
    }
}
