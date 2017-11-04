package assetmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import assetmanagement.model.Address;
import assetmanagement.repository.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;


    @Override
    public Iterable<Address> findAll() {
        return addressRepository.findAll();
    }
}
