/*
 * Copyright 2014 Prateek Srivastava
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.f2prateek.bundler;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Fluent API for {@link android.os.Bundle}
 * Usage: {@code Bundle bundle = new Bundler().put(....).put(....).get();}
 */
public class Bundler {

  private final Bundle bundle;

  /** Construct a new {@link Bundler} instance. */
  public Bundler() {
    bundle = new Bundle();
  }

  /** Constructs a new Bundler instance that delegates to  {@code bundle}. */
  public Bundler(Bundle bundle) {
    this.bundle = bundle;
  }

  /**
   * Inserts a Boolean value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key a String, or null
   * @param value a Boolean, or null
   */
  public Bundler put(String key, boolean value) {
    bundle.putBoolean(key, value);
    return this;
  }

  /**
   * Inserts a boolean array value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key a String, or null
   * @param value a boolean array object, or null
   */
  public Bundler put(String key, boolean[] value) {
    bundle.putBooleanArray(key, value);
    return this;
  }

  /**
   * Inserts an int value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.
   *
   * @param key a String, or null
   * @param value an int, or null
   */
  public Bundler put(String key, int value) {
    bundle.putInt(key, value);
    return this;
  }

  /**
   * Inserts an int array value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key a String, or null
   * @param value an int array object, or null
   */
  public Bundler put(String key, int[] value) {
    bundle.putIntArray(key, value);
    return this;
  }

  /**
   * Inserts an ArrayList<Integer> value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key a String, or null
   * @param value an ArrayList<Integer> object, or null
   */
  public Bundler putIntegerArrayList(String key, ArrayList<Integer> value) {
    bundle.putIntegerArrayList(key, value);
    return this;
  }

  /**
   * Inserts a Bundle value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key a String, or null
   * @param value a Bundle object, or null
   */
  public Bundler put(String key, Bundle value) {
    bundle.putBundle(key, value);
    return this;
  }

  /**
   * Inserts a byte value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.
   *
   * @param key a String, or null
   * @param value a byte
   */
  public Bundler put(String key, byte value) {
    bundle.putByte(key, value);
    return this;
  }

  /**
   * Inserts a byte array value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key a String, or null
   * @param value a byte array object, or null
   */
  public Bundler put(String key, byte[] value) {
    bundle.putByteArray(key, value);
    return this;
  }

  /**
   * Inserts a String value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key a String, or null
   * @param value a String, or null
   */
  public Bundler put(String key, String value) {
    bundle.putString(key, value);
    return this;
  }

  /**
   * Inserts a String array value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key a String, or null
   * @param value a String array object, or null
   */
  public Bundler put(String key, String[] value) {
    bundle.putStringArray(key, value);
    return this;
  }

  /**
   * Inserts an ArrayList<String> value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key a String, or null
   * @param value an ArrayList<String> object, or null
   */
  public Bundler putStringArrayList(String key, ArrayList<String> value) {
    bundle.putStringArrayList(key, value);
    return this;
  }

  /**
   * Inserts a long value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.
   *
   * @param key a String, or null
   * @param value a long
   */
  public Bundler put(String key, long value) {
    bundle.putLong(key, value);
    return this;
  }

  /**
   * Inserts a long array value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key a String, or null
   * @param value a long array object, or null
   */
  public Bundler put(String key, long[] value) {
    bundle.putLongArray(key, value);
    return this;
  }

  /**
   * Inserts a float value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.
   *
   * @param key a String, or null
   * @param value a float
   */
  public Bundler put(String key, float value) {
    bundle.putFloat(key, value);
    return this;
  }

  /**
   * Inserts a float array value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key a String, or null
   * @param value a float array object, or null
   */
  public Bundler put(String key, float[] value) {
    bundle.putFloatArray(key, value);
    return this;
  }

  /**
   * Inserts a char value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.
   *
   * @param key a String, or null
   * @param value a char, or null
   */
  public Bundler put(String key, char value) {
    bundle.putChar(key, value);
    return this;
  }

  /**
   * Inserts a char array value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key a String, or null
   * @param value a char array object, or null
   */
  public Bundler put(String key, char[] value) {
    bundle.putCharArray(key, value);
    return this;
  }

  /**
   * Inserts a CharSequence value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key a String, or null
   * @param value a CharSequence, or null
   */
  public Bundler put(String key, CharSequence value) {
    bundle.putCharSequence(key, value);
    return this;
  }

  /**
   * Inserts a CharSequence array value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key a String, or null
   * @param value a CharSequence array object, or null
   */
  public Bundler put(String key, CharSequence[] value) {
    bundle.putCharSequenceArray(key, value);
    return this;
  }

  /**
   * Inserts an ArrayList<CharSequence> value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key a String, or null
   * @param value an ArrayList<CharSequence> object, or null
   */
  public Bundler putCharSequenceArrayList(String key, ArrayList<CharSequence> value) {
    bundle.putCharSequenceArrayList(key, value);
    return this;
  }

  /**
   * Inserts a double value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.
   *
   * @param key a String, or null
   * @param value a double
   */
  public Bundler put(String key, double value) {
    bundle.putDouble(key, value);
    return this;
  }

  /**
   * Inserts a double array value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key a String, or null
   * @param value a double array object, or null
   */
  public Bundler put(String key, double[] value) {
    bundle.putDoubleArray(key, value);
    return this;
  }

  /**
   * Inserts a Parcelable value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key a String, or null
   * @param value a Parcelable object, or null
   */
  public Bundler put(String key, Parcelable value) {
    bundle.putParcelable(key, value);
    return this;
  }

  /**
   * Inserts an array of Parcelable values into the mapping of the underlying Bundle,
   * replacing any existing value for the given key.  Either key or value may
   * be null.
   *
   * @param key a String, or null
   * @param value an array of Parcelable objects, or null
   */
  public Bundler put(String key, Parcelable[] value) {
    bundle.putParcelableArray(key, value);
    return this;
  }

  /**
   * Inserts a List of Parcelable values into the mapping of the underlying Bundle,
   * replacing any existing value for the given key.  Either key or value may
   * be null.
   *
   * @param key a String, or null
   * @param value an ArrayList of Parcelable objects, or null
   */
  public Bundler putParcelableArrayList(String key, ArrayList<? extends Parcelable> value) {
    bundle.putParcelableArrayList(key, value);
    return this;
  }

  /**
   * Inserts a SparceArray of Parcelable values into the mapping of this
   * Bundle, replacing any existing value for the given key.  Either key
   * or value may be null.
   *
   * @param key a String, or null
   * @param value a SparseArray of Parcelable objects, or null
   */
  public Bundler putSparseParcelableArray(String key, SparseArray<? extends Parcelable> value) {
    bundle.putSparseParcelableArray(key, value);
    return this;
  }

  /**
   * Inserts a short value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.
   *
   * @param key a String, or null
   * @param value a short
   */
  public Bundler put(String key, short value) {
    bundle.putShort(key, value);
    return this;
  }

  /**
   * Inserts a short array value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key a String, or null
   * @param value a short array object, or null
   */
  public Bundler put(String key, short[] value) {
    bundle.putShortArray(key, value);
    return this;
  }

  /**
   * Inserts a Serializable value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key a String, or null
   * @param value a Serializable object, or null
   */
  public Bundler put(String key, Serializable value) {
    bundle.putSerializable(key, value);
    return this;
  }

  /**
   * Inserts all mappings from the given Bundle into the underlying Bundle.
   *
   * @param bundle a Bundle
   */
  public Bundler putAll(Bundle bundle) {
    bundle.putAll(bundle);
    return this;
  }

  /**
   * Get the underlying bundle.
   */
  public Bundle get() {
    return bundle;
  }

  /**
   * Copy the underlying bundle.
   */
  public Bundle copy() {
    return new Bundle(bundle);
  }

  /**
   * Initialize a Bundler that is copied form the given bundle. The bundle that is passed will not
   * be modified.
   */
  public static Bundler copyFrom(Bundle bundle) {
    return new Bundler().putAll(bundle);
  }
}