package assetmanagement.repository;

import org.springframework.data.repository.CrudRepository;

import assetmanagement.model.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {

    @Override
    Iterable<Address> findAll();
}
