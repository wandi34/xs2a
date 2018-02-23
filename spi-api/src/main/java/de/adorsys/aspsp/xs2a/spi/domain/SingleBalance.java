package de.adorsys.aspsp.xs2a.spi.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * Created by aro on 23.11.17.
 */

@Data
@ApiModel(description = "Balance Information", value = "SingleBalance")
@JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)

public class SingleBalance {

    @ApiModelProperty(value = "amount", required = true)
    private Amount amount;

    @ApiModelProperty(value = "last action date time", example = "2007-01-01T17:30:12.000")
    private Date last_action_date_time;

    @ApiModelProperty(value = "Date", example = "2007-01-01")
    private Date date;
}
