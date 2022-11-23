package com.acem.spring.demo.builder;


import com.acem.spring.demo.constant.ResponseMessageConstant;
import com.acem.spring.demo.response.Response;
import org.springframework.http.HttpStatus;

public class ResponseBuilder {

    public static Response success(String description) {
        return new Response()
                .success(true)
                .description(description)
                .statusCode(HttpStatus.OK.value());
    }

    public static Response success(String description, Object data) {
        return new Response()
                .data(data)
                .success(true)
                .description(description)
                .statusCode(HttpStatus.OK.value());
    }

    public static Response notFound(String description) {
        return new Response()
                .success(false)
                .description(description)
                .statusCode(HttpStatus.NOT_FOUND.value());
    }

    public static Response failure(String description) {
        return new Response()
                .success(false)
                .description(description)
                .statusCode(HttpStatus.BAD_REQUEST.value());
    }

    public static Response serverError() {
        return new Response()
                .success(false)
                .description(ResponseMessageConstant.SERVER_ERROR)
                .statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
    }

    public static Response invalidPathParameter() {
        return new Response()
                .success(false)
                .description(ResponseMessageConstant.INVALID_PATH_PARAMETER)
                .statusCode(HttpStatus.BAD_REQUEST.value());
    }

    public static Response validationFailed(Object error) {
        return new Response()
                .success(false)
                .error(error)
                .description(ResponseMessageConstant.INVALID_REQUEST_BODY)
                .statusCode(HttpStatus.BAD_REQUEST.value());
    }

}
