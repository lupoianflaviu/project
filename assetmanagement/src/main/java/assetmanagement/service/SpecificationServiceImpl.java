package assetmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import assetmanagement.model.Specification;
import assetmanagement.repository.SpecificationRepository;

@Service
public class SpecificationServiceImpl implements SpecificationService {

    @Autowired
    private SpecificationRepository specificationRepository;

    @Override
    public Specification findOne(Integer integer) {
        return this.specificationRepository.findOne(integer);
    }
}
