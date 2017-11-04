package assetmanagement.repository;

import org.springframework.data.repository.CrudRepository;

import assetmanagement.model.Specification;

public interface SpecificationRepository extends CrudRepository<Specification, Integer> {

    @Override
    Specification findOne(Integer integer);
}
