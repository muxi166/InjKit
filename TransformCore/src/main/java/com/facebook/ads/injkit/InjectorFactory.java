// Copyright (c) Facebook, Inc. and its affiliates.

// This source code is licensed under the MIT license found in the
// LICENSE file in the root directory of this source tree.


package com.facebook.ads.injkit;

import java.net.URLClassLoader;

public interface InjectorFactory<ConfigurationT> {
    Injector make(URLClassLoader applicationCode, ConfigurationT configuration)
        throws InvalidAnnotationProcessorConfigurationException;
}