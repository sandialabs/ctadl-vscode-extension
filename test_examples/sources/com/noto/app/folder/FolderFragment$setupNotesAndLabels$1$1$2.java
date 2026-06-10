package com.noto.app.folder;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.StateFlowImpl;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lt6/c;", "kotlin.jvm.PlatformType", "label", "Lm7/n;", "invoke", "(Lt6/c;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class FolderFragment$setupNotesAndLabels$1$1$2 extends Lambda implements u7.l<t6.c, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ List<y6.h> f8398j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ FolderFragment f8399k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderFragment$setupNotesAndLabels$1$1$2(List<y6.h> list, FolderFragment folderFragment) {
        super(1);
        this.f8398j = list;
        this.f8399k = folderFragment;
    }

    @Override // u7.l
    public final m7.n U(t6.c cVar) {
        boolean z10;
        t6.c cVar2 = cVar;
        for (y6.h hVar : this.f8398j) {
            long j2 = hVar.f18912a.f17615a;
            long j10 = cVar2.f17615a;
            if (j2 == j10) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                int i10 = FolderFragment.f8358k0;
                boolean z11 = hVar.f18913b;
                FolderFragment folderFragment = this.f8399k;
                if (z11) {
                    FolderViewModel a02 = folderFragment.a0();
                    StateFlowImpl stateFlowImpl = a02.f8435o;
                    Iterable<y6.h> iterable = (Iterable) ((kotlinx.coroutines.flow.m) a02.l()).getValue();
                    ArrayList arrayList = new ArrayList(n7.l.Z1(iterable, 10));
                    for (y6.h hVar2 : iterable) {
                        if (hVar2.f18912a.f17615a == j10) {
                            hVar2 = y6.h.a(hVar2, false);
                        }
                        arrayList.add(hVar2);
                    }
                    stateFlowImpl.setValue(arrayList);
                } else {
                    FolderViewModel a03 = folderFragment.a0();
                    StateFlowImpl stateFlowImpl2 = a03.f8435o;
                    Iterable<y6.h> iterable2 = (Iterable) ((kotlinx.coroutines.flow.m) a03.l()).getValue();
                    ArrayList arrayList2 = new ArrayList(n7.l.Z1(iterable2, 10));
                    for (y6.h hVar3 : iterable2) {
                        if (hVar3.f18912a.f17615a == j10) {
                            hVar3 = y6.h.a(hVar3, true);
                        }
                        arrayList2.add(hVar3);
                    }
                    stateFlowImpl2.setValue(arrayList2);
                }
                return m7.n.f16010a;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
