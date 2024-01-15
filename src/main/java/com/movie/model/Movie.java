package com.movie.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private long id;

  @Column(name = "title")
  private String title;

  @Column(name = "summary")
  private String summary;

  @Column(name = "cover_image")
  private String coverImage;

  @Column(name = "genres")
  private String genres;

  @Column(name = "author")
  private String author;

  @Column(name = "tags")
  private String tags;

  @Column(name = "imdb_rating")
  private double imdbRating;

  @Column(name = "pdf_download_link")
  private String pdfDownloadLink;

  public Movie() {
    super();
  }

  public Movie(long id, String title, String summary, String coverImage, String genres, String author, String tags,
      double imdbRating, String pdfDownloadLink) {
    super();
    this.id = id;
    this.title = title;
    this.summary = summary;
    this.coverImage = coverImage;
    this.genres = genres;
    this.author = author;
    this.tags = tags;
    this.imdbRating = imdbRating;
    this.pdfDownloadLink = pdfDownloadLink;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public String getCoverImage() {
    return coverImage;
  }

  public void setCoverImage(String coverImage) {
    this.coverImage = coverImage;
  }

  public String getGenres() {
    return genres;
  }

  public void setGenres(String genres) {
    this.genres = genres;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public double getImdbRating() {
    return imdbRating;
  }

  public void setImdbRating(double imdbRating) {
    this.imdbRating = imdbRating;
  }

  public String getPdfDownloadLink() {
    return pdfDownloadLink;
  }

  public void setPdfDownloadLink(String pdfDownloadLink) {
    this.pdfDownloadLink = pdfDownloadLink;
  }
}
