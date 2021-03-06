package com.f2prateek.bundler;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.fail;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(RobolectricTestRunner.class) //
@Config(manifest = Config.NONE) //
public class FragmentBundlerCompatTest {

  @Test public void testSetsArgumentsCorrectly() {
    Fragment fragment = mock(Fragment.class);
    fragment =
        FragmentBundlerCompat.create(fragment).put("KEY_A", "a string").put("KEY_B", 2).build();

    Bundle bundle = new Bundle();
    bundle.putString("KEY_A", "a string");
    bundle.putInt("KEY_B", 2);

    verify(fragment).setArguments(bundle);
  }

  static class FooFragment extends Fragment {
    public FooFragment(@SuppressWarnings("UnusedParameters") String arg) {
    }
  }

  @Test public void testRequiresNoArgsConstructorForFragments() {
    try {
      FragmentBundlerCompat.create(FooFragment.class);
      fail();
    } catch (IllegalArgumentException e) {
      assertThat(e).hasMessage("Class must have a no-arguments constructor.");
    }
  }
}
