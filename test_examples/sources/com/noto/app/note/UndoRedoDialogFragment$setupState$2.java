package com.noto.app.note;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.datastore.preferences.PreferencesProto$Value;
import f7.q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import s6.r;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lt6/a;", "folder", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.UndoRedoDialogFragment$setupState$2", f = "UndoRedoDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class UndoRedoDialogFragment$setupState$2 extends SuspendLambda implements u7.p<t6.a, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f9385m;
    public final /* synthetic */ UndoRedoDialogFragment n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ r f9386o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UndoRedoDialogFragment$setupState$2(UndoRedoDialogFragment undoRedoDialogFragment, r rVar, p7.c<? super UndoRedoDialogFragment$setupState$2> cVar) {
        super(2, cVar);
        this.n = undoRedoDialogFragment;
        this.f9386o = rVar;
    }

    @Override // u7.p
    public final Object R(t6.a aVar, p7.c<? super m7.n> cVar) {
        return ((UndoRedoDialogFragment$setupState$2) a(aVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        UndoRedoDialogFragment$setupState$2 undoRedoDialogFragment$setupState$2 = new UndoRedoDialogFragment$setupState$2(this.n, this.f9386o, cVar);
        undoRedoDialogFragment$setupState$2.f9385m = obj;
        return undoRedoDialogFragment$setupState$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x01a1, code lost:
        if (r6.j0().c != false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0127 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        String str;
        boolean z10;
        boolean z11;
        m0.b.n1(obj);
        t6.a aVar = (t6.a) this.f9385m;
        UndoRedoDialogFragment undoRedoDialogFragment = this.n;
        Context j2 = undoRedoDialogFragment.j();
        r rVar = this.f9386o;
        if (j2 != null) {
            int b5 = q.b(j2, q.j(aVar.f17595e));
            rVar.f17462b.c.setTextColor(b5);
            Drawable background = rVar.f17462b.f17312d.getBackground();
            if (background != null) {
                background.setTint(b5);
            }
        }
        int[] iArr = undoRedoDialogFragment.j0().f371g;
        int[] iArr2 = undoRedoDialogFragment.j0().f372h;
        v7.g.f(iArr, "<this>");
        v7.g.f(iArr2, "other");
        int min = Math.min(iArr.length, iArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(new Pair(Integer.valueOf(iArr[i10]), Integer.valueOf(iArr2[i10])));
        }
        String[] strArr = undoRedoDialogFragment.j0().f373i;
        v7.g.f(strArr, "other");
        int length = strArr.length;
        ArrayList arrayList2 = new ArrayList(Math.min(n7.l.Z1(arrayList, 10), length));
        Iterator it = arrayList.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (i11 >= length) {
                break;
            }
            arrayList2.add(new Pair(next, strArr[i11]));
            i11++;
        }
        ArrayList arrayList3 = new ArrayList(n7.l.Z1(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            Pair pair2 = (Pair) pair.f12962i;
            arrayList3.add(new Triple(pair2.f12962i, pair2.f12963j, pair.f12963j));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (hashSet.add((String) ((Triple) next2).f12974k)) {
                arrayList4.add(next2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            Object next3 = it4.next();
            if (true ^ ha.i.T0((CharSequence) ((Triple) next3).f12974k)) {
                arrayList5.add(next3);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            Object next4 = it5.next();
            Triple triple = (Triple) next4;
            if (!ha.i.T0((CharSequence) triple.f12974k)) {
                int intValue = ((Number) triple.f12973j).intValue();
                String substring = ((String) triple.f12974k).substring(a1.c.c0(((Number) triple.f12972i).intValue(), 0, intValue), intValue);
                v7.g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                Character z12 = ha.j.z1(substring);
                if (z12 == null || !a1.b.o0(z12.charValue())) {
                    z11 = false;
                    if (!z11) {
                        arrayList6.add(next4);
                    }
                }
            }
            z11 = true;
            if (!z11) {
            }
        }
        if (undoRedoDialogFragment.j0().f368d) {
            str = undoRedoDialogFragment.j0().f369e;
            z10 = true;
            if (undoRedoDialogFragment.j0().c) {
                UndoRedoDialogFragment.h0(undoRedoDialogFragment, rVar, arrayList6, str, z10, aVar.f17595e);
                rVar.f17461a.f0(UndoRedoDialogFragment.g0(undoRedoDialogFragment, arrayList6));
            }
            UndoRedoDialogFragment.h0(undoRedoDialogFragment, rVar, arrayList6, str, z10, aVar.f17595e);
            rVar.f17461a.f0(0);
        } else {
            str = undoRedoDialogFragment.j0().f370f;
            z10 = false;
        }
        return m7.n.f16010a;
    }
}
