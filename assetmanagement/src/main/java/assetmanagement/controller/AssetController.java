package assetmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.logging.Level;
import java.util.logging.Logger;

import assetmanagement.model.Asset;
import assetmanagement.service.AssetService;

@Controller
public class AssetController {

    private static final Logger LOGGER = Logger.getLogger("AssetController");

    @Autowired
    private AssetService assetService;

    @GetMapping(value = "/assets")
    public ModelAndView showAssets() {

        return new ModelAndView("assets", "assets", assetService.findAll());
    }

    @GetMapping(value = "/assets/{id}")
    public ModelAndView showAsset(@PathVariable("id") Integer id) {

        Asset asset = assetService.findOne(id);

        return new ModelAndView("updateasset", "asset", asset);
    }

    @PostMapping(value = "/assets/{id}")
    public ModelAndView updateAsset(@PathVariable("id") Integer id, @ModelAttribute Asset asset) {

        LOGGER.log(Level.INFO, "Updating asset");

        assetService.save(asset);

        return new ModelAndView("assets", "assets", assetService.findAll());
    }
}
