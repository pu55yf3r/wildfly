/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2018, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.wildfly.clustering.infinispan.spi.function;

import java.util.Set;

import org.kohsuke.MetaInfServices;
import org.wildfly.clustering.marshalling.Externalizer;

/**
 * Externalizer for instances of {@link ConcurrentSetAddFunction}.
 * @author Paul Ferraro
 * @param <V> the set element type
 */
@MetaInfServices(Externalizer.class)
public class ConcurrentSetAddFunctionExternalizer<V> extends AbstractFunctionExternalizer<V, Set<V>, ConcurrentSetAddFunction<V>> {

    public ConcurrentSetAddFunctionExternalizer() {
        super();
    }

    @SuppressWarnings("unchecked")
    @Override
    public Class<ConcurrentSetAddFunction<V>> getTargetClass() {
        return (Class<ConcurrentSetAddFunction<V>>) (Class<?>) ConcurrentSetAddFunction.class;
    }

    @Override
    public ConcurrentSetAddFunction<V> apply(V value) {
        return new ConcurrentSetAddFunction<>(value);
    }
}
