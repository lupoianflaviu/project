package assetmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import assetmanagement.model.Asset;
import assetmanagement.repository.AssetRepository;

@Service
public class AssetServiceImpl implements AssetService {

    @Autowired
    private AssetRepository assetRepository;

    @Override
    public Iterable<Asset> findAll() {
        return this.assetRepository.findAll();
    }

    @Override
    public Asset findOne(Integer id) {
        return this.assetRepository.findOne(id);
    }

    @Override
    public <S extends Asset> S save(S s) {
        return this.assetRepository.save(s);
    }

    @Override
    public void delete(Integer id) {
        this.assetRepository.delete(id);
    }
}
