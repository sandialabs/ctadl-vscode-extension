package com.noto.app.folder;

import android.content.Context;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.R;
import com.noto.app.domain.model.Font;
import com.robinhood.ticker.TickerView;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import n6.c;
import x6.h0;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\t\u001a\u00020\b2\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u008a@"}, d2 = {"Ln6/c;", "", "Lx6/h0;", "archivedNotes", "Lcom/noto/app/domain/model/Font;", "font", "Lt6/a;", "folder", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.FolderArchiveFragment$setupState$5", f = "FolderArchiveFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FolderArchiveFragment$setupState$5 extends SuspendLambda implements u7.r<n6.c<? extends List<? extends h0>>, Font, t6.a, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ n6.c f8326m;
    public /* synthetic */ Font n;

    /* renamed from: o  reason: collision with root package name */
    public /* synthetic */ t6.a f8327o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ s6.g f8328p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ FolderArchiveFragment f8329q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderArchiveFragment$setupState$5(s6.g gVar, FolderArchiveFragment folderArchiveFragment, p7.c<? super FolderArchiveFragment$setupState$5> cVar) {
        super(4, cVar);
        this.f8328p = gVar;
        this.f8329q = folderArchiveFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        String str;
        m0.b.n1(obj);
        n6.c cVar = this.f8326m;
        Font font = this.n;
        t6.a aVar = this.f8327o;
        int size = ((Collection) n6.d.a(cVar, EmptyList.f12981i)).size();
        s6.g gVar = this.f8328p;
        TickerView tickerView = gVar.c;
        FolderArchiveFragment folderArchiveFragment = this.f8329q;
        Context j2 = folderArchiveFragment.j();
        String str2 = null;
        if (j2 != null) {
            str = f7.q.e(j2, R.plurals.notes_count, size, new Integer(size));
        } else {
            str = null;
        }
        tickerView.setText(str);
        Context j10 = folderArchiveFragment.j();
        if (j10 != null) {
            str2 = f7.q.e(j10, R.plurals.notes_count, size, new Integer(size));
        }
        gVar.f17346d.setText(str2);
        if (cVar instanceof c.b) {
            gVar.f17344a.p0(new FolderArchiveFragment$setupArchivedNotes$1(folderArchiveFragment, (List) ((c.b) cVar).f16111a, aVar, font));
        }
        return m7.n.f16010a;
    }

    @Override // u7.r
    public final Object l0(n6.c<? extends List<? extends h0>> cVar, Font font, t6.a aVar, p7.c<? super m7.n> cVar2) {
        FolderArchiveFragment$setupState$5 folderArchiveFragment$setupState$5 = new FolderArchiveFragment$setupState$5(this.f8328p, this.f8329q, cVar2);
        folderArchiveFragment$setupState$5.f8326m = cVar;
        folderArchiveFragment$setupState$5.n = font;
        folderArchiveFragment$setupState$5.f8327o = aVar;
        return folderArchiveFragment$setupState$5.k(m7.n.f16010a);
    }
}
