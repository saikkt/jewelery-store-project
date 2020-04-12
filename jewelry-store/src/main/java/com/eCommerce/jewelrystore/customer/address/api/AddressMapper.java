package com.eCommerce.jewelrystore.customer.address.api;

import com.eCommerce.jewelrystore.customer.address.domain.Address;
import com.eCommerce.jewelrystore.customer.address.dto.AddressModel;

class AddressMapper {

    static Address toEntity(AddressModel addressModel){
        Address address;
        address = new Address(
                addressModel.getCustomerID(),
                addressModel.getStreet(),
                addressModel.getCity(),
                addressModel.getState(),
                addressModel.getCountry());
        address.setApartmentNumber(addressModel.getApartmentNumber());
        address.setAddressID(addressModel.getAddressID());
        address.setDefaultBilling(addressModel.isDefaultBilling());
        address.setDefaultShipping(addressModel.isDefaultShipping());
        address.setVersion(addressModel.getVersion());

        return address;
    }
}
