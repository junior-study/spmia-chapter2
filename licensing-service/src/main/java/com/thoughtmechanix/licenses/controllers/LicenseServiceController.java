package com.thoughtmechanix.licenses.controllers;

import com.thoughtmechanix.licenses.model.License;
import com.thoughtmechanix.licenses.services.LicenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "v1/organizations/{organizationId}/licenses")
@RequiredArgsConstructor
public class LicenseServiceController {

    private final LicenseService licenseService;

    @GetMapping("/{licenseId}")
    public License getLicenses(@PathVariable("organizationId") String organizationId,
                               @PathVariable("licenseId") String licenseId) {

        return licenseService.getLicense(organizationId, licenseId);
    }

    @PutMapping("/{licenseId}")
    public String updateLicenses(@PathVariable("licenseId") String licenseId) {
        return String.format("This is the put");
    }

    @PostMapping("/{licenseId}")
    public String saveLicenses(@PathVariable("licenseId") String licenseId) {
        return String.format("This is the post");
    }

    @DeleteMapping("/{licenseId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteLicenses(@PathVariable("licenseId") String licenseId) {
        return String.format("This is the Delete");
    }
}
