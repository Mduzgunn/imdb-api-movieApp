package com.movie.imdbapi.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@JacksonStdImpl
@Builder
public class Data {

    @JsonProperty(value = "searchType")
    private String searchType;

    //expression
    @JsonProperty(value = "expression")
    private String expression;

    @JsonProperty(value = "results")
    private List<SearchResult> results=null;



}
