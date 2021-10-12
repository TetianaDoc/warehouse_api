package com.gmail.doctatyana1.warehouse_api.http.dto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Main rest controller for API.
 */

@RestController
@RequestMapping(
        value = {"/api/v1"},
        produces = {"application/json"}
)
public final class ApiRestController {
    static final String VERSION = "v1.01";
    @GetMapping(
            value = {"/version"})
            public VersionResponse getVersion(){
                return new VersionResponse (VERSION);
            }
}
