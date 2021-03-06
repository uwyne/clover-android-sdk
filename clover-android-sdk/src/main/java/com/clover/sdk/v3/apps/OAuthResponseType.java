/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


package com.clover.sdk.v3.apps;

import android.os.Parcelable;
import android.os.Parcel;

@SuppressWarnings("all")
public enum OAuthResponseType implements Parcelable {
  TOKEN, CODE;

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(final Parcel dest, final int flags) {
    dest.writeString(name());
  }

  public static final Creator<OAuthResponseType> CREATOR = new Creator<OAuthResponseType>() {
    @Override
    public OAuthResponseType createFromParcel(final Parcel source) {
      return OAuthResponseType.valueOf(source.readString());
    }

    @Override
    public OAuthResponseType[] newArray(final int size) {
      return new OAuthResponseType[size];
    }
  };
}
