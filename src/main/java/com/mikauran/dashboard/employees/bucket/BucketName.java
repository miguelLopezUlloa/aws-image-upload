package com.mikauran.dashboard.employees.bucket;

public enum BucketName {

    PROFILE_IMAGE("mikauran-amigos-upload");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
