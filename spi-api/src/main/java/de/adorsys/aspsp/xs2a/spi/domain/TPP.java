package de.adorsys.aspsp.xs2a.spi.domain;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by aro on 23.11.17.
 */

@Data
@JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)

public class TPP {
    //TO DO... I defined the TPP attributes as string because they aren't still defined. 
	//This information will be in the certificate 
	
	private String tpp_provider_identification;
	private String tpp_registration_number;
	private String tpp_name;
	private String tpp_role;
	private String tpp_national_competent_authority;
	private String tpp_certificate;
	private String tpp_signature;
	private String tpp_signature_data;
	private TPPMessageInformation tpp_messages;
	
	
	
}