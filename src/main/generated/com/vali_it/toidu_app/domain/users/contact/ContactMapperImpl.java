package com.vali_it.toidu_app.domain.users.contact;

import com.vali_it.toidu_app.service.register.RegisterRequest;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-03T09:59:27+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class ContactMapperImpl implements ContactMapper {

    @Override
    public Contact toEntity(RegisterRequest request) {
        if ( request == null ) {
            return null;
        }

        Contact contact = new Contact();

        contact.setFirstName( request.getFirstName() );
        contact.setLastName( request.getLastName() );
        contact.setAddress( request.getAddress() );
        contact.setMobileNumber( request.getMobileNumber() );
        contact.setEmail( request.getEmail() );

        return contact;
    }

    @Override
    public void updateContactFromContactDto(RegisterRequest request, Contact contact) {
        if ( request == null ) {
            return;
        }

        if ( request.getFirstName() != null ) {
            contact.setFirstName( request.getFirstName() );
        }
        if ( request.getLastName() != null ) {
            contact.setLastName( request.getLastName() );
        }
        if ( request.getAddress() != null ) {
            contact.setAddress( request.getAddress() );
        }
        if ( request.getMobileNumber() != null ) {
            contact.setMobileNumber( request.getMobileNumber() );
        }
        if ( request.getEmail() != null ) {
            contact.setEmail( request.getEmail() );
        }
    }
}
