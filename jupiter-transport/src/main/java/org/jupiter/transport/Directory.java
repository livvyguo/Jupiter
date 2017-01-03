/*
 * Copyright (c) 2015 The Jupiter Project
 *
 * Licensed under the Apache License, version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jupiter.transport;

import org.jupiter.common.util.StringBuilderHelper;

/**
 * 目录服务
 *
 * jupiter
 * org.jupiter.transport
 *
 * @author jiachun.fjc
 */
public abstract class Directory {

    private String directoryCache;

    /** 服务所属组别 */
    public abstract String getGroup();

    /** 服务版本 */
    public abstract String getVersion();

    /** 服务名称 */
    public abstract String getServiceProviderName();

    public String directory() {
        if (directoryCache != null) {
            return directoryCache;
        }

        StringBuilder buf = StringBuilderHelper.get();
        buf.append(getGroup())
                .append('-')
                .append(getVersion())
                .append('-')
                .append(getServiceProviderName());

        directoryCache = buf.toString();

        return directoryCache;
    }

    public void clear() {
        directoryCache = null;
    }
}
