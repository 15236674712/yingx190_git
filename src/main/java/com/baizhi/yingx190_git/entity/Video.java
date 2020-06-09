package com.baizhi.yingx190_git.entity;

public class Video {

    private String id;
    private String title;
    private String path;
    private String cover;

    public Video() {
    }

    @Override
    public String toString() {
        return "Video{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", path='" + path + '\'' +
                ", cover='" + cover + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Video(String id, String title, String path, String cover) {
        this.id = id;
        this.title = title;
        this.path = path;
        this.cover = cover;
    }
}
