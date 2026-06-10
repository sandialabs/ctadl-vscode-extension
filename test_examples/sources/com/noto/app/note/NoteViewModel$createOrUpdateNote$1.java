package com.noto.app.note;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.util.ModelUtilsKt;
import ja.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NoteViewModel$createOrUpdateNote$1", f = "NoteViewModel.kt", l = {114, 122, 124}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NoteViewModel$createOrUpdateNote$1 extends SuspendLambda implements u7.p<x, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public NoteViewModel f9294m;
    public Iterator n;

    /* renamed from: o  reason: collision with root package name */
    public int f9295o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ NoteViewModel f9296p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ String f9297q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ String f9298r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ boolean f9299s;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lt6/d;", "createdNote", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @q7.c(c = "com.noto.app.note.NoteViewModel$createOrUpdateNote$1$1", f = "NoteViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.noto.app.note.NoteViewModel$createOrUpdateNote$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements u7.p<t6.d, p7.c<? super m7.n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ Object f9300m;
        public final /* synthetic */ NoteViewModel n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NoteViewModel noteViewModel, p7.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.n = noteViewModel;
        }

        @Override // u7.p
        public final Object R(t6.d dVar, p7.c<? super m7.n> cVar) {
            return ((AnonymousClass1) a(dVar, cVar)).k(m7.n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.n, cVar);
            anonymousClass1.f9300m = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            m0.b.n1(obj);
            this.n.f9267m.setValue((t6.d) this.f9300m);
            return m7.n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteViewModel$createOrUpdateNote$1(NoteViewModel noteViewModel, String str, String str2, boolean z10, p7.c<? super NoteViewModel$createOrUpdateNote$1> cVar) {
        super(2, cVar);
        this.f9296p = noteViewModel;
        this.f9297q = str;
        this.f9298r = str2;
        this.f9299s = z10;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super m7.n> cVar) {
        return ((NoteViewModel$createOrUpdateNote$1) a(xVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        return new NoteViewModel$createOrUpdateNote$1(this.f9296p, this.f9297q, this.f9298r, this.f9299s, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010b A[LOOP:2: B:39:0x0105->B:41:0x010b, LOOP_END] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        String str;
        String str2;
        String str3;
        Object g10;
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f9295o;
        NoteViewModel noteViewModel = this.f9296p;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        m0.b.n1(obj);
                        return m7.n.f16010a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = this.n;
                noteViewModel = this.f9294m;
                m0.b.n1(obj);
            } else {
                m0.b.n1(obj);
                g10 = obj;
                long longValue = ((Number) g10).longValue();
                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(noteViewModel, null), new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(noteViewModel.f9259e.f(longValue))), a1.b.d0(noteViewModel));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((Map) ((kotlinx.coroutines.flow.m) noteViewModel.f()).getValue()).entrySet()) {
                    if (((Boolean) entry.getValue()).booleanValue()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Set<t6.c> keySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(n7.l.Z1(keySet, 10));
                for (t6.c cVar : keySet) {
                    arrayList.add(new t6.e(longValue, cVar.f17615a));
                }
                it = arrayList.iterator();
            }
        } else {
            m0.b.n1(obj);
            t6.d dVar = (t6.d) noteViewModel.h().getValue();
            boolean z10 = this.f9299s;
            String str4 = this.f9297q;
            if (!z10) {
                str = str4;
            } else {
                str = null;
            }
            if (str == null) {
                str2 = kotlin.text.b.w1(str4).toString();
            } else {
                str2 = str;
            }
            String str5 = this.f9298r;
            if (!z10) {
                str3 = str5;
            } else {
                str3 = null;
            }
            if (str3 == null) {
                str3 = kotlin.text.b.w1(str5).toString();
            }
            t6.d a10 = t6.d.a(dVar, 0L, 0L, str2, str3, 0, false, false, null, null, 0, 4083);
            if (ModelUtilsKt.w(a10)) {
                long j2 = a10.f17621a;
                u6.d dVar2 = noteViewModel.f9259e;
                if (j2 == 0) {
                    this.f9295o = 1;
                    g10 = dVar2.g(a10, true, this);
                    if (g10 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    long longValue2 = ((Number) g10).longValue();
                    kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(noteViewModel, null), new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(noteViewModel.f9259e.f(longValue2))), a1.b.d0(noteViewModel));
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    while (r5.hasNext()) {
                    }
                    Set<t6.c> keySet2 = linkedHashMap2.keySet();
                    ArrayList arrayList2 = new ArrayList(n7.l.Z1(keySet2, 10));
                    while (r5.hasNext()) {
                    }
                    it = arrayList2.iterator();
                } else {
                    this.f9295o = 3;
                    if (dVar2.c(a10, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return m7.n.f16010a;
        }
        while (it.hasNext()) {
            u6.c cVar2 = noteViewModel.f9261g;
            this.f9294m = noteViewModel;
            this.n = it;
            this.f9295o = 2;
            if (cVar2.c((t6.e) it.next(), this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return m7.n.f16010a;
    }
}
