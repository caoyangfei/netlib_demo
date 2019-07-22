/*
 * Copyright (C) 2017 zhouyou(478319399@qq.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.flyang.netlib.cache.stategy;


import com.flyang.netlib.cache.RxCache;
import com.flyang.netlib.cache.model.CacheResult;

import java.lang.reflect.Type;

import io.reactivex.Flowable;

/**
 * @author caoyangfei
 * @ClassName OnlyRemoteStrategy
 * @date 2019/7/22
 * ------------- Description -------------
 * 只请求网络,缓存数据(反射使用)
 */
public final class OnlyRemoteStrategy extends BaseStrategy {
    @Override
    public <T> Flowable<CacheResult<T>> execute(RxCache rxCache, String key, long time, Flowable<T> source, Type type) {
        return loadRemote(rxCache, key, source, false);
    }
}
