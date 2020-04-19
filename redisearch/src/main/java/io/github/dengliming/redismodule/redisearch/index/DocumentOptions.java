/*
 * Copyright 2020 dengliming.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.dengliming.redismodule.redisearch.index;

/**
 * @author dengliming
 */
public class DocumentOptions {
    private RSLanguage language;
    private ReplacePolicy replacePolicy;
    private String replaceCondition;
    private boolean noSave;

    public RSLanguage getLanguage() {
        return language;
    }

    public ReplacePolicy getReplacePolicy() {
        return replacePolicy;
    }

    public String getReplaceCondition() {
        return replaceCondition;
    }

    public boolean isNoSave() {
        return noSave;
    }

    public DocumentOptions setNoSave(boolean noSave) {
        this.noSave = noSave;
        return this;
    }

    public DocumentOptions setLanguage(RSLanguage language) {
        this.language = language;
        return this;
    }

    public DocumentOptions setReplaceCondition(ReplacePolicy replacePolicy, String condition) {
        this.replacePolicy = replacePolicy;
        this.replaceCondition = condition;
        return this;
    }

    public enum ReplacePolicy {
        NONE, PARTIAL, NOCREATE;
    }
}
