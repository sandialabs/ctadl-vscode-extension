package com.noto.app.util;

import androidx.datastore.preferences.PreferencesProto$Value;
import ha.a;
import ja.x;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.util.FileUtilsKt$readTextFromInputStream$2", f = "FileUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FileUtilsKt$readTextFromInputStream$2 extends SuspendLambda implements p<x, p7.c<? super String>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ InputStream f9817m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileUtilsKt$readTextFromInputStream$2(InputStream inputStream, p7.c<? super FileUtilsKt$readTextFromInputStream$2> cVar) {
        super(2, cVar);
        this.f9817m = inputStream;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super String> cVar) {
        return ((FileUtilsKt$readTextFromInputStream$2) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new FileUtilsKt$readTextFromInputStream$2(this.f9817m, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        b.n1(obj);
        InputStreamReader inputStreamReader = new InputStreamReader(this.f9817m, a.f11600a);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[8192];
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read >= 0) {
                    stringWriter.write(cArr, 0, read);
                } else {
                    String stringWriter2 = stringWriter.toString();
                    g.e(stringWriter2, "buffer.toString()");
                    b.D(inputStreamReader, null);
                    return stringWriter2;
                }
            }
        } finally {
        }
    }
}
