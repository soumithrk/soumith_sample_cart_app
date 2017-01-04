package com.ekart.springbootjetty.sample.apis.controller.dtos;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author paras.narang
 */
@ApiModel(description = "Create Receive Request DTO")
public class CreateRequestResponse {

    @ApiModelProperty(name = "request_id", value = "Id of the created request", required = true)
    @JsonProperty(value = "request_id")
    private String requestId;

    public CreateRequestResponse() {

    }

    public CreateRequestResponse(String requestId) {

        this.requestId = requestId;
    }

    public String getRequestId() {

        return requestId;
    }

    public void setRequestId(String requestId) {

        this.requestId = requestId;
    }

    @Override
    public String toString() {

        return "CreateRequestResponse{" + "requestId='" + requestId + '\'' + '}';
    }
}