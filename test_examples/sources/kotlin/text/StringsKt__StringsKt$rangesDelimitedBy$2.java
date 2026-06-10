package kotlin.text;

import androidx.datastore.preferences.PreferencesProto$Value;
import b8.i;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.c;
import kotlin.jvm.internal.Lambda;
import u7.p;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "currentIndex", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StringsKt__StringsKt$rangesDelimitedBy$2 extends Lambda implements p<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ List<String> f15133j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ boolean f15134k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringsKt__StringsKt$rangesDelimitedBy$2(List<String> list, boolean z10) {
        super(2);
        this.f15133j = list;
        this.f15134k = z10;
    }

    @Override // u7.p
    public final Pair<? extends Integer, ? extends Integer> R(CharSequence charSequence, Integer num) {
        Object obj;
        Pair pair;
        Object obj2;
        CharSequence charSequence2 = charSequence;
        int intValue = num.intValue();
        g.f(charSequence2, "$this$$receiver");
        boolean z10 = this.f15134k;
        List<String> list = this.f15133j;
        if (!z10 && list.size() == 1) {
            String str = (String) c.B2(list);
            int e12 = b.e1(charSequence2, str, intValue, false, 4);
            if (e12 >= 0) {
                pair = new Pair(Integer.valueOf(e12), str);
            } else {
                pair = null;
            }
        } else {
            if (intValue < 0) {
                intValue = 0;
            }
            i iVar = new i(intValue, charSequence2.length());
            boolean z11 = charSequence2 instanceof String;
            int i10 = iVar.f6499k;
            int i11 = iVar.f6498j;
            if (z11) {
                if ((i10 > 0 && intValue <= i11) || (i10 < 0 && i11 <= intValue)) {
                    while (true) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                String str2 = (String) obj2;
                                if (ha.i.U0(0, intValue, str2.length(), str2, (String) charSequence2, z10)) {
                                    break;
                                }
                            } else {
                                obj2 = null;
                                break;
                            }
                        }
                        String str3 = (String) obj2;
                        if (str3 != null) {
                            pair = new Pair(Integer.valueOf(intValue), str3);
                            break;
                        } else if (intValue == i11) {
                            break;
                        } else {
                            intValue += i10;
                        }
                    }
                }
                pair = null;
            } else {
                if ((i10 > 0 && intValue <= i11) || (i10 < 0 && i11 <= intValue)) {
                    while (true) {
                        Iterator<T> it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj = it2.next();
                                String str4 = (String) obj;
                                if (b.j1(str4, 0, charSequence2, intValue, str4.length(), z10)) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        String str5 = (String) obj;
                        if (str5 != null) {
                            pair = new Pair(Integer.valueOf(intValue), str5);
                            break;
                        } else if (intValue == i11) {
                            break;
                        } else {
                            intValue += i10;
                        }
                    }
                }
                pair = null;
            }
        }
        if (pair == null) {
            return null;
        }
        return new Pair<>(pair.f12962i, Integer.valueOf(((String) pair.f12963j).length()));
    }
}
