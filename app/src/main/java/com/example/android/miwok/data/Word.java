package com.example.android.miwok.data;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Andrey Radionov
 */

public class Word implements Parcelable {
    private static final int NO_IMAGE_PROVIDED = -1;
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId;
    private int mAudioResourceId;

    public Word(String defaultTranslation,
                String miwokTranslation,
                int imageResourceId,
                int audioResourceId) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        this(defaultTranslation, miwokTranslation, NO_IMAGE_PROVIDED, audioResourceId);
    }

    public Word(Parcel in) {
        mDefaultTranslation = in.readString();
        mMiwokTranslation = in.readString();
        mImageResourceId = in.readInt();
        mAudioResourceId = in.readInt();
    }

    public static final Creator<Word> CREATOR = new Creator<Word>() {
        @Override
        public Word createFromParcel(Parcel in) {
            return new Word(in);
        }

        @Override
        public Word[] newArray(int size) {
            return new Word[size];
        }
    };

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mDefaultTranslation);
        dest.writeString(mMiwokTranslation);
        dest.writeInt(mImageResourceId);
        dest.writeInt(mAudioResourceId);
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
