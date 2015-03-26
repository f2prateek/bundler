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
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class) //
@Config(manifest = Config.NONE) //
public class BundlerTest {
  Bundle bundle;

  @Before public void setup() {
    bundle = new Bundle();
  }

  static BundleAssert assertThat(Bundle bundle) {
    return new BundleAssert(bundle);
  }

  @Test public void copyOfCreatesCopy() {
    Bundler.copyOf(bundle).put("foo", "bar");
    assertThat(bundle).doesNotHaveKey("foo");
  }

  @Test public void ofDelegatesToSource() {
    Bundler.of(bundle).put("foo", "bar");
    assertThat(bundle).contains("foo", "bar");
  }

  @Test public void copyCreatesCopy() {
    Bundler bundler = Bundler.of(bundle);

    Bundle copy = bundler.copy();
    bundler.put("foo", "bar");

    assertThat(bundle).hasKey("foo");
    assertThat(copy).doesNotHaveKey("foo");
  }

  @Test public void put() {
    ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
    integerArrayList.add(3);
    Bundle b = new Bundle();
    ArrayList<String> stringArrayList = new ArrayList<String>();
    stringArrayList.add("a string");
    ArrayList<CharSequence> charSequenceArrayList = new ArrayList<CharSequence>();
    charSequenceArrayList.add("a sequence");

    Bundler.of(bundle)
        .put("boolean", false)
        .put("boolean[]", new boolean[] { false, true })
        .put("int", 4)
        .put("int[]", 10)
        .put("ArrayList<Integer>", integerArrayList)
        .put("Bundle", b)
        .put("byte", (byte) 0)
        .put("byte[]", new byte[] { 1, 2 })
        .put("string", "bundler")
        .put("string[]", new String[] { "foo", "bar" })
        .put("long", 20L)
        .put("long[]", new long[] { 4L, 5L })
        .put("float", 3.14F)
        .put("float[]", new float[] { 2.72F, 4F })
        .put("char", new float[] { 2.72F, 4F })
        .put("char[]", new float[] { 2.72F, 4F })
        .put("CharSequence", new float[] { 2.72F, 4F })
        .put("ArrayList<CharSequence>", charSequenceArrayList)
        .put("double", Math.PI)
        .put("double[]", new double[] { Math.PI, Math.E })
        .put("short", (short) 4)
        .put("short[]", new short[] { 1, 3 });

    assertThat(bundle) //
        .contains("boolean", false)
        .contains("boolean[]", new boolean[] { false, true })
        .contains("int", 4)
        .contains("int[]", 10)
        .contains("ArrayList<Integer>", integerArrayList)
        .contains("Bundle", b)
        .contains("byte", (byte) 0)
        .contains("byte[]", new byte[] { 1, 2 })
        .contains("string", "bundler")
        .contains("string[]", new String[] { "foo", "bar" })
        .contains("long", 20L)
        .contains("long[]", new long[] { 4L, 5L })
        .contains("float", 3.14F)
        .contains("float[]", new float[] { 2.72F, 4F })
        .contains("char", new float[] { 2.72F, 4F })
        .contains("char[]", new float[] { 2.72F, 4F })
        .contains("CharSequence", new float[] { 2.72F, 4F })
        .contains("ArrayList<CharSequence>", charSequenceArrayList)
        .contains("double", Math.PI)
        .contains("double[]", new double[] { Math.PI, Math.E })
        .contains("short", (short) 4)
        .contains("short[]", new short[] { 1, 3 });
  }
}
