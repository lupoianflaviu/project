package assetmanagement.service;

import assetmanagement.model.Address;

public interface AddressService {

    Iterable<Address> findAll();

    Address findOne(Integer integer);
}
