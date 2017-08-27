package com.axxes.persistence.domain;

import javax.persistence.*;

@Entity
@Table(name = "tag")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String value;

    public Tag(long id, String value) {
        this.id = id;
        this.value = value;
    }

    public Tag() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static class Builder {

        private long id;
        private String value;

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public Builder setValue(String value) {
            this.value = value;
            return this;
        }

        public Tag build() {
            return new Tag(id, value);
        }
    }
}