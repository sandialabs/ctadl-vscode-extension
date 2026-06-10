package f7;

import com.noto.app.domain.model.NoteListSortingType;
import java.util.Comparator;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class l<T> implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Comparator f10953a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ NoteListSortingType f10954b;

    public l(j jVar, NoteListSortingType noteListSortingType) {
        this.f10953a = jVar;
        this.f10954b = noteListSortingType;
    }

    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        Comparable valueOf;
        Comparable valueOf2;
        int compare = this.f10953a.compare(t10, t11);
        if (compare == 0) {
            t6.d dVar = (t6.d) t11;
            NoteListSortingType noteListSortingType = this.f10954b;
            int ordinal = noteListSortingType.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            valueOf = dVar.f17630k;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        String str = dVar.c;
                        if (ha.i.T0(str)) {
                            valueOf = dVar.f17623d;
                        } else {
                            valueOf = str;
                        }
                    }
                } else {
                    valueOf = dVar.f17625f;
                }
            } else {
                valueOf = Integer.valueOf(dVar.f17624e);
            }
            t6.d dVar2 = (t6.d) t10;
            int ordinal2 = noteListSortingType.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        if (ordinal2 == 3) {
                            valueOf2 = dVar2.f17630k;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        String str2 = dVar2.c;
                        if (ha.i.T0(str2)) {
                            valueOf2 = dVar2.f17623d;
                        } else {
                            valueOf2 = str2;
                        }
                    }
                } else {
                    valueOf2 = dVar2.f17625f;
                }
            } else {
                valueOf2 = Integer.valueOf(dVar2.f17624e);
            }
            return a1.c.g0(valueOf, valueOf2);
        }
        return compare;
    }
}
