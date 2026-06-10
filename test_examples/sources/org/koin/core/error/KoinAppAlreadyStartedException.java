package org.koin.core.error;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lorg/koin/core/error/KoinAppAlreadyStartedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "koin-core"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class KoinAppAlreadyStartedException extends Exception {
    public KoinAppAlreadyStartedException() {
        super("A Koin Application has already been started");
    }
}
