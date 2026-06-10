package com.noto.app.util;

import ja.f0;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m0.b;
import m7.n;
import p7.c;

/* loaded from: classes.dex */
public final class FileUtilsKt {
    public static final Object a(InputStream inputStream, c<? super String> cVar) {
        return b.I1(cVar, f0.f12767b, new FileUtilsKt$readTextFromInputStream$2(inputStream, null));
    }

    public static final Object b(OutputStream outputStream, String str, c<? super n> cVar) {
        Object I1 = b.I1(cVar, f0.f12767b, new FileUtilsKt$writeTextToOutputStream$2(outputStream, str, null));
        if (I1 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return I1;
        }
        return n.f16010a;
    }
}
