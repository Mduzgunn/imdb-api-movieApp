package com.movie.imdbapi.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

import java.util.Arrays;

@JacksonStdImpl
public class Movie {

    @JsonProperty(value = "SearchType")
    private String searchType;
    @JsonProperty(value = "Expression")
    private String expression;
    @JsonProperty(value = "Response")
    private Result[] results;
    @JsonProperty(value = "ErrorMesssage")
    private String errorMessage;

    public Movie(String searchType, String expression, Result[] results, String errorMessage) {
        this.searchType = searchType;
        this.expression = expression;
        this.results = results;
        this.errorMessage = errorMessage;
    }

    public Movie() {
    }

    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public Result[] getResults() {
        return results;
    }

    public void setResults(Result[] results) {
        this.results = results;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    ////////////////

    @Override
    public String toString() {
        return "Movie{" +
                "searchType='" + searchType + '\'' +
                ", expression='" + expression + '\'' +
                ", results=" + Arrays.toString(results) +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
