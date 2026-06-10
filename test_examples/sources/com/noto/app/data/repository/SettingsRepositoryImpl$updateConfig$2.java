package com.noto.app.data.repository;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.FolderListSortingType;
import com.noto.app.domain.model.Font;
import com.noto.app.domain.model.Icon;
import com.noto.app.domain.model.Language;
import com.noto.app.domain.model.SortingOrder;
import com.noto.app.domain.model.Theme;
import com.noto.app.domain.model.VaultTimeout;
import com.noto.app.filtered.FilteredItemModel;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import ma.i;
import q7.c;
import t6.v;
import u7.p;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$updateConfig$2", f = "SettingsRepositoryImpl.kt", l = {232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SettingsRepositoryImpl$updateConfig$2 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public SettingsRepositoryImpl f8037m;
    public v n;

    /* renamed from: o  reason: collision with root package name */
    public int f8038o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ v f8039p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ SettingsRepositoryImpl f8040q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsRepositoryImpl$updateConfig$2(v vVar, SettingsRepositoryImpl settingsRepositoryImpl, p7.c<? super SettingsRepositoryImpl$updateConfig$2> cVar) {
        super(2, cVar);
        this.f8039p = vVar;
        this.f8040q = settingsRepositoryImpl;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((SettingsRepositoryImpl$updateConfig$2) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new SettingsRepositoryImpl$updateConfig$2(this.f8039p, this.f8040q, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0170 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0181 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0192 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0220 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0234 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        SettingsRepositoryImpl settingsRepositoryImpl;
        v vVar;
        Font font;
        Language language;
        Icon icon;
        String str;
        VaultTimeout vaultTimeout;
        VaultTimeout vaultTimeout2;
        boolean z10;
        boolean z11;
        String str2;
        FolderListSortingType folderListSortingType;
        SortingOrder sortingOrder;
        boolean z12;
        boolean z13;
        boolean z14;
        long j2;
        boolean z15;
        FilteredItemModel filteredItemModel;
        int i10;
        FilteredItemModel filteredItemModel2;
        int i11;
        FilteredItemModel filteredItemModel3;
        int i12;
        FilteredItemModel filteredItemModel4;
        int i13;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.f8038o) {
            case 0:
                b.n1(obj);
                v vVar2 = this.f8039p;
                Theme theme = vVar2.f17674a;
                settingsRepositoryImpl = this.f8040q;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar2;
                this.f8038o = 1;
                if (settingsRepositoryImpl.s(theme, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                vVar = vVar2;
                font = vVar.f17675b;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 2;
                if (settingsRepositoryImpl.X(font, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                language = vVar.c;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 3;
                if (settingsRepositoryImpl.a0(language, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                icon = vVar.f17676d;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 4;
                if (settingsRepositoryImpl.y(icon, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str = vVar.f17677e;
                if (str != null) {
                    this.f8037m = settingsRepositoryImpl;
                    this.n = vVar;
                    this.f8038o = 5;
                    if (settingsRepositoryImpl.T(str, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                vaultTimeout = vVar.f17678f;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 6;
                if (settingsRepositoryImpl.j(vaultTimeout, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                vaultTimeout2 = vVar.f17679g;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 7;
                if (settingsRepositoryImpl.B(vaultTimeout2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                z10 = vVar.f17680h;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 8;
                if (settingsRepositoryImpl.J(z10, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                z11 = vVar.f17681i;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 9;
                if (settingsRepositoryImpl.O(z11, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str2 = vVar.f17682j;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 10;
                if (settingsRepositoryImpl.Y(str2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                folderListSortingType = vVar.f17683k;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 11;
                if (settingsRepositoryImpl.F(folderListSortingType, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                sortingOrder = vVar.f17684l;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 12;
                if (settingsRepositoryImpl.E(sortingOrder, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                z12 = vVar.f17685m;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 13;
                if (settingsRepositoryImpl.d0(z12, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                z13 = vVar.n;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 14;
                if (settingsRepositoryImpl.a(z13, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                z14 = vVar.f17686o;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 15;
                if (settingsRepositoryImpl.b0(z14, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                j2 = vVar.f17687p;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 16;
                if (settingsRepositoryImpl.D(j2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                z15 = vVar.f17688q;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 17;
                if (settingsRepositoryImpl.W(z15, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                filteredItemModel = FilteredItemModel.All;
                i10 = vVar.f17689r;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 18;
                if (settingsRepositoryImpl.v(filteredItemModel, i10, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                filteredItemModel2 = FilteredItemModel.Recent;
                i11 = vVar.f17690s;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 19;
                if (settingsRepositoryImpl.v(filteredItemModel2, i11, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                filteredItemModel3 = FilteredItemModel.Scheduled;
                i12 = vVar.f17691t;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 20;
                if (settingsRepositoryImpl.v(filteredItemModel3, i12, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                filteredItemModel4 = FilteredItemModel.Archived;
                i13 = vVar.f17692u;
                this.f8037m = null;
                this.n = null;
                this.f8038o = 21;
                if (settingsRepositoryImpl.v(filteredItemModel4, i13, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return n.f16010a;
            case 1:
                vVar = this.n;
                settingsRepositoryImpl = this.f8037m;
                b.n1(obj);
                font = vVar.f17675b;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 2;
                if (settingsRepositoryImpl.X(font, this) == coroutineSingletons) {
                }
                language = vVar.c;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 3;
                if (settingsRepositoryImpl.a0(language, this) == coroutineSingletons) {
                }
                icon = vVar.f17676d;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 4;
                if (settingsRepositoryImpl.y(icon, this) == coroutineSingletons) {
                }
                str = vVar.f17677e;
                if (str != null) {
                }
                vaultTimeout = vVar.f17678f;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 6;
                if (settingsRepositoryImpl.j(vaultTimeout, this) == coroutineSingletons) {
                }
                vaultTimeout2 = vVar.f17679g;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 7;
                if (settingsRepositoryImpl.B(vaultTimeout2, this) == coroutineSingletons) {
                }
                z10 = vVar.f17680h;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 8;
                if (settingsRepositoryImpl.J(z10, this) == coroutineSingletons) {
                }
                z11 = vVar.f17681i;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 9;
                if (settingsRepositoryImpl.O(z11, this) == coroutineSingletons) {
                }
                str2 = vVar.f17682j;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 10;
                if (settingsRepositoryImpl.Y(str2, this) == coroutineSingletons) {
                }
                folderListSortingType = vVar.f17683k;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 11;
                if (settingsRepositoryImpl.F(folderListSortingType, this) == coroutineSingletons) {
                }
                sortingOrder = vVar.f17684l;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 12;
                if (settingsRepositoryImpl.E(sortingOrder, this) == coroutineSingletons) {
                }
                z12 = vVar.f17685m;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 13;
                if (settingsRepositoryImpl.d0(z12, this) == coroutineSingletons) {
                }
                z13 = vVar.n;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 14;
                if (settingsRepositoryImpl.a(z13, this) == coroutineSingletons) {
                }
                z14 = vVar.f17686o;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 15;
                if (settingsRepositoryImpl.b0(z14, this) == coroutineSingletons) {
                }
                j2 = vVar.f17687p;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 16;
                if (settingsRepositoryImpl.D(j2, this) == coroutineSingletons) {
                }
                z15 = vVar.f17688q;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 17;
                if (settingsRepositoryImpl.W(z15, this) == coroutineSingletons) {
                }
                filteredItemModel = FilteredItemModel.All;
                i10 = vVar.f17689r;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 18;
                if (settingsRepositoryImpl.v(filteredItemModel, i10, this) == coroutineSingletons) {
                }
                filteredItemModel2 = FilteredItemModel.Recent;
                i11 = vVar.f17690s;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 19;
                if (settingsRepositoryImpl.v(filteredItemModel2, i11, this) == coroutineSingletons) {
                }
                filteredItemModel3 = FilteredItemModel.Scheduled;
                i12 = vVar.f17691t;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 20;
                if (settingsRepositoryImpl.v(filteredItemModel3, i12, this) == coroutineSingletons) {
                }
                filteredItemModel4 = FilteredItemModel.Archived;
                i13 = vVar.f17692u;
                this.f8037m = null;
                this.n = null;
                this.f8038o = 21;
                if (settingsRepositoryImpl.v(filteredItemModel4, i13, this) == coroutineSingletons) {
                }
                return n.f16010a;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                vVar = this.n;
                settingsRepositoryImpl = this.f8037m;
                b.n1(obj);
                language = vVar.c;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 3;
                if (settingsRepositoryImpl.a0(language, this) == coroutineSingletons) {
                }
                icon = vVar.f17676d;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 4;
                if (settingsRepositoryImpl.y(icon, this) == coroutineSingletons) {
                }
                str = vVar.f17677e;
                if (str != null) {
                }
                vaultTimeout = vVar.f17678f;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 6;
                if (settingsRepositoryImpl.j(vaultTimeout, this) == coroutineSingletons) {
                }
                vaultTimeout2 = vVar.f17679g;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 7;
                if (settingsRepositoryImpl.B(vaultTimeout2, this) == coroutineSingletons) {
                }
                z10 = vVar.f17680h;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 8;
                if (settingsRepositoryImpl.J(z10, this) == coroutineSingletons) {
                }
                z11 = vVar.f17681i;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 9;
                if (settingsRepositoryImpl.O(z11, this) == coroutineSingletons) {
                }
                str2 = vVar.f17682j;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 10;
                if (settingsRepositoryImpl.Y(str2, this) == coroutineSingletons) {
                }
                folderListSortingType = vVar.f17683k;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 11;
                if (settingsRepositoryImpl.F(folderListSortingType, this) == coroutineSingletons) {
                }
                sortingOrder = vVar.f17684l;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 12;
                if (settingsRepositoryImpl.E(sortingOrder, this) == coroutineSingletons) {
                }
                z12 = vVar.f17685m;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 13;
                if (settingsRepositoryImpl.d0(z12, this) == coroutineSingletons) {
                }
                z13 = vVar.n;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 14;
                if (settingsRepositoryImpl.a(z13, this) == coroutineSingletons) {
                }
                z14 = vVar.f17686o;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 15;
                if (settingsRepositoryImpl.b0(z14, this) == coroutineSingletons) {
                }
                j2 = vVar.f17687p;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 16;
                if (settingsRepositoryImpl.D(j2, this) == coroutineSingletons) {
                }
                z15 = vVar.f17688q;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 17;
                if (settingsRepositoryImpl.W(z15, this) == coroutineSingletons) {
                }
                filteredItemModel = FilteredItemModel.All;
                i10 = vVar.f17689r;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 18;
                if (settingsRepositoryImpl.v(filteredItemModel, i10, this) == coroutineSingletons) {
                }
                filteredItemModel2 = FilteredItemModel.Recent;
                i11 = vVar.f17690s;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 19;
                if (settingsRepositoryImpl.v(filteredItemModel2, i11, this) == coroutineSingletons) {
                }
                filteredItemModel3 = FilteredItemModel.Scheduled;
                i12 = vVar.f17691t;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 20;
                if (settingsRepositoryImpl.v(filteredItemModel3, i12, this) == coroutineSingletons) {
                }
                filteredItemModel4 = FilteredItemModel.Archived;
                i13 = vVar.f17692u;
                this.f8037m = null;
                this.n = null;
                this.f8038o = 21;
                if (settingsRepositoryImpl.v(filteredItemModel4, i13, this) == coroutineSingletons) {
                }
                return n.f16010a;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                vVar = this.n;
                settingsRepositoryImpl = this.f8037m;
                b.n1(obj);
                icon = vVar.f17676d;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 4;
                if (settingsRepositoryImpl.y(icon, this) == coroutineSingletons) {
                }
                str = vVar.f17677e;
                if (str != null) {
                }
                vaultTimeout = vVar.f17678f;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 6;
                if (settingsRepositoryImpl.j(vaultTimeout, this) == coroutineSingletons) {
                }
                vaultTimeout2 = vVar.f17679g;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 7;
                if (settingsRepositoryImpl.B(vaultTimeout2, this) == coroutineSingletons) {
                }
                z10 = vVar.f17680h;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 8;
                if (settingsRepositoryImpl.J(z10, this) == coroutineSingletons) {
                }
                z11 = vVar.f17681i;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 9;
                if (settingsRepositoryImpl.O(z11, this) == coroutineSingletons) {
                }
                str2 = vVar.f17682j;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 10;
                if (settingsRepositoryImpl.Y(str2, this) == coroutineSingletons) {
                }
                folderListSortingType = vVar.f17683k;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 11;
                if (settingsRepositoryImpl.F(folderListSortingType, this) == coroutineSingletons) {
                }
                sortingOrder = vVar.f17684l;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 12;
                if (settingsRepositoryImpl.E(sortingOrder, this) == coroutineSingletons) {
                }
                z12 = vVar.f17685m;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 13;
                if (settingsRepositoryImpl.d0(z12, this) == coroutineSingletons) {
                }
                z13 = vVar.n;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 14;
                if (settingsRepositoryImpl.a(z13, this) == coroutineSingletons) {
                }
                z14 = vVar.f17686o;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 15;
                if (settingsRepositoryImpl.b0(z14, this) == coroutineSingletons) {
                }
                j2 = vVar.f17687p;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 16;
                if (settingsRepositoryImpl.D(j2, this) == coroutineSingletons) {
                }
                z15 = vVar.f17688q;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 17;
                if (settingsRepositoryImpl.W(z15, this) == coroutineSingletons) {
                }
                filteredItemModel = FilteredItemModel.All;
                i10 = vVar.f17689r;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 18;
                if (settingsRepositoryImpl.v(filteredItemModel, i10, this) == coroutineSingletons) {
                }
                filteredItemModel2 = FilteredItemModel.Recent;
                i11 = vVar.f17690s;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 19;
                if (settingsRepositoryImpl.v(filteredItemModel2, i11, this) == coroutineSingletons) {
                }
                filteredItemModel3 = FilteredItemModel.Scheduled;
                i12 = vVar.f17691t;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 20;
                if (settingsRepositoryImpl.v(filteredItemModel3, i12, this) == coroutineSingletons) {
                }
                filteredItemModel4 = FilteredItemModel.Archived;
                i13 = vVar.f17692u;
                this.f8037m = null;
                this.n = null;
                this.f8038o = 21;
                if (settingsRepositoryImpl.v(filteredItemModel4, i13, this) == coroutineSingletons) {
                }
                return n.f16010a;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                vVar = this.n;
                settingsRepositoryImpl = this.f8037m;
                b.n1(obj);
                str = vVar.f17677e;
                if (str != null) {
                }
                vaultTimeout = vVar.f17678f;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 6;
                if (settingsRepositoryImpl.j(vaultTimeout, this) == coroutineSingletons) {
                }
                vaultTimeout2 = vVar.f17679g;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 7;
                if (settingsRepositoryImpl.B(vaultTimeout2, this) == coroutineSingletons) {
                }
                z10 = vVar.f17680h;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 8;
                if (settingsRepositoryImpl.J(z10, this) == coroutineSingletons) {
                }
                z11 = vVar.f17681i;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 9;
                if (settingsRepositoryImpl.O(z11, this) == coroutineSingletons) {
                }
                str2 = vVar.f17682j;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 10;
                if (settingsRepositoryImpl.Y(str2, this) == coroutineSingletons) {
                }
                folderListSortingType = vVar.f17683k;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 11;
                if (settingsRepositoryImpl.F(folderListSortingType, this) == coroutineSingletons) {
                }
                sortingOrder = vVar.f17684l;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 12;
                if (settingsRepositoryImpl.E(sortingOrder, this) == coroutineSingletons) {
                }
                z12 = vVar.f17685m;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 13;
                if (settingsRepositoryImpl.d0(z12, this) == coroutineSingletons) {
                }
                z13 = vVar.n;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 14;
                if (settingsRepositoryImpl.a(z13, this) == coroutineSingletons) {
                }
                z14 = vVar.f17686o;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 15;
                if (settingsRepositoryImpl.b0(z14, this) == coroutineSingletons) {
                }
                j2 = vVar.f17687p;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 16;
                if (settingsRepositoryImpl.D(j2, this) == coroutineSingletons) {
                }
                z15 = vVar.f17688q;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 17;
                if (settingsRepositoryImpl.W(z15, this) == coroutineSingletons) {
                }
                filteredItemModel = FilteredItemModel.All;
                i10 = vVar.f17689r;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 18;
                if (settingsRepositoryImpl.v(filteredItemModel, i10, this) == coroutineSingletons) {
                }
                filteredItemModel2 = FilteredItemModel.Recent;
                i11 = vVar.f17690s;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 19;
                if (settingsRepositoryImpl.v(filteredItemModel2, i11, this) == coroutineSingletons) {
                }
                filteredItemModel3 = FilteredItemModel.Scheduled;
                i12 = vVar.f17691t;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 20;
                if (settingsRepositoryImpl.v(filteredItemModel3, i12, this) == coroutineSingletons) {
                }
                filteredItemModel4 = FilteredItemModel.Archived;
                i13 = vVar.f17692u;
                this.f8037m = null;
                this.n = null;
                this.f8038o = 21;
                if (settingsRepositoryImpl.v(filteredItemModel4, i13, this) == coroutineSingletons) {
                }
                return n.f16010a;
            case 5:
                vVar = this.n;
                settingsRepositoryImpl = this.f8037m;
                b.n1(obj);
                vaultTimeout = vVar.f17678f;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 6;
                if (settingsRepositoryImpl.j(vaultTimeout, this) == coroutineSingletons) {
                }
                vaultTimeout2 = vVar.f17679g;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 7;
                if (settingsRepositoryImpl.B(vaultTimeout2, this) == coroutineSingletons) {
                }
                z10 = vVar.f17680h;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 8;
                if (settingsRepositoryImpl.J(z10, this) == coroutineSingletons) {
                }
                z11 = vVar.f17681i;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 9;
                if (settingsRepositoryImpl.O(z11, this) == coroutineSingletons) {
                }
                str2 = vVar.f17682j;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 10;
                if (settingsRepositoryImpl.Y(str2, this) == coroutineSingletons) {
                }
                folderListSortingType = vVar.f17683k;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 11;
                if (settingsRepositoryImpl.F(folderListSortingType, this) == coroutineSingletons) {
                }
                sortingOrder = vVar.f17684l;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 12;
                if (settingsRepositoryImpl.E(sortingOrder, this) == coroutineSingletons) {
                }
                z12 = vVar.f17685m;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 13;
                if (settingsRepositoryImpl.d0(z12, this) == coroutineSingletons) {
                }
                z13 = vVar.n;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 14;
                if (settingsRepositoryImpl.a(z13, this) == coroutineSingletons) {
                }
                z14 = vVar.f17686o;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 15;
                if (settingsRepositoryImpl.b0(z14, this) == coroutineSingletons) {
                }
                j2 = vVar.f17687p;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 16;
                if (settingsRepositoryImpl.D(j2, this) == coroutineSingletons) {
                }
                z15 = vVar.f17688q;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 17;
                if (settingsRepositoryImpl.W(z15, this) == coroutineSingletons) {
                }
                filteredItemModel = FilteredItemModel.All;
                i10 = vVar.f17689r;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 18;
                if (settingsRepositoryImpl.v(filteredItemModel, i10, this) == coroutineSingletons) {
                }
                filteredItemModel2 = FilteredItemModel.Recent;
                i11 = vVar.f17690s;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 19;
                if (settingsRepositoryImpl.v(filteredItemModel2, i11, this) == coroutineSingletons) {
                }
                filteredItemModel3 = FilteredItemModel.Scheduled;
                i12 = vVar.f17691t;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 20;
                if (settingsRepositoryImpl.v(filteredItemModel3, i12, this) == coroutineSingletons) {
                }
                filteredItemModel4 = FilteredItemModel.Archived;
                i13 = vVar.f17692u;
                this.f8037m = null;
                this.n = null;
                this.f8038o = 21;
                if (settingsRepositoryImpl.v(filteredItemModel4, i13, this) == coroutineSingletons) {
                }
                return n.f16010a;
            case 6:
                vVar = this.n;
                settingsRepositoryImpl = this.f8037m;
                b.n1(obj);
                vaultTimeout2 = vVar.f17679g;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 7;
                if (settingsRepositoryImpl.B(vaultTimeout2, this) == coroutineSingletons) {
                }
                z10 = vVar.f17680h;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 8;
                if (settingsRepositoryImpl.J(z10, this) == coroutineSingletons) {
                }
                z11 = vVar.f17681i;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 9;
                if (settingsRepositoryImpl.O(z11, this) == coroutineSingletons) {
                }
                str2 = vVar.f17682j;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 10;
                if (settingsRepositoryImpl.Y(str2, this) == coroutineSingletons) {
                }
                folderListSortingType = vVar.f17683k;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 11;
                if (settingsRepositoryImpl.F(folderListSortingType, this) == coroutineSingletons) {
                }
                sortingOrder = vVar.f17684l;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 12;
                if (settingsRepositoryImpl.E(sortingOrder, this) == coroutineSingletons) {
                }
                z12 = vVar.f17685m;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 13;
                if (settingsRepositoryImpl.d0(z12, this) == coroutineSingletons) {
                }
                z13 = vVar.n;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 14;
                if (settingsRepositoryImpl.a(z13, this) == coroutineSingletons) {
                }
                z14 = vVar.f17686o;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 15;
                if (settingsRepositoryImpl.b0(z14, this) == coroutineSingletons) {
                }
                j2 = vVar.f17687p;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 16;
                if (settingsRepositoryImpl.D(j2, this) == coroutineSingletons) {
                }
                z15 = vVar.f17688q;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 17;
                if (settingsRepositoryImpl.W(z15, this) == coroutineSingletons) {
                }
                filteredItemModel = FilteredItemModel.All;
                i10 = vVar.f17689r;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 18;
                if (settingsRepositoryImpl.v(filteredItemModel, i10, this) == coroutineSingletons) {
                }
                filteredItemModel2 = FilteredItemModel.Recent;
                i11 = vVar.f17690s;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 19;
                if (settingsRepositoryImpl.v(filteredItemModel2, i11, this) == coroutineSingletons) {
                }
                filteredItemModel3 = FilteredItemModel.Scheduled;
                i12 = vVar.f17691t;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 20;
                if (settingsRepositoryImpl.v(filteredItemModel3, i12, this) == coroutineSingletons) {
                }
                filteredItemModel4 = FilteredItemModel.Archived;
                i13 = vVar.f17692u;
                this.f8037m = null;
                this.n = null;
                this.f8038o = 21;
                if (settingsRepositoryImpl.v(filteredItemModel4, i13, this) == coroutineSingletons) {
                }
                return n.f16010a;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                vVar = this.n;
                settingsRepositoryImpl = this.f8037m;
                b.n1(obj);
                z10 = vVar.f17680h;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 8;
                if (settingsRepositoryImpl.J(z10, this) == coroutineSingletons) {
                }
                z11 = vVar.f17681i;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 9;
                if (settingsRepositoryImpl.O(z11, this) == coroutineSingletons) {
                }
                str2 = vVar.f17682j;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 10;
                if (settingsRepositoryImpl.Y(str2, this) == coroutineSingletons) {
                }
                folderListSortingType = vVar.f17683k;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 11;
                if (settingsRepositoryImpl.F(folderListSortingType, this) == coroutineSingletons) {
                }
                sortingOrder = vVar.f17684l;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 12;
                if (settingsRepositoryImpl.E(sortingOrder, this) == coroutineSingletons) {
                }
                z12 = vVar.f17685m;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 13;
                if (settingsRepositoryImpl.d0(z12, this) == coroutineSingletons) {
                }
                z13 = vVar.n;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 14;
                if (settingsRepositoryImpl.a(z13, this) == coroutineSingletons) {
                }
                z14 = vVar.f17686o;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 15;
                if (settingsRepositoryImpl.b0(z14, this) == coroutineSingletons) {
                }
                j2 = vVar.f17687p;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 16;
                if (settingsRepositoryImpl.D(j2, this) == coroutineSingletons) {
                }
                z15 = vVar.f17688q;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 17;
                if (settingsRepositoryImpl.W(z15, this) == coroutineSingletons) {
                }
                filteredItemModel = FilteredItemModel.All;
                i10 = vVar.f17689r;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 18;
                if (settingsRepositoryImpl.v(filteredItemModel, i10, this) == coroutineSingletons) {
                }
                filteredItemModel2 = FilteredItemModel.Recent;
                i11 = vVar.f17690s;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 19;
                if (settingsRepositoryImpl.v(filteredItemModel2, i11, this) == coroutineSingletons) {
                }
                filteredItemModel3 = FilteredItemModel.Scheduled;
                i12 = vVar.f17691t;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 20;
                if (settingsRepositoryImpl.v(filteredItemModel3, i12, this) == coroutineSingletons) {
                }
                filteredItemModel4 = FilteredItemModel.Archived;
                i13 = vVar.f17692u;
                this.f8037m = null;
                this.n = null;
                this.f8038o = 21;
                if (settingsRepositoryImpl.v(filteredItemModel4, i13, this) == coroutineSingletons) {
                }
                return n.f16010a;
            case 8:
                vVar = this.n;
                settingsRepositoryImpl = this.f8037m;
                b.n1(obj);
                z11 = vVar.f17681i;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 9;
                if (settingsRepositoryImpl.O(z11, this) == coroutineSingletons) {
                }
                str2 = vVar.f17682j;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 10;
                if (settingsRepositoryImpl.Y(str2, this) == coroutineSingletons) {
                }
                folderListSortingType = vVar.f17683k;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 11;
                if (settingsRepositoryImpl.F(folderListSortingType, this) == coroutineSingletons) {
                }
                sortingOrder = vVar.f17684l;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 12;
                if (settingsRepositoryImpl.E(sortingOrder, this) == coroutineSingletons) {
                }
                z12 = vVar.f17685m;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 13;
                if (settingsRepositoryImpl.d0(z12, this) == coroutineSingletons) {
                }
                z13 = vVar.n;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 14;
                if (settingsRepositoryImpl.a(z13, this) == coroutineSingletons) {
                }
                z14 = vVar.f17686o;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 15;
                if (settingsRepositoryImpl.b0(z14, this) == coroutineSingletons) {
                }
                j2 = vVar.f17687p;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 16;
                if (settingsRepositoryImpl.D(j2, this) == coroutineSingletons) {
                }
                z15 = vVar.f17688q;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 17;
                if (settingsRepositoryImpl.W(z15, this) == coroutineSingletons) {
                }
                filteredItemModel = FilteredItemModel.All;
                i10 = vVar.f17689r;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 18;
                if (settingsRepositoryImpl.v(filteredItemModel, i10, this) == coroutineSingletons) {
                }
                filteredItemModel2 = FilteredItemModel.Recent;
                i11 = vVar.f17690s;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 19;
                if (settingsRepositoryImpl.v(filteredItemModel2, i11, this) == coroutineSingletons) {
                }
                filteredItemModel3 = FilteredItemModel.Scheduled;
                i12 = vVar.f17691t;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 20;
                if (settingsRepositoryImpl.v(filteredItemModel3, i12, this) == coroutineSingletons) {
                }
                filteredItemModel4 = FilteredItemModel.Archived;
                i13 = vVar.f17692u;
                this.f8037m = null;
                this.n = null;
                this.f8038o = 21;
                if (settingsRepositoryImpl.v(filteredItemModel4, i13, this) == coroutineSingletons) {
                }
                return n.f16010a;
            case i.f16046m /* 9 */:
                vVar = this.n;
                settingsRepositoryImpl = this.f8037m;
                b.n1(obj);
                str2 = vVar.f17682j;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 10;
                if (settingsRepositoryImpl.Y(str2, this) == coroutineSingletons) {
                }
                folderListSortingType = vVar.f17683k;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 11;
                if (settingsRepositoryImpl.F(folderListSortingType, this) == coroutineSingletons) {
                }
                sortingOrder = vVar.f17684l;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 12;
                if (settingsRepositoryImpl.E(sortingOrder, this) == coroutineSingletons) {
                }
                z12 = vVar.f17685m;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 13;
                if (settingsRepositoryImpl.d0(z12, this) == coroutineSingletons) {
                }
                z13 = vVar.n;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 14;
                if (settingsRepositoryImpl.a(z13, this) == coroutineSingletons) {
                }
                z14 = vVar.f17686o;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 15;
                if (settingsRepositoryImpl.b0(z14, this) == coroutineSingletons) {
                }
                j2 = vVar.f17687p;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 16;
                if (settingsRepositoryImpl.D(j2, this) == coroutineSingletons) {
                }
                z15 = vVar.f17688q;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 17;
                if (settingsRepositoryImpl.W(z15, this) == coroutineSingletons) {
                }
                filteredItemModel = FilteredItemModel.All;
                i10 = vVar.f17689r;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 18;
                if (settingsRepositoryImpl.v(filteredItemModel, i10, this) == coroutineSingletons) {
                }
                filteredItemModel2 = FilteredItemModel.Recent;
                i11 = vVar.f17690s;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 19;
                if (settingsRepositoryImpl.v(filteredItemModel2, i11, this) == coroutineSingletons) {
                }
                filteredItemModel3 = FilteredItemModel.Scheduled;
                i12 = vVar.f17691t;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 20;
                if (settingsRepositoryImpl.v(filteredItemModel3, i12, this) == coroutineSingletons) {
                }
                filteredItemModel4 = FilteredItemModel.Archived;
                i13 = vVar.f17692u;
                this.f8037m = null;
                this.n = null;
                this.f8038o = 21;
                if (settingsRepositoryImpl.v(filteredItemModel4, i13, this) == coroutineSingletons) {
                }
                return n.f16010a;
            case i.f16047o /* 10 */:
                vVar = this.n;
                settingsRepositoryImpl = this.f8037m;
                b.n1(obj);
                folderListSortingType = vVar.f17683k;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 11;
                if (settingsRepositoryImpl.F(folderListSortingType, this) == coroutineSingletons) {
                }
                sortingOrder = vVar.f17684l;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 12;
                if (settingsRepositoryImpl.E(sortingOrder, this) == coroutineSingletons) {
                }
                z12 = vVar.f17685m;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 13;
                if (settingsRepositoryImpl.d0(z12, this) == coroutineSingletons) {
                }
                z13 = vVar.n;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 14;
                if (settingsRepositoryImpl.a(z13, this) == coroutineSingletons) {
                }
                z14 = vVar.f17686o;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 15;
                if (settingsRepositoryImpl.b0(z14, this) == coroutineSingletons) {
                }
                j2 = vVar.f17687p;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 16;
                if (settingsRepositoryImpl.D(j2, this) == coroutineSingletons) {
                }
                z15 = vVar.f17688q;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 17;
                if (settingsRepositoryImpl.W(z15, this) == coroutineSingletons) {
                }
                filteredItemModel = FilteredItemModel.All;
                i10 = vVar.f17689r;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 18;
                if (settingsRepositoryImpl.v(filteredItemModel, i10, this) == coroutineSingletons) {
                }
                filteredItemModel2 = FilteredItemModel.Recent;
                i11 = vVar.f17690s;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 19;
                if (settingsRepositoryImpl.v(filteredItemModel2, i11, this) == coroutineSingletons) {
                }
                filteredItemModel3 = FilteredItemModel.Scheduled;
                i12 = vVar.f17691t;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 20;
                if (settingsRepositoryImpl.v(filteredItemModel3, i12, this) == coroutineSingletons) {
                }
                filteredItemModel4 = FilteredItemModel.Archived;
                i13 = vVar.f17692u;
                this.f8037m = null;
                this.n = null;
                this.f8038o = 21;
                if (settingsRepositoryImpl.v(filteredItemModel4, i13, this) == coroutineSingletons) {
                }
                return n.f16010a;
            case 11:
                vVar = this.n;
                settingsRepositoryImpl = this.f8037m;
                b.n1(obj);
                sortingOrder = vVar.f17684l;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 12;
                if (settingsRepositoryImpl.E(sortingOrder, this) == coroutineSingletons) {
                }
                z12 = vVar.f17685m;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 13;
                if (settingsRepositoryImpl.d0(z12, this) == coroutineSingletons) {
                }
                z13 = vVar.n;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 14;
                if (settingsRepositoryImpl.a(z13, this) == coroutineSingletons) {
                }
                z14 = vVar.f17686o;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 15;
                if (settingsRepositoryImpl.b0(z14, this) == coroutineSingletons) {
                }
                j2 = vVar.f17687p;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 16;
                if (settingsRepositoryImpl.D(j2, this) == coroutineSingletons) {
                }
                z15 = vVar.f17688q;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 17;
                if (settingsRepositoryImpl.W(z15, this) == coroutineSingletons) {
                }
                filteredItemModel = FilteredItemModel.All;
                i10 = vVar.f17689r;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 18;
                if (settingsRepositoryImpl.v(filteredItemModel, i10, this) == coroutineSingletons) {
                }
                filteredItemModel2 = FilteredItemModel.Recent;
                i11 = vVar.f17690s;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 19;
                if (settingsRepositoryImpl.v(filteredItemModel2, i11, this) == coroutineSingletons) {
                }
                filteredItemModel3 = FilteredItemModel.Scheduled;
                i12 = vVar.f17691t;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 20;
                if (settingsRepositoryImpl.v(filteredItemModel3, i12, this) == coroutineSingletons) {
                }
                filteredItemModel4 = FilteredItemModel.Archived;
                i13 = vVar.f17692u;
                this.f8037m = null;
                this.n = null;
                this.f8038o = 21;
                if (settingsRepositoryImpl.v(filteredItemModel4, i13, this) == coroutineSingletons) {
                }
                return n.f16010a;
            case 12:
                vVar = this.n;
                settingsRepositoryImpl = this.f8037m;
                b.n1(obj);
                z12 = vVar.f17685m;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 13;
                if (settingsRepositoryImpl.d0(z12, this) == coroutineSingletons) {
                }
                z13 = vVar.n;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 14;
                if (settingsRepositoryImpl.a(z13, this) == coroutineSingletons) {
                }
                z14 = vVar.f17686o;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 15;
                if (settingsRepositoryImpl.b0(z14, this) == coroutineSingletons) {
                }
                j2 = vVar.f17687p;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 16;
                if (settingsRepositoryImpl.D(j2, this) == coroutineSingletons) {
                }
                z15 = vVar.f17688q;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 17;
                if (settingsRepositoryImpl.W(z15, this) == coroutineSingletons) {
                }
                filteredItemModel = FilteredItemModel.All;
                i10 = vVar.f17689r;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 18;
                if (settingsRepositoryImpl.v(filteredItemModel, i10, this) == coroutineSingletons) {
                }
                filteredItemModel2 = FilteredItemModel.Recent;
                i11 = vVar.f17690s;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 19;
                if (settingsRepositoryImpl.v(filteredItemModel2, i11, this) == coroutineSingletons) {
                }
                filteredItemModel3 = FilteredItemModel.Scheduled;
                i12 = vVar.f17691t;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 20;
                if (settingsRepositoryImpl.v(filteredItemModel3, i12, this) == coroutineSingletons) {
                }
                filteredItemModel4 = FilteredItemModel.Archived;
                i13 = vVar.f17692u;
                this.f8037m = null;
                this.n = null;
                this.f8038o = 21;
                if (settingsRepositoryImpl.v(filteredItemModel4, i13, this) == coroutineSingletons) {
                }
                return n.f16010a;
            case 13:
                vVar = this.n;
                settingsRepositoryImpl = this.f8037m;
                b.n1(obj);
                z13 = vVar.n;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 14;
                if (settingsRepositoryImpl.a(z13, this) == coroutineSingletons) {
                }
                z14 = vVar.f17686o;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 15;
                if (settingsRepositoryImpl.b0(z14, this) == coroutineSingletons) {
                }
                j2 = vVar.f17687p;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 16;
                if (settingsRepositoryImpl.D(j2, this) == coroutineSingletons) {
                }
                z15 = vVar.f17688q;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 17;
                if (settingsRepositoryImpl.W(z15, this) == coroutineSingletons) {
                }
                filteredItemModel = FilteredItemModel.All;
                i10 = vVar.f17689r;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 18;
                if (settingsRepositoryImpl.v(filteredItemModel, i10, this) == coroutineSingletons) {
                }
                filteredItemModel2 = FilteredItemModel.Recent;
                i11 = vVar.f17690s;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 19;
                if (settingsRepositoryImpl.v(filteredItemModel2, i11, this) == coroutineSingletons) {
                }
                filteredItemModel3 = FilteredItemModel.Scheduled;
                i12 = vVar.f17691t;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 20;
                if (settingsRepositoryImpl.v(filteredItemModel3, i12, this) == coroutineSingletons) {
                }
                filteredItemModel4 = FilteredItemModel.Archived;
                i13 = vVar.f17692u;
                this.f8037m = null;
                this.n = null;
                this.f8038o = 21;
                if (settingsRepositoryImpl.v(filteredItemModel4, i13, this) == coroutineSingletons) {
                }
                return n.f16010a;
            case 14:
                vVar = this.n;
                settingsRepositoryImpl = this.f8037m;
                b.n1(obj);
                z14 = vVar.f17686o;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 15;
                if (settingsRepositoryImpl.b0(z14, this) == coroutineSingletons) {
                }
                j2 = vVar.f17687p;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 16;
                if (settingsRepositoryImpl.D(j2, this) == coroutineSingletons) {
                }
                z15 = vVar.f17688q;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 17;
                if (settingsRepositoryImpl.W(z15, this) == coroutineSingletons) {
                }
                filteredItemModel = FilteredItemModel.All;
                i10 = vVar.f17689r;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 18;
                if (settingsRepositoryImpl.v(filteredItemModel, i10, this) == coroutineSingletons) {
                }
                filteredItemModel2 = FilteredItemModel.Recent;
                i11 = vVar.f17690s;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 19;
                if (settingsRepositoryImpl.v(filteredItemModel2, i11, this) == coroutineSingletons) {
                }
                filteredItemModel3 = FilteredItemModel.Scheduled;
                i12 = vVar.f17691t;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 20;
                if (settingsRepositoryImpl.v(filteredItemModel3, i12, this) == coroutineSingletons) {
                }
                filteredItemModel4 = FilteredItemModel.Archived;
                i13 = vVar.f17692u;
                this.f8037m = null;
                this.n = null;
                this.f8038o = 21;
                if (settingsRepositoryImpl.v(filteredItemModel4, i13, this) == coroutineSingletons) {
                }
                return n.f16010a;
            case i.f16049q /* 15 */:
                vVar = this.n;
                settingsRepositoryImpl = this.f8037m;
                b.n1(obj);
                j2 = vVar.f17687p;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 16;
                if (settingsRepositoryImpl.D(j2, this) == coroutineSingletons) {
                }
                z15 = vVar.f17688q;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 17;
                if (settingsRepositoryImpl.W(z15, this) == coroutineSingletons) {
                }
                filteredItemModel = FilteredItemModel.All;
                i10 = vVar.f17689r;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 18;
                if (settingsRepositoryImpl.v(filteredItemModel, i10, this) == coroutineSingletons) {
                }
                filteredItemModel2 = FilteredItemModel.Recent;
                i11 = vVar.f17690s;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 19;
                if (settingsRepositoryImpl.v(filteredItemModel2, i11, this) == coroutineSingletons) {
                }
                filteredItemModel3 = FilteredItemModel.Scheduled;
                i12 = vVar.f17691t;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 20;
                if (settingsRepositoryImpl.v(filteredItemModel3, i12, this) == coroutineSingletons) {
                }
                filteredItemModel4 = FilteredItemModel.Archived;
                i13 = vVar.f17692u;
                this.f8037m = null;
                this.n = null;
                this.f8038o = 21;
                if (settingsRepositoryImpl.v(filteredItemModel4, i13, this) == coroutineSingletons) {
                }
                return n.f16010a;
            case 16:
                vVar = this.n;
                settingsRepositoryImpl = this.f8037m;
                b.n1(obj);
                z15 = vVar.f17688q;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 17;
                if (settingsRepositoryImpl.W(z15, this) == coroutineSingletons) {
                }
                filteredItemModel = FilteredItemModel.All;
                i10 = vVar.f17689r;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 18;
                if (settingsRepositoryImpl.v(filteredItemModel, i10, this) == coroutineSingletons) {
                }
                filteredItemModel2 = FilteredItemModel.Recent;
                i11 = vVar.f17690s;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 19;
                if (settingsRepositoryImpl.v(filteredItemModel2, i11, this) == coroutineSingletons) {
                }
                filteredItemModel3 = FilteredItemModel.Scheduled;
                i12 = vVar.f17691t;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 20;
                if (settingsRepositoryImpl.v(filteredItemModel3, i12, this) == coroutineSingletons) {
                }
                filteredItemModel4 = FilteredItemModel.Archived;
                i13 = vVar.f17692u;
                this.f8037m = null;
                this.n = null;
                this.f8038o = 21;
                if (settingsRepositoryImpl.v(filteredItemModel4, i13, this) == coroutineSingletons) {
                }
                return n.f16010a;
            case 17:
                vVar = this.n;
                settingsRepositoryImpl = this.f8037m;
                b.n1(obj);
                filteredItemModel = FilteredItemModel.All;
                i10 = vVar.f17689r;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 18;
                if (settingsRepositoryImpl.v(filteredItemModel, i10, this) == coroutineSingletons) {
                }
                filteredItemModel2 = FilteredItemModel.Recent;
                i11 = vVar.f17690s;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 19;
                if (settingsRepositoryImpl.v(filteredItemModel2, i11, this) == coroutineSingletons) {
                }
                filteredItemModel3 = FilteredItemModel.Scheduled;
                i12 = vVar.f17691t;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 20;
                if (settingsRepositoryImpl.v(filteredItemModel3, i12, this) == coroutineSingletons) {
                }
                filteredItemModel4 = FilteredItemModel.Archived;
                i13 = vVar.f17692u;
                this.f8037m = null;
                this.n = null;
                this.f8038o = 21;
                if (settingsRepositoryImpl.v(filteredItemModel4, i13, this) == coroutineSingletons) {
                }
                return n.f16010a;
            case 18:
                vVar = this.n;
                settingsRepositoryImpl = this.f8037m;
                b.n1(obj);
                filteredItemModel2 = FilteredItemModel.Recent;
                i11 = vVar.f17690s;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 19;
                if (settingsRepositoryImpl.v(filteredItemModel2, i11, this) == coroutineSingletons) {
                }
                filteredItemModel3 = FilteredItemModel.Scheduled;
                i12 = vVar.f17691t;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 20;
                if (settingsRepositoryImpl.v(filteredItemModel3, i12, this) == coroutineSingletons) {
                }
                filteredItemModel4 = FilteredItemModel.Archived;
                i13 = vVar.f17692u;
                this.f8037m = null;
                this.n = null;
                this.f8038o = 21;
                if (settingsRepositoryImpl.v(filteredItemModel4, i13, this) == coroutineSingletons) {
                }
                return n.f16010a;
            case 19:
                vVar = this.n;
                settingsRepositoryImpl = this.f8037m;
                b.n1(obj);
                filteredItemModel3 = FilteredItemModel.Scheduled;
                i12 = vVar.f17691t;
                this.f8037m = settingsRepositoryImpl;
                this.n = vVar;
                this.f8038o = 20;
                if (settingsRepositoryImpl.v(filteredItemModel3, i12, this) == coroutineSingletons) {
                }
                filteredItemModel4 = FilteredItemModel.Archived;
                i13 = vVar.f17692u;
                this.f8037m = null;
                this.n = null;
                this.f8038o = 21;
                if (settingsRepositoryImpl.v(filteredItemModel4, i13, this) == coroutineSingletons) {
                }
                return n.f16010a;
            case 20:
                vVar = this.n;
                settingsRepositoryImpl = this.f8037m;
                b.n1(obj);
                filteredItemModel4 = FilteredItemModel.Archived;
                i13 = vVar.f17692u;
                this.f8037m = null;
                this.n = null;
                this.f8038o = 21;
                if (settingsRepositoryImpl.v(filteredItemModel4, i13, this) == coroutineSingletons) {
                }
                return n.f16010a;
            case 21:
                b.n1(obj);
                return n.f16010a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
