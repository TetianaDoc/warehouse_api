package com.gmail.doctatyana1.warehouse_api.http.dto;

/**
 * Dto response for {@link ApiRestController#getVersion()} method.
 */

public final class VersionResponse {
    private final String version;

    public VersionResponse(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }
}
