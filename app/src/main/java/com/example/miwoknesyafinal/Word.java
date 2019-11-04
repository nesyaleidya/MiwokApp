package com.example.miwoknesyafinal;

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourceID = Word.NO_IMAGE_PROVIDED;

    private int mAudioResourceID;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceID) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mAudioResourceID = audioResourceID;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID, int audioResourceID) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mImageResourceID = imageResourceID;
        this.mAudioResourceID = audioResourceID;
    }

    public String getDefaultTranslation() {
        return this.mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return this.mMiwokTranslation;
    }

    public int getImageResourceID() {
        return this.mImageResourceID;
    }

    public boolean hasImage() {
        return this.mImageResourceID != Word.NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceID() {
        return this.mAudioResourceID;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceID=" + mImageResourceID +
                ", mAudioResourceID=" + mAudioResourceID +
                '}';
    }
}
