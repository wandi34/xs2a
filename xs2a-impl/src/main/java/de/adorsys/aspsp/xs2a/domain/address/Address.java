/*
 * Copyright 2018-2018 adorsys GmbH & Co KG
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.adorsys.aspsp.xs2a.domain.address;


import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Size;

@Data
@ApiModel(description = "Address", value = "Address")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Address {

    @ApiModelProperty(value = "Street", required = false, example = "Herrnstraße")
    @Size(max = 70)
    private String street;

    @ApiModelProperty(value = "Building number", required = false, example = "123-34")
    private String buildingNumber;

    @ApiModelProperty(value = "City", required = false, example = "Nürnberg")
    private String city;

    @ApiModelProperty(value = "Postal code", required = false, example = "90431")
    private String postalCode;

    @ApiModelProperty(value = "Country", required = true)
    private CountryCode country;
}
