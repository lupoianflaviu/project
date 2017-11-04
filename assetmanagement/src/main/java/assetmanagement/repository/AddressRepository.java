package assetmanagement.repository;

import org.springframework.data.repository.CrudRepository;

import assetmanagement.model.Address;

public interface AddressRepository extends CrudRepository<Address, Integer> {

    @Override
    Iterable<Address> findAll();

    @Override
    Address findOne(Integer integer);
}
