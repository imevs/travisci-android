package com.github.athieriot.android.travisci.core.entity;

import java.io.Serializable;

public class Build implements Serializable {

    private Long id;

    private String number;

    private String commit;

    private String branch;

    private String ref;

    private String state;

    private String pull_request;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPull_request() {
        return pull_request;
    }

    public void setPull_request(String pull_request) {
        this.pull_request = pull_request;
    }
}