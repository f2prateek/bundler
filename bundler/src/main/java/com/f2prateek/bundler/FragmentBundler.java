package com.f2prateek.bundler;


import android.app.Fragment;

/**
 * Set fragment arguments like a Pro.
 * @param <F> The fragment to setup.
 */
public class FragmentBundler<F extends Fragment> {

  private final F fragment;
  private final FragmentBundleBuilder<F> bundlerBuilder;

  private FragmentBundler(F fragment) {
    this.fragment = fragment;
    bundlerBuilder = new FragmentBundleBuilder<F>(this);
  }

  public static <F extends Fragment> FragmentBundleBuilder<F> make(F fragment) {
    return new FragmentBundler<F>(fragment).bundle();
  }

  public static <F extends Fragment> FragmentBundleBuilder<F> make(Class<F> klass)
      throws IllegalAccessException, InstantiationException {
    return make(klass.newInstance());
  }

  public F build() {
    fragment.setArguments(bundlerBuilder.copy());
    return fragment;
  }

  public FragmentBundleBuilder<F> bundle() {
    return bundlerBuilder;
  }
}
