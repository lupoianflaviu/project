package assetmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.logging.Level;
import java.util.logging.Logger;

import assetmanagement.model.Asset;
import assetmanagement.model.Employee;
import assetmanagement.model.Intervention;
import assetmanagement.model.Specification;
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

    @GetMapping(value = "/assets/delete/{id}")
    public ModelAndView getAssetForDeletion(@PathVariable("id") Integer id) {

        Asset asset = assetService.findOne(id);

        return new ModelAndView("deleteasset", "asset", asset);
    }

    @PostMapping(value = "/assets/delete/{id}")
    public ModelAndView deleteAsset(@PathVariable("id") Integer id) {

        assetService.delete(id);

        return new ModelAndView("assets", "assets", assetService.findAll());
    }

    @GetMapping(value = "/assets/submit")
    public String submit(Model model) {

        model.addAttribute("asset", new Asset());

        return "submitasset";
    }

    @PostMapping(value = "/assets/submit")
    public String createAsset(@ModelAttribute Asset asset, @ModelAttribute Specification specification, @ModelAttribute Employee employee,
            @ModelAttribute Intervention intervention, Model model) {

        assetService.save(asset);

        model.addAttribute("asset", asset);
        model.addAttribute("specification", specification);
        model.addAttribute("employee", employee);
        model.addAttribute("intervention", intervention);

        return "results";
    }
}
