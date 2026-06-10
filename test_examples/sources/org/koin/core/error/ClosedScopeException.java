package org.koin.core.error;

import kotlin.Metadata;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lorg/koin/core/error/ClosedScopeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "koin-core"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class ClosedScopeException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClosedScopeException(String str) {
        super(str);
        g.f(str, "msg");
    }
}
