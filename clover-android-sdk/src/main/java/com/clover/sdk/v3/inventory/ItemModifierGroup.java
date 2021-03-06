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
public final class ItemModifierGroup implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public com.clover.sdk.v3.inventory.Item getItem() {
    return cacheGet(CacheKey.item);
  }
  public com.clover.sdk.v3.inventory.ModifierGroup getModifierGroup() {
    return cacheGet(CacheKey.modifierGroup);
  }


  private enum CacheKey {
    item {
      @Override
      public Object extractValue(ItemModifierGroup instance) {
        return instance.extractItem();
      }
    },
    modifierGroup {
      @Override
      public Object extractValue(ItemModifierGroup instance) {
        return instance.extractModifierGroup();
      }
    },
    ;

    public abstract Object extractValue(ItemModifierGroup instance);
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
  public ItemModifierGroup() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public ItemModifierGroup(String json) throws java.lang.IllegalArgumentException {
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
  public ItemModifierGroup(org.json.JSONObject jsonObject) {
    this.jsonObject = jsonObject;
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public ItemModifierGroup(ItemModifierGroup src) {
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
    com.clover.sdk.v3.inventory.Item item = getItem();
    if (item == null) throw new java.lang.IllegalArgumentException("'item' is required to be non-null");

    com.clover.sdk.v3.inventory.ModifierGroup modifierGroup = getModifierGroup();
    if (modifierGroup == null) throw new java.lang.IllegalArgumentException("'modifierGroup' is required to be non-null");
  }



  private com.clover.sdk.v3.inventory.Item extractItem() {
    org.json.JSONObject jsonObj = getJSONObject().optJSONObject("item");
    if (jsonObj != null) {
      return new com.clover.sdk.v3.inventory.Item(getJSONObject().optJSONObject("item"));
    }
    return null;
  }


  private com.clover.sdk.v3.inventory.ModifierGroup extractModifierGroup() {
    org.json.JSONObject jsonObj = getJSONObject().optJSONObject("modifierGroup");
    if (jsonObj != null) {
      return new com.clover.sdk.v3.inventory.ModifierGroup(getJSONObject().optJSONObject("modifierGroup"));
    }
    return null;
  }


  /** Checks whether the 'item' field is set and is not null */
  public boolean isNotNullItem() {
    return cacheValueIsNotNull(CacheKey.item);
  }

  /** Checks whether the 'modifierGroup' field is set and is not null */
  public boolean isNotNullModifierGroup() {
    return cacheValueIsNotNull(CacheKey.modifierGroup);
  }


  /** Checks whether the 'item' field has been set, however the value could be null */
  public boolean hasItem() {
    return cacheHasKey(CacheKey.item);
  }

  /** Checks whether the 'modifierGroup' field has been set, however the value could be null */
  public boolean hasModifierGroup() {
    return cacheHasKey(CacheKey.modifierGroup);
  }


  /**
   * Sets the field 'item'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public ItemModifierGroup setItem(com.clover.sdk.v3.inventory.Item item) {
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

  /**
   * Sets the field 'modifierGroup'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public ItemModifierGroup setModifierGroup(com.clover.sdk.v3.inventory.ModifierGroup modifierGroup) {
    logChange("modifierGroup");

    try {
      getJSONObject().put("modifierGroup",
          modifierGroup == null ? org.json.JSONObject.NULL : modifierGroup.getJSONObject());
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.modifierGroup);
    return this;
  }


  /** Clears the 'item' field, the 'has' method for this field will now return false */
  public void clearItem() {
    unlogChange("item");
    getJSONObject().remove("item");
    cacheRemoveValue(CacheKey.item);
  }

  /** Clears the 'modifierGroup' field, the 'has' method for this field will now return false */
  public void clearModifierGroup() {
    unlogChange("modifierGroup");
    getJSONObject().remove("modifierGroup");
    cacheRemoveValue(CacheKey.modifierGroup);
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
  public ItemModifierGroup copyChanges() {
    ItemModifierGroup copy = new ItemModifierGroup();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(ItemModifierGroup src) {
    if (src.changeLog != null) {
      try {
        // Make a copy of the source so the destination fields are copies
        org.json.JSONObject srcObj = new ItemModifierGroup(src).getJSONObject();
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

    return "ItemModifierGroup{" +
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

  public static final android.os.Parcelable.Creator<ItemModifierGroup> CREATOR = new android.os.Parcelable.Creator<ItemModifierGroup>() {
    @Override
    public ItemModifierGroup createFromParcel(android.os.Parcel in) {
      ItemModifierGroup instance = new ItemModifierGroup(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.bundle = in.readBundle(getClass().getClassLoader());
      instance.changeLog = in.readBundle();
      return instance;
    }

    @Override
    public ItemModifierGroup[] newArray(int size) {
      return new ItemModifierGroup[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<ItemModifierGroup> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<ItemModifierGroup>() {
    @Override
    public ItemModifierGroup create(org.json.JSONObject jsonObject) {
      return new ItemModifierGroup(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ITEM_IS_REQUIRED = true;

    public static final boolean MODIFIERGROUP_IS_REQUIRED = true;

  }

}
