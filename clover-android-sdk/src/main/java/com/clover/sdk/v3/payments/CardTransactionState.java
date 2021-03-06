/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


package com.clover.sdk.v3.payments;

import android.os.Parcelable;
import android.os.Parcel;

@SuppressWarnings("all")
public enum CardTransactionState implements Parcelable {
  PENDING, CLOSED;

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(final Parcel dest, final int flags) {
    dest.writeString(name());
  }

  public static final Creator<CardTransactionState> CREATOR = new Creator<CardTransactionState>() {
    @Override
    public CardTransactionState createFromParcel(final Parcel source) {
      return CardTransactionState.valueOf(source.readString());
    }

    @Override
    public CardTransactionState[] newArray(final int size) {
      return new CardTransactionState[size];
    }
  };
}
