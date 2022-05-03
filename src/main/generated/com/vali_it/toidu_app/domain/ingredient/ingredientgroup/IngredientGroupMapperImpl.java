package com.vali_it.toidu_app.domain.ingredient.ingredientgroup;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-03T09:59:27+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class IngredientGroupMapperImpl implements IngredientGroupMapper {

    @Override
    public IngredientGroup ingredientGroupDtoToIngredientGroup(IngredientGroupDto ingredientGroupDto) {
        if ( ingredientGroupDto == null ) {
            return null;
        }

        IngredientGroup ingredientGroup = new IngredientGroup();

        ingredientGroup.setId( ingredientGroupDto.getId() );
        ingredientGroup.setName( ingredientGroupDto.getName() );

        return ingredientGroup;
    }

    @Override
    public IngredientGroupDto ingredientGroupToIngredientGroupDto(IngredientGroup ingredientGroup) {
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

    @Override
    public void updateIngredientGroupFromIngredientGroupDto(IngredientGroupDto ingredientGroupDto, IngredientGroup ingredientGroup) {
        if ( ingredientGroupDto == null ) {
            return;
        }

        if ( ingredientGroupDto.getId() != null ) {
            ingredientGroup.setId( ingredientGroupDto.getId() );
        }
        if ( ingredientGroupDto.getName() != null ) {
            ingredientGroup.setName( ingredientGroupDto.getName() );
        }
    }
}
