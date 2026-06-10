package g9;

import ha.i;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import n7.l;
import n7.r;
import n7.s;
import n7.t;

/* loaded from: classes.dex */
public class g implements f9.c {

    /* renamed from: d  reason: collision with root package name */
    public static final List<String> f11276d;

    /* renamed from: a  reason: collision with root package name */
    public final String[] f11277a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Integer> f11278b;
    public final List<JvmProtoBuf.StringTableTypes.Record> c;

    static {
        String t22 = kotlin.collections.c.t2(a1.c.O0('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        int i10 = 16;
        List<String> O0 = a1.c.O0(t22.concat("/Any"), t22.concat("/Nothing"), t22.concat("/Unit"), t22.concat("/Throwable"), t22.concat("/Number"), t22.concat("/Byte"), t22.concat("/Double"), t22.concat("/Float"), t22.concat("/Int"), t22.concat("/Long"), t22.concat("/Short"), t22.concat("/Boolean"), t22.concat("/Char"), t22.concat("/CharSequence"), t22.concat("/String"), t22.concat("/Comparable"), t22.concat("/Enum"), t22.concat("/Array"), t22.concat("/ByteArray"), t22.concat("/DoubleArray"), t22.concat("/FloatArray"), t22.concat("/IntArray"), t22.concat("/LongArray"), t22.concat("/ShortArray"), t22.concat("/BooleanArray"), t22.concat("/CharArray"), t22.concat("/Cloneable"), t22.concat("/Annotation"), t22.concat("/collections/Iterable"), t22.concat("/collections/MutableIterable"), t22.concat("/collections/Collection"), t22.concat("/collections/MutableCollection"), t22.concat("/collections/List"), t22.concat("/collections/MutableList"), t22.concat("/collections/Set"), t22.concat("/collections/MutableSet"), t22.concat("/collections/Map"), t22.concat("/collections/MutableMap"), t22.concat("/collections/Map.Entry"), t22.concat("/collections/MutableMap.MutableEntry"), t22.concat("/collections/Iterator"), t22.concat("/collections/MutableIterator"), t22.concat("/collections/ListIterator"), t22.concat("/collections/MutableListIterator"));
        f11276d = O0;
        s R2 = kotlin.collections.c.R2(O0);
        int O02 = m0.b.O0(l.Z1(R2, 10));
        if (O02 >= 16) {
            i10 = O02;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
        Iterator it = R2.iterator();
        while (true) {
            t tVar = (t) it;
            if (tVar.hasNext()) {
                r rVar = (r) tVar.next();
                linkedHashMap.put((String) rVar.f16129b, Integer.valueOf(rVar.f16128a));
            } else {
                return;
            }
        }
    }

    public g(String[] strArr, Set set, ArrayList arrayList) {
        v7.g.f(set, "localNameIndices");
        this.f11277a = strArr;
        this.f11278b = set;
        this.c = arrayList;
    }

    @Override // f9.c
    public final boolean a(int i10) {
        return this.f11278b.contains(Integer.valueOf(i10));
    }

    @Override // f9.c
    public final String b(int i10) {
        return getString(i10);
    }

    @Override // f9.c
    public final String getString(int i10) {
        boolean z10;
        boolean z11;
        String str;
        boolean z12;
        JvmProtoBuf.StringTableTypes.Record record = this.c.get(i10);
        int i11 = record.f14492j;
        if ((i11 & 4) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Object obj = record.f14495m;
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                i9.a aVar = (i9.a) obj;
                aVar.getClass();
                try {
                    String A = aVar.A();
                    if (aVar.u()) {
                        record.f14495m = A;
                    }
                    str = A;
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException("UTF-8 not supported?", e10);
                }
            }
        } else {
            if ((i11 & 2) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                List<String> list = f11276d;
                int size = list.size();
                int i12 = record.f14494l;
                if (i12 >= 0 && i12 < size) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    str = list.get(i12);
                }
            }
            str = this.f11277a[i10];
        }
        if (record.f14496o.size() >= 2) {
            List<Integer> list2 = record.f14496o;
            v7.g.e(list2, "substringIndexList");
            Integer num = list2.get(0);
            Integer num2 = list2.get(1);
            v7.g.e(num, "begin");
            if (num.intValue() >= 0) {
                int intValue = num.intValue();
                v7.g.e(num2, "end");
                if (intValue <= num2.intValue() && num2.intValue() <= str.length()) {
                    str = str.substring(num.intValue(), num2.intValue());
                    v7.g.e(str, "this as java.lang.String…ing(startIndex, endIndex)");
                }
            }
        }
        if (record.f14498q.size() >= 2) {
            List<Integer> list3 = record.f14498q;
            v7.g.e(list3, "replaceCharList");
            v7.g.e(str, "string");
            str = i.V0(str, (char) list3.get(0).intValue(), (char) list3.get(1).intValue());
        }
        JvmProtoBuf.StringTableTypes.Record.Operation operation = record.n;
        if (operation == null) {
            operation = JvmProtoBuf.StringTableTypes.Record.Operation.f14502j;
        }
        int ordinal = operation.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                if (str.length() >= 2) {
                    str = str.substring(1, str.length() - 1);
                    v7.g.e(str, "this as java.lang.String…ing(startIndex, endIndex)");
                }
            } else {
                v7.g.e(str, "string");
                return str;
            }
        } else {
            v7.g.e(str, "string");
        }
        str = i.V0(str, '$', '.');
        v7.g.e(str, "string");
        return str;
    }
}
