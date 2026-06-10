package com.noto.app.util;

import androidx.datastore.preferences.PreferencesProto$Value;
import ha.a;
import ja.x;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.util.FileUtilsKt$writeTextToOutputStream$2", f = "FileUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FileUtilsKt$writeTextToOutputStream$2 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ OutputStream f9818m;
    public final /* synthetic */ String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileUtilsKt$writeTextToOutputStream$2(OutputStream outputStream, String str, p7.c<? super FileUtilsKt$writeTextToOutputStream$2> cVar) {
        super(2, cVar);
        this.f9818m = outputStream;
        this.n = str;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((FileUtilsKt$writeTextToOutputStream$2) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new FileUtilsKt$writeTextToOutputStream$2(this.f9818m, this.n, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        b.n1(obj);
        OutputStream outputStream = this.f9818m;
        try {
            byte[] bytes = this.n.getBytes(a.f11600a);
            g.e(bytes, "this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
            n nVar = n.f16010a;
            b.D(outputStream, null);
            return n.f16010a;
        } finally {
        }
    }
}
