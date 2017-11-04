package assetmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import assetmanagement.service.AddressService;

@Controller
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping(value = "/addresses")
    public ModelAndView showAddresses() {

        return new ModelAndView("addresses", "addresses", addressService.findAll());
    }
}
