/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


package com.clover.sdk.v3.cash;

import android.os.Parcelable;
import android.os.Parcel;

@SuppressWarnings("all")
public enum Type implements Parcelable {
  LOAD, TRANSACTION, OPEN, ADJUSTMENT, COUNT, UNLOAD;

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(final Parcel dest, final int flags) {
    dest.writeString(name());
  }

  public static final Creator<Type> CREATOR = new Creator<Type>() {
    @Override
    public Type createFromParcel(final Parcel source) {
      return Type.valueOf(source.readString());
    }

    @Override
    public Type[] newArray(final int size) {
      return new Type[size];
    }
  };
}
