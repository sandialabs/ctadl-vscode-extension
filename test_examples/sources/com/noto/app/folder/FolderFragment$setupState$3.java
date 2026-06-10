package com.noto.app.folder;

import android.content.Context;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.R;
import com.noto.app.domain.model.FilteringType;
import com.noto.app.util.ModelUtilsKt;
import com.robinhood.ticker.TickerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import u7.s;
import x6.h0;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\t\u001a\u00020\bH\u008a@"}, d2 = {"Lcom/noto/app/domain/model/FilteringType;", "filteringType", "Ln6/c;", "", "Lx6/h0;", "notesState", "Ly6/h;", "labels", "", "searchTerm", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.FolderFragment$setupState$3", f = "FolderFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FolderFragment$setupState$3 extends SuspendLambda implements s<FilteringType, n6.c<? extends List<? extends h0>>, List<? extends y6.h>, String, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ FilteringType f8409m;
    public /* synthetic */ n6.c n;

    /* renamed from: o  reason: collision with root package name */
    public /* synthetic */ List f8410o;

    /* renamed from: p  reason: collision with root package name */
    public /* synthetic */ String f8411p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ FolderFragment f8412q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ s6.i f8413r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderFragment$setupState$3(s6.i iVar, FolderFragment folderFragment, p7.c cVar) {
        super(5, cVar);
        this.f8412q = folderFragment;
        this.f8413r = iVar;
    }

    @Override // u7.s
    public final Object V(FilteringType filteringType, n6.c<? extends List<? extends h0>> cVar, List<? extends y6.h> list, String str, p7.c<? super m7.n> cVar2) {
        FolderFragment folderFragment = this.f8412q;
        FolderFragment$setupState$3 folderFragment$setupState$3 = new FolderFragment$setupState$3(this.f8413r, folderFragment, cVar2);
        folderFragment$setupState$3.f8409m = filteringType;
        folderFragment$setupState$3.n = cVar;
        folderFragment$setupState$3.f8410o = list;
        folderFragment$setupState$3.f8411p = str;
        return folderFragment$setupState$3.k(m7.n.f16010a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0164  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        ArrayList g10;
        boolean z10;
        s6.i iVar;
        Context j2;
        String str;
        Context j10;
        String str2;
        String str3;
        String str4;
        m0.b.n1(obj);
        FilteringType filteringType = this.f8409m;
        n6.c cVar = this.n;
        List list = this.f8410o;
        String str5 = this.f8411p;
        List list2 = (List) n6.d.a(cVar, EmptyList.f12981i);
        int i10 = FolderFragment.f8358k0;
        FolderFragment folderFragment = this.f8412q;
        folderFragment.getClass();
        ArrayList d5 = ModelUtilsKt.d(ModelUtilsKt.i(list2, ModelUtilsKt.g(list), filteringType), str5);
        if (!(!g10.isEmpty()) && !(!ha.i.T0(str5))) {
            z10 = false;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                if (((h0) obj2).c) {
                    arrayList.add(obj2);
                }
            }
            int size = list2.size();
            int size2 = d5.size();
            int size3 = arrayList.size();
            iVar = this.f8413r;
            String str6 = null;
            if (!z10 && (!arrayList.isEmpty())) {
                TickerView tickerView = iVar.f17376i;
                Context j11 = folderFragment.j();
                if (j11 != null) {
                    str4 = f7.q.e(j11, R.plurals.notes_filtered_selected_count, size, Integer.valueOf(size), Integer.valueOf(size2), Integer.valueOf(size3));
                } else {
                    str4 = null;
                }
                tickerView.setText(str4);
                Context j12 = folderFragment.j();
                if (j12 != null) {
                    str6 = f7.q.e(j12, R.plurals.notes_filtered_selected_count, size, Integer.valueOf(size), Integer.valueOf(size2), Integer.valueOf(size3));
                }
            } else if (!z10 && arrayList.isEmpty()) {
                TickerView tickerView2 = iVar.f17376i;
                Context j13 = folderFragment.j();
                if (j13 != null) {
                    str3 = f7.q.e(j13, R.plurals.notes_filtered_count, size, Integer.valueOf(size), Integer.valueOf(size2));
                } else {
                    str3 = null;
                }
                tickerView2.setText(str3);
                Context j14 = folderFragment.j();
                if (j14 != null) {
                    str6 = f7.q.e(j14, R.plurals.notes_filtered_count, size, Integer.valueOf(size), Integer.valueOf(size2));
                }
            } else if (z10 && (!arrayList.isEmpty())) {
                TickerView tickerView3 = iVar.f17376i;
                Context j15 = folderFragment.j();
                if (j15 != null) {
                    str2 = f7.q.e(j15, R.plurals.notes_selected_count, size, Integer.valueOf(size), Integer.valueOf(size3));
                } else {
                    str2 = null;
                }
                tickerView3.setText(str2);
                Context j16 = folderFragment.j();
                if (j16 != null) {
                    str6 = f7.q.e(j16, R.plurals.notes_selected_count, size, Integer.valueOf(size), Integer.valueOf(size3));
                }
            } else {
                TickerView tickerView4 = iVar.f17376i;
                j2 = folderFragment.j();
                if (j2 == null) {
                    str = f7.q.e(j2, R.plurals.notes_count, size, Integer.valueOf(size));
                } else {
                    str = null;
                }
                tickerView4.setText(str);
                j10 = folderFragment.j();
                if (j10 != null) {
                    str6 = f7.q.e(j10, R.plurals.notes_count, size, Integer.valueOf(size));
                }
            }
            iVar.f17377j.setText(str6);
            return m7.n.f16010a;
        }
        z10 = true;
        ArrayList arrayList2 = new ArrayList();
        while (r6.hasNext()) {
        }
        int size4 = list2.size();
        int size22 = d5.size();
        int size32 = arrayList2.size();
        iVar = this.f8413r;
        String str62 = null;
        if (!z10) {
        }
        if (!z10) {
        }
        if (z10) {
        }
        TickerView tickerView42 = iVar.f17376i;
        j2 = folderFragment.j();
        if (j2 == null) {
        }
        tickerView42.setText(str);
        j10 = folderFragment.j();
        if (j10 != null) {
        }
        iVar.f17377j.setText(str62);
        return m7.n.f16010a;
    }
}
