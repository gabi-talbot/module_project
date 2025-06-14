module com.udacity.catpoint.image {

    exports com.udacity.catpoint.image.service;

    requires software.amazon.awssdk.auth;
    requires software.amazon.awssdk.services.rekognition;
    requires com.udacity.catpoint.image;
}