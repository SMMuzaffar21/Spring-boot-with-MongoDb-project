package com.example.demo.models;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Arrays;
@Document(collection = "JobPost")
public class Post {

    @Field("desc")
    public String description;
    @Field("exp")
    public int experience;
    @Field("profile")
    public String profile;
    @Field("techs")
    public String technologies[];

    public Post() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String[] getTechnologies() {
        return technologies;
    }

    public void setTechnologies(String[] technologies) {
        this.technologies = technologies;
    }

    @Override
    public String toString() {
        return "Post{" +
                "description='" + description + '\'' +
                ", experience=" + experience +
                ", profile='" + profile + '\'' +
                ", technologies=" + Arrays.toString(technologies) +
                '}';
    }
}
