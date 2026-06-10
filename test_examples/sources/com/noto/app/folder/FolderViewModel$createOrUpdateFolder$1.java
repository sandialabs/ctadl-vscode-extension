package com.noto.app.folder;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.Layout;
import com.noto.app.domain.model.NewNoteCursorPosition;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.domain.model.OpenNotesIn;
import ja.x;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.FolderViewModel$createOrUpdateFolder$1", f = "FolderViewModel.kt", l = {193, 195}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FolderViewModel$createOrUpdateFolder$1 extends SuspendLambda implements u7.p<x, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f8480m;
    public final /* synthetic */ FolderViewModel n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ String f8481o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Layout f8482p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f8483q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ boolean f8484r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ NewNoteCursorPosition f8485s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ OpenNotesIn f8486t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ u7.l<Long, m7.n> f8487u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FolderViewModel$createOrUpdateFolder$1(FolderViewModel folderViewModel, String str, Layout layout, int i10, boolean z10, NewNoteCursorPosition newNoteCursorPosition, OpenNotesIn openNotesIn, u7.l<? super Long, m7.n> lVar, p7.c<? super FolderViewModel$createOrUpdateFolder$1> cVar) {
        super(2, cVar);
        this.n = folderViewModel;
        this.f8481o = str;
        this.f8482p = layout;
        this.f8483q = i10;
        this.f8484r = z10;
        this.f8485s = newNoteCursorPosition;
        this.f8486t = openNotesIn;
        this.f8487u = lVar;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super m7.n> cVar) {
        return ((FolderViewModel$createOrUpdateFolder$1) a(xVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        return new FolderViewModel$createOrUpdateFolder$1(this.n, this.f8481o, this.f8482p, this.f8483q, this.f8484r, this.f8485s, this.f8486t, this.f8487u, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        Long l2;
        Object i10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = this.f8480m;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    m0.b.n1(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                m0.b.n1(obj);
                i10 = obj;
                this.f8487u.U(i10);
            }
        } else {
            m0.b.n1(obj);
            FolderViewModel folderViewModel = this.n;
            for (Pair pair : (Iterable) a1.b.m(folderViewModel.f8437q).getValue()) {
                if (((Boolean) pair.f12963j).booleanValue()) {
                    NotoColor notoColor = (NotoColor) pair.f12962i;
                    t6.a aVar = (t6.a) ((kotlinx.coroutines.flow.m) folderViewModel.k()).getValue();
                    String obj2 = kotlin.text.b.w1(this.f8481o).toString();
                    t6.a aVar2 = (t6.a) a1.b.m(folderViewModel.f8433l).getValue();
                    if (aVar2 != null) {
                        l2 = new Long(aVar2.f17592a);
                    } else {
                        l2 = null;
                    }
                    t6.a a10 = t6.a.a(aVar, l2, obj2, 0, notoColor, this.f8482p, this.f8483q, false, false, this.f8484r, this.f8485s, null, null, null, null, false, 0, null, this.f8486t, null, 1569577);
                    long j2 = folderViewModel.f8430i;
                    u6.a aVar3 = folderViewModel.f8425d;
                    if (j2 == 0) {
                        this.f8480m = 1;
                        i10 = aVar3.i(a10, true, this);
                        if (i10 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        this.f8487u.U(i10);
                    } else {
                        this.f8480m = 2;
                        if (aVar3.f(a10, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        return m7.n.f16010a;
    }
}
