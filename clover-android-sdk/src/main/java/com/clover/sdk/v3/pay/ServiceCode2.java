/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


package com.clover.sdk.v3.pay;

import android.os.Parcelable;
import android.os.Parcel;

@SuppressWarnings("all")
public enum ServiceCode2 implements Parcelable {
  NORMAL, CONTACT_ISSUER_VIA_ONLINE_MEANS, CONTACT_ISSUER_VIA_ONLINE_MEANS_EXCEPT_UNDER_BILATERAL_AGREEMENT, UNDEFINED;

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(final Parcel dest, final int flags) {
    dest.writeString(name());
  }

  public static final Creator<ServiceCode2> CREATOR = new Creator<ServiceCode2>() {
    @Override
    public ServiceCode2 createFromParcel(final Parcel source) {
      return ServiceCode2.valueOf(source.readString());
    }

    @Override
    public ServiceCode2[] newArray(final int size) {
      return new ServiceCode2[size];
    }
  };
}
