package com.example.flixster.models;

import org.json.JSONException;
import org.json.JSONObject;

public class movie {

    String posterPath;
    String title;
    String overview;

    public movie(JSONObject jsonObject) throws JSONException {
        posterPath = jsonObject.getString("poster_path");
        title = jsonObject.getString("title");
        overview = jsonObject.getString("overview");
    }
}
