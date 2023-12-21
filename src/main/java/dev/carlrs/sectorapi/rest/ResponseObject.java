package dev.carlrs.sectorapi.rest;

import java.util.List;

public class ResponseObject<T> {
    T data;

    List<ErrorMessage> errors;
}
