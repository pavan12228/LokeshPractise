package com.example.ravi.lokeshpractise.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ravi on 13-11-2016.
 */
//public class First {
//
//    @SerializedName("title")
//    @Expose
//    private String title;
//    @SerializedName("image")
//    @Expose
//    private String image;
//    @SerializedName("rating")
//    @Expose
//    private Double rating;
//    @SerializedName("releaseYear")
//    @Expose
//    private Integer releaseYear;
//    @SerializedName("genre")
//    @Expose
//    private List<String> genre = new ArrayList<String>();
//
//    /**
//     *
//     * @return
//     * The title
//     */
//    public String getTitle() {
//        return title;
//    }
//
//    /**
//     *
//     * @param title
//     * The title
//     */
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    /**
//     *
//     * @return
//     * The image
//     */
//    public String getImage() {
//        return image;
//    }
//
//    /**
//     *
//     * @param image
//     * The image
//     */
//    public void setImage(String image) {
//        this.image = image;
//    }
//
//    /**
//     *
//     * @return
//     * The rating
//     */
//    public Double getRating() {
//        return rating;
//    }
//
//    /**
//     *
//     * @param rating
//     * The rating
//     */
//    public void setRating(Double rating) {
//        this.rating = rating;
//    }
//
//    /**
//     *
//     * @return
//     * The releaseYear
//     */
//    public Integer getReleaseYear() {
//        return releaseYear;
//    }
//
//    /**
//     *
//     * @param releaseYear
//     * The releaseYear
//     */
//    public void setReleaseYear(Integer releaseYear) {
//        this.releaseYear = releaseYear;
//    }
//
//    /**
//     *
//     * @return
//     * The genre
//     */
//    public List<String> getGenre() {
//        return genre;
//    }
//
//    /**
//     *
//     * @param genre
//     * The genre
//     */
//    public void setGenre(List<String> genre) {
//        this.genre = genre;
//    }
//
//}
public class First {
    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("image")
    @Expose
    private String image;

    @SerializedName("rating")
    @Expose
    private Double rating;

    @SerializedName("release_year")
    @Expose
    private int releaseYear;

    @SerializedName("genre")
    @Expose
    private List<String> genre = new ArrayList<>();;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public List<String> getGenre() {

        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

}
