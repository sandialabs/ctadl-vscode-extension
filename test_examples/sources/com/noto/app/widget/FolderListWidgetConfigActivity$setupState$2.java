package com.noto.app.widget;

import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import s6.o;
import u7.q;
import v7.g;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u00072\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u008a@"}, d2 = {"", "Lkotlin/Pair;", "Lt6/a;", "", "libraries", "", "isShowNotesCount", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.widget.FolderListWidgetConfigActivity$setupState$2", f = "FolderListWidgetConfigActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FolderListWidgetConfigActivity$setupState$2 extends SuspendLambda implements q<List<? extends Pair<? extends t6.a, ? extends Integer>>, Boolean, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ List f9944m;
    public /* synthetic */ boolean n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ o f9945o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ FolderListWidgetConfigActivity f9946p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderListWidgetConfigActivity$setupState$2(o oVar, FolderListWidgetConfigActivity folderListWidgetConfigActivity, p7.c<? super FolderListWidgetConfigActivity$setupState$2> cVar) {
        super(3, cVar);
        this.f9945o = oVar;
        this.f9946p = folderListWidgetConfigActivity;
    }

    @Override // u7.q
    public final Object O(List<? extends Pair<? extends t6.a, ? extends Integer>> list, Boolean bool, p7.c<? super n> cVar) {
        boolean booleanValue = bool.booleanValue();
        FolderListWidgetConfigActivity$setupState$2 folderListWidgetConfigActivity$setupState$2 = new FolderListWidgetConfigActivity$setupState$2(this.f9945o, this.f9946p, cVar);
        folderListWidgetConfigActivity$setupState$2.f9944m = list;
        folderListWidgetConfigActivity$setupState$2.n = booleanValue;
        return folderListWidgetConfigActivity$setupState$2.k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        b.n1(obj);
        List list = this.f9944m;
        boolean z10 = this.n;
        o oVar = this.f9945o;
        oVar.f17440h.setChecked(z10);
        boolean isEmpty = list.isEmpty();
        s6.n nVar = oVar.f17443k;
        if (isEmpty) {
            ListView listView = nVar.f17427f;
            g.e(listView, "widget.lv");
            listView.setVisibility(8);
            TextView textView = nVar.f17429h;
            g.e(textView, "widget.tvPlaceholder");
            textView.setVisibility(0);
        } else {
            ListView listView2 = nVar.f17427f;
            g.e(listView2, "widget.lv");
            listView2.setVisibility(0);
            TextView textView2 = nVar.f17429h;
            g.e(textView2, "widget.tvPlaceholder");
            textView2.setVisibility(8);
            nVar.f17427f.setAdapter((ListAdapter) new h7.a(this.f9946p, list, z10));
        }
        return n.f16010a;
    }
}
