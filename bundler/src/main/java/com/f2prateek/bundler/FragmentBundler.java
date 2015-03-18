package com.f2prateek.bundler;


import android.app.Fragment;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * A Bundler that can create and set Bundle arguments to Fragments
 *
 * @param <F> The fragment type you're bundling to.
 */
@SuppressWarnings("unchecked")
public class FragmentBundler<F extends Fragment> extends Bundler {

  private final F fragment;

  private FragmentBundler(F fragment) {
    this.fragment = fragment;
  }

  /**
   * Constructs a FragmentBundler for the provided Fragment instance
   *
   * @param fragment the fragment instance
   * @return this bundler instance to chain method calls
   */
  public static <F extends Fragment> FragmentBundler<F> make(F fragment) {
    return new FragmentBundler<F>(fragment);
  }

  /**
   * Constructs a FragmentBundler for the provided Fragment class
   *
   * @param klass the fragment class
   * @return this bundler instance to chain method calls
   */
  public static <F extends Fragment> FragmentBundler<F> make(Class<F> klass) {
    try {
      return make(klass.newInstance());
    } catch (InstantiationException e) {
      throw new IllegalArgumentException("Class must have a no-arguments constructor");
    } catch (IllegalAccessException e) {
      throw new IllegalArgumentException("Class must have a no-arguments constructor");
    }
  }

  /**
   * Sets this bundle's contents to the fragment arguments and returns the fragment.
   *
   * @return the fragment with this bundler's content set as arguments
   */
  public F build() {
    fragment.setArguments(copy());
    return fragment;
  }

  /**
   * Inserts a Boolean value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key   a String, or null
   * @param value a Boolean, or null
   * @return this bundler instance to chain method calls
   */
  @Override
  public FragmentBundler<F> put(String key, boolean value) {
    return (FragmentBundler<F>) super.put(key, value);
  }

  /**
   * Inserts a boolean array value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key   a String, or null
   * @param value a boolean array object, or null
   * @return this bundler instance to chain method calls
   */
  @Override
  public FragmentBundler<F> put(String key, boolean[] value) {
    return (FragmentBundler<F>) super.put(key, value);
  }

  /**
   * Inserts an int value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.
   *
   * @param key   a String, or null
   * @param value an int, or null
   * @return this bundler instance to chain method calls
   */
  @Override
  public FragmentBundler<F> put(String key, int value) {
    return (FragmentBundler<F>) super.put(key, value);
  }

  /**
   * Inserts an int array value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key   a String, or null
   * @param value an int array object, or null
   * @return this bundler instance to chain method calls
   */
  @Override
  public FragmentBundler<F> put(String key, int[] value) {
    return (FragmentBundler<F>) super.put(key, value);
  }

  /**
   * Inserts an ArrayList<Integer> value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key   a String, or null
   * @param value an ArrayList<Integer> object, or null
   * @return this bundler instance to chain method calls
   */
  @Override
  public FragmentBundler<F> putIntegerArrayList(String key, ArrayList<Integer> value) {
    return (FragmentBundler<F>) super.putIntegerArrayList(key, value);
  }

  /**
   * Inserts a Bundle value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key   a String, or null
   * @param value a Bundle object, or null
   * @return this bundler instance to chain method calls
   */
  @Override
  public FragmentBundler<F> put(String key, Bundle value) {
    return (FragmentBundler<F>) super.put(key, value);
  }

  /**
   * Inserts a byte value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.
   *
   * @param key   a String, or null
   * @param value a byte
   * @return this bundler instance to chain method calls
   */
  @Override
  public FragmentBundler<F> put(String key, byte value) {
    return (FragmentBundler<F>) super.put(key, value);
  }

  /**
   * Inserts a byte array value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key   a String, or null
   * @param value a byte array object, or null
   * @return this bundler instance to chain method calls
   */
  @Override
  public FragmentBundler<F> put(String key, byte[] value) {
    return (FragmentBundler<F>) super.put(key, value);
  }

  /**
   * Inserts a String value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key   a String, or null
   * @param value a String, or null
   * @return this bundler instance to chain method calls
   */
  @Override
  public FragmentBundler<F> put(String key, String value) {
    return (FragmentBundler<F>) super.put(key, value);
  }

  /**
   * Inserts a String array value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key   a String, or null
   * @param value a String array object, or null
   * @return this bundler instance to chain method calls
   */
  @Override
  public FragmentBundler<F> put(String key, String[] value) {
    return (FragmentBundler<F>) super.put(key, value);
  }

  /**
   * Inserts an ArrayList<String> value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key   a String, or null
   * @param value an ArrayList<String> object, or null
   * @return this bundler instance to chain method calls
   */
  @Override
  public FragmentBundler<F> putStringArrayList(String key, ArrayList<String> value) {
    return (FragmentBundler<F>) super.putStringArrayList(key, value);
  }

  /**
   * Inserts a long value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.
   *
   * @param key   a String, or null
   * @param value a long
   * @return this bundler instance to chain method calls
   */
  @Override
  public FragmentBundler<F> put(String key, long value) {
    return (FragmentBundler<F>) super.put(key, value);
  }

  /**
   * Inserts a long array value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key   a String, or null
   * @param value a long array object, or null
   * @return this bundler instance to chain method calls
   */
  @Override
  public FragmentBundler<F> put(String key, long[] value) {
    return (FragmentBundler<F>) super.put(key, value);
  }

  /**
   * Inserts a float value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.
   *
   * @param key   a String, or null
   * @param value a float
   * @return this bundler instance to chain method calls
   */
  @Override
  public FragmentBundler<F> put(String key, float value) {
    return (FragmentBundler<F>) super.put(key, value);
  }

  /**
   * Inserts a float array value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key   a String, or null
   * @param value a float array object, or null
   * @return this bundler instance to chain method calls
   */
  @Override
  public FragmentBundler<F> put(String key, float[] value) {
    return (FragmentBundler<F>) super.put(key, value);
  }

  /**
   * Inserts a char value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.
   *
   * @param key   a String, or null
   * @param value a char, or null
   * @return this bundler instance to chain method calls
   */
  @Override
  public FragmentBundler<F> put(String key, char value) {
    return (FragmentBundler<F>) super.put(key, value);
  }

  /**
   * Inserts a char array value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key   a String, or null
   * @param value a char array object, or null
   * @return this bundler instance to chain method calls
   */
  @Override
  public FragmentBundler<F> put(String key, char[] value) {
    return (FragmentBundler<F>) super.put(key, value);
  }

  /**
   * Inserts a CharSequence value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key   a String, or null
   * @param value a CharSequence, or null
   * @return this bundler instance to chain method calls
   */
  @Override
  public FragmentBundler<F> put(String key, CharSequence value) {
    return (FragmentBundler<F>) super.put(key, value);
  }

  /**
   * Inserts a CharSequence array value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key   a String, or null
   * @param value a CharSequence array object, or null
   * @return this bundler instance to chain method calls
   */
  @Override
  public FragmentBundler<F> put(String key, CharSequence[] value) {
    return (FragmentBundler<F>) super.put(key, value);
  }

  /**
   * Inserts an ArrayList<CharSequence> value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key   a String, or null
   * @param value an ArrayList<CharSequence> object, or null
   * @return this bundler instance to chain method calls
   */
  @Override
  public FragmentBundler<F> putCharSequenceArrayList(String key, ArrayList<CharSequence> value) {
    return (FragmentBundler<F>) super.putCharSequenceArrayList(key, value);
  }

  /**
   * Inserts a double value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.
   *
   * @param key   a String, or null
   * @param value a double
   * @return this bundler instance to chain method calls
   */
  @Override
  public FragmentBundler<F> put(String key, double value) {
    return (FragmentBundler<F>) super.put(key, value);
  }

  /**
   * Inserts a double array value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key   a String, or null
   * @param value a double array object, or null
   * @return this bundler instance to chain method calls
   */
  @Override
  public FragmentBundler<F> put(String key, double[] value) {
    return (FragmentBundler<F>) super.put(key, value);
  }

  /**
   * Inserts a Parcelable value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key   a String, or null
   * @param value a Parcelable object, or null
   * @return this bundler instance to chain method calls
   */
  @Override
  public FragmentBundler<F> put(String key, Parcelable value) {
    return (FragmentBundler<F>) super.put(key, value);
  }

  /**
   * Inserts an array of Parcelable values into the mapping of the underlying Bundle,
   * replacing any existing value for the given key.  Either key or value may
   * be null.
   *
   * @param key   a String, or null
   * @param value an array of Parcelable objects, or null
   * @return this bundler instance to chain method calls
   */
  @Override
  public FragmentBundler<F> put(String key, Parcelable[] value) {
    return (FragmentBundler<F>) super.put(key, value);
  }

  /**
   * Inserts a List of Parcelable values into the mapping of the underlying Bundle,
   * replacing any existing value for the given key.  Either key or value may
   * be null.
   *
   * @param key   a String, or null
   * @param value an ArrayList of Parcelable objects, or null
   * @return this bundler instance to chain method calls
   */
  @Override
  public FragmentBundler<F> putParcelableArrayList(String key, ArrayList<? extends Parcelable> value) {
    return (FragmentBundler<F>) super.putParcelableArrayList(key, value);
  }

  /**
   * Inserts a SparceArray of Parcelable values into the mapping of this
   * Bundle, replacing any existing value for the given key.  Either key
   * or value may be null.
   *
   * @param key   a String, or null
   * @param value a SparseArray of Parcelable objects, or null
   * @return this bundler instance to chain method calls
   */
  @Override
  public FragmentBundler<F> putSparseParcelableArray(String key, SparseArray<? extends Parcelable> value) {
    return (FragmentBundler<F>) super.putSparseParcelableArray(key, value);
  }

  /**
   * Inserts a short value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.
   *
   * @param key   a String, or null
   * @param value a short
   * @return this bundler instance to chain method calls
   */
  @Override
  public FragmentBundler<F> put(String key, short value) {
    return (FragmentBundler<F>) super.put(key, value);
  }

  /**
   * Inserts a short array value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key   a String, or null
   * @param value a short array object, or null
   * @return this bundler instance to chain method calls
   */
  @Override
  public FragmentBundler<F> put(String key, short[] value) {
    return (FragmentBundler<F>) super.put(key, value);
  }

  /**
   * Inserts a Serializable value into the mapping of the underlying Bundle, replacing
   * any existing value for the given key.  Either key or value may be null.
   *
   * @param key   a String, or null
   * @param value a Serializable object, or null
   * @return this bundler instance to chain method calls
   */
  @Override
  public FragmentBundler<F> put(String key, Serializable value) {
    return (FragmentBundler<F>) super.put(key, value);
  }

  /**
   * Inserts all mappings from the given Bundle into the underlying Bundle.
   *
   * @param bundle a Bundle
   * @return this bundler instance to chain method calls
   */
  @Override
  public FragmentBundler<F> putAll(Bundle bundle) {
    return (FragmentBundler<F>) super.putAll(bundle);
  }
}
