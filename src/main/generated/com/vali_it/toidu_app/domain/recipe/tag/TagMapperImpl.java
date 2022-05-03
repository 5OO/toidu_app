package com.vali_it.toidu_app.domain.recipe.tag;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-03T09:59:27+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class TagMapperImpl implements TagMapper {

    @Override
    public Tag tagDtoToTag(TagDto tagDto) {
        if ( tagDto == null ) {
            return null;
        }

        Tag tag = new Tag();

        tag.setId( tagDto.getId() );
        tag.setDescription( tagDto.getDescription() );

        return tag;
    }

    @Override
    public TagDto tagToTagDto(Tag tag) {
        if ( tag == null ) {
            return null;
        }

        Integer id = null;
        String description = null;

        id = tag.getId();
        description = tag.getDescription();

        TagDto tagDto = new TagDto( id, description );

        return tagDto;
    }

    @Override
    public void updateTagFromTagDto(TagDto tagDto, Tag tag) {
        if ( tagDto == null ) {
            return;
        }

        if ( tagDto.getId() != null ) {
            tag.setId( tagDto.getId() );
        }
        if ( tagDto.getDescription() != null ) {
            tag.setDescription( tagDto.getDescription() );
        }
    }
}
