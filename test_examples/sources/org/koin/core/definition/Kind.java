package org.koin.core.definition;

import java.util.Arrays;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lorg/koin/core/definition/Kind;", "", "koin-core"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public enum Kind {
    Singleton,
    Factory,
    /* JADX INFO: Fake field, exist only in values array */
    Scoped;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static Kind[] valuesCustom() {
        return (Kind[]) Arrays.copyOf(values(), 3);
    }
}
