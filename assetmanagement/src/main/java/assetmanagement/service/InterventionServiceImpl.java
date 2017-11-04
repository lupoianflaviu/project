package assetmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import assetmanagement.model.Intervention;
import assetmanagement.repository.InterventionRepository;

@Service
public class InterventionServiceImpl implements InterventionService {

    @Autowired
    private InterventionRepository interventionRepository;

    @Override
    public Intervention findOne(Integer integer) {
        return this.interventionRepository.findOne(integer);
    }
}
