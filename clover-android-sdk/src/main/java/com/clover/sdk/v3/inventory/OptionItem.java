/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2015 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.inventory;

@SuppressWarnings("all")
/** This class represents the association between an item and an option */
public final class OptionItem implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

 /**
   * Reference to an option
  */
  public com.clover.sdk.v3.base.Reference getOption() {
    return cacheGet(CacheKey.option);
  }
 /**
   * Reference to an item
  */
  public com.clover.sdk.v3.base.Reference getItem() {
    return cacheGet(CacheKey.item);
  }


  private enum CacheKey {
    option {
      @Override
      public Object extractValue(OptionItem instance) {
        return instance.extractOption();
      }
    },
    item {
      @Override
      public Object extractValue(OptionItem instance) {
        return instance.extractItem();
      }
    },
    ;

    public abstract Object extractValue(OptionItem instance);
  }

  private org.json.JSONObject jsonObject = null;
  private android.os.Bundle bundle = null;
  private android.os.Bundle changeLog = null;
  private Object[] cache = null;
  private byte[] cacheState = null;

  private static final byte STATE_NOT_CACHED = 0;
  private static final byte STATE_CACHED_NO_VALUE = 1;
  private static final byte STATE_CACHED_VALUE = 2;

  /**
   * Constructs a new empty instance.
   */
  public OptionItem() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public OptionItem(String json) throws java.lang.IllegalArgumentException {
    try {
      this.jsonObject = new org.json.JSONObject(json);
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public OptionItem(org.json.JSONObject jsonObject) {
    this.jsonObject = jsonObject;
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public OptionItem(OptionItem src) {
    if (src.jsonObject != null) {
      this.jsonObject = com.clover.sdk.v3.JsonHelper.deepCopy(src.getJSONObject());
    }
  }

  private <T> T cacheGet(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return (T) cache[index];
  }

  private boolean cacheValueIsNotNull(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return cache[index] != null;
  }

  private boolean cacheHasKey(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return cacheState[index] == STATE_CACHED_VALUE;
  }

  private void cacheRemoveValue(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    cache[index] = null;
    cacheState[index] = STATE_CACHED_NO_VALUE;
  }

  private void cacheMarkDirty(CacheKey key) {
    if (cache != null) {
      int index = key.ordinal();
      cache[index] = null;
      cacheState[index] = STATE_NOT_CACHED;
    }
  }

  private void populateCache(int index) {
    if (cache == null) {
      int size = CacheKey.values().length;
      cache = new Object[size];
      cacheState = new byte[size];
    }

    if (cacheState[index] == STATE_NOT_CACHED) {
      CacheKey key = CacheKey.values()[index];

      if (getJSONObject().has(key.name())) {
        cache[index] = key.extractValue(this);
        cacheState[index] = STATE_CACHED_VALUE;
      } else {
        cacheState[index] = STATE_CACHED_NO_VALUE;
      }
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    if (jsonObject == null) {
      jsonObject = new org.json.JSONObject();
    }
    return jsonObject;
  }


  @Override
  public void validate() {
  }



  private com.clover.sdk.v3.base.Reference extractOption() {
    org.json.JSONObject jsonObj = getJSONObject().optJSONObject("option");
    if (jsonObj != null) {
      return new com.clover.sdk.v3.base.Reference(getJSONObject().optJSONObject("option"));
    }
    return null;
  }


  private com.clover.sdk.v3.base.Reference extractItem() {
    org.json.JSONObject jsonObj = getJSONObject().optJSONObject("item");
    if (jsonObj != null) {
      return new com.clover.sdk.v3.base.Reference(getJSONObject().optJSONObject("item"));
    }
    return null;
  }


  /** Checks whether the 'option' field is set and is not null */
  public boolean isNotNullOption() {
    return cacheValueIsNotNull(CacheKey.option);
  }

  /** Checks whether the 'item' field is set and is not null */
  public boolean isNotNullItem() {
    return cacheValueIsNotNull(CacheKey.item);
  }


  /** Checks whether the 'option' field has been set, however the value could be null */
  public boolean hasOption() {
    return cacheHasKey(CacheKey.option);
  }

  /** Checks whether the 'item' field has been set, however the value could be null */
  public boolean hasItem() {
    return cacheHasKey(CacheKey.item);
  }


  /**
   * Sets the field 'option'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public OptionItem setOption(com.clover.sdk.v3.base.Reference option) {
    logChange("option");

    try {
      getJSONObject().put("option",
          option == null ? org.json.JSONObject.NULL : option.getJSONObject());
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.option);
    return this;
  }

  /**
   * Sets the field 'item'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public OptionItem setItem(com.clover.sdk.v3.base.Reference item) {
    logChange("item");

    try {
      getJSONObject().put("item",
          item == null ? org.json.JSONObject.NULL : item.getJSONObject());
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.item);
    return this;
  }


  /** Clears the 'option' field, the 'has' method for this field will now return false */
  public void clearOption() {
    unlogChange("option");
    getJSONObject().remove("option");
    cacheRemoveValue(CacheKey.option);
  }

  /** Clears the 'item' field, the 'has' method for this field will now return false */
  public void clearItem() {
    unlogChange("item");
    getJSONObject().remove("item");
    cacheRemoveValue(CacheKey.item);
  }


  private void logChange(java.lang.String field) {
    if (changeLog == null) {
      changeLog = new android.os.Bundle();
    }
    changeLog.putString(field, null);
  }

  private void unlogChange(java.lang.String field) {
    if (changeLog != null) {
      changeLog.remove(field);
    }
  }

  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return changeLog != null;
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    changeLog = null;
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public OptionItem copyChanges() {
    OptionItem copy = new OptionItem();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(OptionItem src) {
    if (src.changeLog != null) {
      try {
        // Make a copy of the source so the destination fields are copies
        org.json.JSONObject srcObj = new OptionItem(src).getJSONObject();
        org.json.JSONObject dstObj = getJSONObject();
        for (java.lang.String field : src.changeLog.keySet()) {
          dstObj.put(field, srcObj.get(field));
          logChange(field);
        }
      } catch (org.json.JSONException e) {
        throw new java.lang.IllegalArgumentException(e);
      }
    }
  }


  /**
   * Gets a Bundle which can be used to get and set data attached to this instance. The attached Bundle will be
   * parcelled but not jsonified.
   */
  public android.os.Bundle getBundle() {
    if (bundle == null) {
      bundle = new android.os.Bundle();
    }
    return bundle;
  }

  @Override
  public String toString() {
    String json = getJSONObject().toString();

    if (bundle != null) {
      bundle.isEmpty(); // Triggers unparcel
    }

    if (changeLog != null) {
      changeLog.isEmpty(); // Triggers unparcel
    }

    return "OptionItem{" +
        "json='" + json + "'" +
        ", bundle=" + bundle +
        ", changeLog=" + changeLog +
        '}';
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(android.os.Parcel dest, int flags) {
	  com.clover.sdk.v3.JsonParcelHelper.wrap(getJSONObject()).writeToParcel(dest, 0);
    dest.writeBundle(bundle);
    dest.writeBundle(changeLog);
  }

  public static final android.os.Parcelable.Creator<OptionItem> CREATOR = new android.os.Parcelable.Creator<OptionItem>() {
    @Override
    public OptionItem createFromParcel(android.os.Parcel in) {
      OptionItem instance = new OptionItem(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.bundle = in.readBundle(getClass().getClassLoader());
      instance.changeLog = in.readBundle();
      return instance;
    }

    @Override
    public OptionItem[] newArray(int size) {
      return new OptionItem[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<OptionItem> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<OptionItem>() {
    @Override
    public OptionItem create(org.json.JSONObject jsonObject) {
      return new OptionItem(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean OPTION_IS_REQUIRED = false;

    public static final boolean ITEM_IS_REQUIRED = false;

  }

}
