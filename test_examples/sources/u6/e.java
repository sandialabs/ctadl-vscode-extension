package u6;

import com.noto.app.domain.model.FilteringType;
import com.noto.app.domain.model.FolderListSortingType;
import com.noto.app.domain.model.Font;
import com.noto.app.domain.model.Icon;
import com.noto.app.domain.model.Language;
import com.noto.app.domain.model.ScreenBrightnessLevel;
import com.noto.app.domain.model.SortingOrder;
import com.noto.app.domain.model.Theme;
import com.noto.app.domain.model.VaultTimeout;
import com.noto.app.filtered.FilteredItemModel;
import java.util.List;
import m7.n;
import t6.v;

/* loaded from: classes.dex */
public interface e {
    kotlinx.coroutines.flow.b<Boolean> A();

    Object B(VaultTimeout vaultTimeout, p7.c<? super n> cVar);

    Object C(v vVar, p7.c<? super n> cVar);

    Object D(long j2, p7.c<? super n> cVar);

    Object E(SortingOrder sortingOrder, p7.c<? super n> cVar);

    Object F(FolderListSortingType folderListSortingType, p7.c<? super n> cVar);

    kotlinx.coroutines.flow.b<Boolean> G(int i10);

    kotlinx.coroutines.flow.b<Boolean> H(int i10);

    Object I(boolean z10, p7.c<? super n> cVar);

    Object J(boolean z10, p7.c<? super n> cVar);

    kotlinx.coroutines.flow.b<Long> K();

    kotlinx.coroutines.flow.b<Long> L(int i10);

    kotlinx.coroutines.flow.b<ScreenBrightnessLevel> M();

    kotlinx.coroutines.flow.b<SortingOrder> N();

    Object O(boolean z10, p7.c<? super n> cVar);

    kotlinx.coroutines.flow.b<Boolean> P();

    kotlinx.coroutines.flow.b<Boolean> Q();

    Object R(ScreenBrightnessLevel screenBrightnessLevel, p7.c<? super n> cVar);

    Object S(int i10, long j2, p7.c<? super n> cVar);

    Object T(String str, p7.c<? super n> cVar);

    Object U(boolean z10, p7.c<? super n> cVar);

    kotlinx.coroutines.flow.b<String> V();

    Object W(boolean z10, p7.c<? super n> cVar);

    Object X(Font font, p7.c<? super n> cVar);

    Object Y(String str, p7.c<? super n> cVar);

    kotlinx.coroutines.flow.b<Boolean> Z(int i10);

    Object a(boolean z10, p7.c<? super n> cVar);

    Object a0(Language language, p7.c<? super n> cVar);

    kotlinx.coroutines.flow.b<Boolean> b(int i10);

    Object b0(boolean z10, p7.c<? super n> cVar);

    Object c(int i10, p7.c cVar);

    kotlinx.coroutines.flow.b<Boolean> c0();

    Object d(long j2, p7.c<? super n> cVar);

    Object d0(boolean z10, p7.c<? super n> cVar);

    Object e(int i10, p7.c cVar, boolean z10);

    kotlinx.coroutines.flow.b<Long> e0();

    kotlinx.coroutines.flow.b f(long j2, int i10);

    Object f0(int i10, long j2, List<Long> list, p7.c<? super n> cVar);

    kotlinx.coroutines.flow.b<Boolean> g();

    Object g0(int i10, int i11, p7.c<? super n> cVar);

    kotlinx.coroutines.flow.b<Icon> getIcon();

    kotlinx.coroutines.flow.b<Font> h();

    kotlinx.coroutines.flow.b<Language> h0();

    Object i(int i10, p7.c cVar, boolean z10);

    Object i0(int i10, p7.c cVar, boolean z10);

    Object j(VaultTimeout vaultTimeout, p7.c<? super n> cVar);

    kotlinx.coroutines.flow.b<String> j0();

    kotlinx.coroutines.flow.b<Integer> k(int i10);

    kotlinx.coroutines.flow.b<Theme> k0();

    kotlinx.coroutines.flow.b<Boolean> l(int i10);

    kotlinx.coroutines.flow.b<FilteringType> l0(int i10);

    Object m(int i10, FilteringType filteringType, p7.c<? super n> cVar);

    kotlinx.coroutines.flow.b<Integer> m0(FilteredItemModel filteredItemModel);

    kotlinx.coroutines.flow.b<VaultTimeout> n();

    kotlinx.coroutines.flow.b<FolderListSortingType> o();

    kotlinx.coroutines.flow.b<Boolean> p();

    Object q(int i10, p7.c cVar, boolean z10);

    kotlinx.coroutines.flow.b<Boolean> r(int i10);

    Object s(Theme theme, p7.c<? super n> cVar);

    Object t(int i10, p7.c cVar, boolean z10);

    kotlinx.coroutines.flow.b<VaultTimeout> u();

    Object v(FilteredItemModel filteredItemModel, int i10, p7.c<? super n> cVar);

    kotlinx.coroutines.flow.b<v> w();

    kotlinx.coroutines.flow.b<Boolean> x();

    Object y(Icon icon, p7.c<? super n> cVar);

    kotlinx.coroutines.flow.b<Boolean> z();
}
