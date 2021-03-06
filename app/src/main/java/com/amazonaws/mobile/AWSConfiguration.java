//
// Copyright 2017 Amazon.com, Inc. or its affiliates (Amazon). All Rights Reserved.
//
// Code generated by AWS Mobile Hub. Amazon gives unlimited permission to 
// copy, distribute and modify it.
//
// Source code generated from template: aws-my-sample-app-android v0.14
//
package com.amazonaws.mobile;

import com.amazonaws.regions.Regions;

/**
 * This class defines constants for the developer's resource
 * identifiers and API keys. This configuration should not
 * be shared or posted to any public source code repository.
 */
public class AWSConfiguration {
    // AWS MobileHub user agent string
    public static final String AWS_MOBILEHUB_USER_AGENT =
        "MobileHub 26a21539-a49b-4865-b4f9-f252c6e5af39 aws-my-sample-app-android-v0.14";
    // AMAZON COGNITO
    public static final Regions AMAZON_COGNITO_REGION =
      Regions.fromName("us-east-1");
    public static final String  AMAZON_COGNITO_IDENTITY_POOL_ID =
        "us-east-1:9353c706-cc01-4976-968d-f1efcb9d615c";
    // Google Client ID for Web application
    public static final String GOOGLE_CLIENT_ID =
        "1095629934829-ak52nbhep2pnul055fi43c6bu6ogarq7.apps.googleusercontent.com";
    public static final Regions AMAZON_DYNAMODB_REGION =
       Regions.fromName("us-east-1");
}
