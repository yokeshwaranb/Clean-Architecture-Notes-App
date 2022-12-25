package com.training.cleanarchitecturenotesapp.business.domain.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Note implements Parcelable {

    private String id;
    private String title;
    private String body;
    private String updated_at;
    private String created_at;

    public Note(String id, String title, String body, String updated_at, String created_at) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.updated_at = updated_at;
        this.created_at = created_at;
    }

    protected Note(Parcel in) {
        id = in.readString();
        title = in.readString();
        body = in.readString();
        updated_at = in.readString();
        created_at = in.readString();
    }

    public static final Creator<Note> CREATOR = new Creator<Note>() {
        @Override
        public Note createFromParcel(Parcel in) {
            return new Note(in);
        }

        @Override
        public Note[] newArray(int size) {
            return new Note[size];
        }
    };

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

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(title);
        dest.writeString(body);
        dest.writeString(updated_at);
        dest.writeString(created_at);
    }
}
