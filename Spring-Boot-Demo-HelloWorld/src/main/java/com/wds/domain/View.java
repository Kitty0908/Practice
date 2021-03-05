package com.wds.domain;

public class View {

    private Integer id;

    private String content;

    public View() {
    }

    public View(Integer id, String userName) {
        this.id = id;
        this.content = userName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
