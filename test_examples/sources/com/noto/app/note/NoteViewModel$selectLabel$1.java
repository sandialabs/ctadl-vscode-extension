package com.noto.app.note;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NoteViewModel$selectLabel$1", f = "NoteViewModel.kt", l = {179}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteViewModel$selectLabel$1 extends SuspendLambda implements u7.p<x, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f9317m;
    public final /* synthetic */ NoteViewModel n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ long f9318o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteViewModel$selectLabel$1(NoteViewModel noteViewModel, long j2, p7.c<? super NoteViewModel$selectLabel$1> cVar) {
        super(2, cVar);
        this.n = noteViewModel;
        this.f9318o = j2;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super m7.n> cVar) {
        return ((NoteViewModel$selectLabel$1) a(xVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        return new NoteViewModel$selectLabel$1(this.n, this.f9318o, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        boolean booleanValue;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f9317m;
        if (i10 != 0) {
            if (i10 == 1) {
                m0.b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            NoteViewModel noteViewModel = this.n;
            long j2 = ((t6.d) noteViewModel.h().getValue()).f17621a;
            long j10 = this.f9318o;
            if (j2 == 0) {
                Map map = (Map) ((kotlinx.coroutines.flow.m) noteViewModel.f()).getValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap(m0.b.O0(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    if (((t6.c) entry.getKey()).f17615a == j10) {
                        booleanValue = true;
                    } else {
                        booleanValue = ((Boolean) entry.getValue()).booleanValue();
                    }
                    linkedHashMap.put(key, Boolean.valueOf(booleanValue));
                }
                noteViewModel.f9272s.setValue(linkedHashMap);
            } else {
                t6.e eVar = new t6.e(((t6.d) noteViewModel.h().getValue()).f17621a, j10);
                this.f9317m = 1;
                if (noteViewModel.f9261g.c(eVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return m7.n.f16010a;
    }
}
