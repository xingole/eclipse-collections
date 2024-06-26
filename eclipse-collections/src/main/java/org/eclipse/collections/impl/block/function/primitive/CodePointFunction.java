/*
 * Copyright (c) 2022 Goldman Sachs and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompany this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 */

package org.eclipse.collections.impl.block.function.primitive;

import java.io.Serializable;

/**
 * A CharFunction can be used to convert one character to another.
 */
@FunctionalInterface
public interface CodePointFunction
        extends Serializable
{
    CodePointFunction TO_UPPERCASE = new CodePointFunction()
    {
        private static final long serialVersionUID = 1L;

        @Override
        public int valueOf(int codePoint)
        {
            return Character.toUpperCase(codePoint);
        }
    };

    CodePointFunction TO_LOWERCASE = new CodePointFunction()
    {
        private static final long serialVersionUID = 1L;

        @Override
        public int valueOf(int codePoint)
        {
            return Character.toLowerCase(codePoint);
        }
    };

    CodePointFunction PASS_THRU = new CodePointFunction()
    {
        private static final long serialVersionUID = 1L;

        @Override
        public int valueOf(int codePoint)
        {
            return codePoint;
        }
    };

    int valueOf(int codePoint);
}
