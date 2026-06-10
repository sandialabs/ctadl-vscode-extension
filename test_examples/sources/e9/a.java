package e9;

import b8.h;
import b8.i;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.c;
import n7.l;
import v7.g;

/* loaded from: classes.dex */
public final class a extends f9.a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f10672f = new a(1, 0, 7);

    /* renamed from: e9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0112a {
        public static a a(InputStream inputStream) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            i iVar = new i(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(l.Z1(iVar, 10));
            h it = iVar.iterator();
            while (it.f6502k) {
                it.nextInt();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] K2 = c.K2(arrayList);
            return new a(Arrays.copyOf(K2, K2.length));
        }
    }

    static {
        new a(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        g.f(iArr, "numbers");
    }
}
