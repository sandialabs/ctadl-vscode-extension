package b8;

import java.util.Iterator;

/* loaded from: classes.dex */
public class a implements Iterable<Character>, w7.a {

    /* renamed from: i  reason: collision with root package name */
    public final char f6488i;

    /* renamed from: j  reason: collision with root package name */
    public final char f6489j;

    /* renamed from: k  reason: collision with root package name */
    public final int f6490k = 1;

    public a(char c, char c10) {
        this.f6488i = c;
        this.f6489j = (char) a1.c.E0(c, c10, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator<Character> iterator() {
        return new b(this.f6488i, this.f6489j, this.f6490k);
    }
}
