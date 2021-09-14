package com.example.flixster.models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class movie {

    String posterPath;
    String title;
    String overview;

    public movie(JSONObject jsonObject) throws JSONException {
        posterPath = jsonObject.getString("poster_path");
        title = jsonObject.getString("title");
        overview = jsonObject.getString("overview");
    }

    public static List<movie> fromJsonArray(JSONArray movieJsonArray){
        List<movie> movies = new ArrayList<>();
        for( int i = 0; i < movieJsonArray.length(); i++) {
            movies.add(new movie(movieJsonArray.getJSONObject(i)));
        }
    }
}
