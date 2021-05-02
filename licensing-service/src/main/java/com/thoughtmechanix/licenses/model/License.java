package com.thoughtmechanix.licenses.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class License {

    private String id;
    private String organizationId;
    private String productName;
    private String licenseType;
}
