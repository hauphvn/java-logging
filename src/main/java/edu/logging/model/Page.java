package edu.logging.model;

public class Page {
    private String name;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Page(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public Page() {
    }

    @Override
    public String toString() {
        return name + " / " + url;
    }
}
