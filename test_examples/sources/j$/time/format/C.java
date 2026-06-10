package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class C {

    /* renamed from: a  reason: collision with root package name */
    public static final C f11905a = new C();

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    private C() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(char c) {
        int i10 = c - '0';
        if (i10 < 0 || i10 > 9) {
            return -1;
        }
        return i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C) {
            ((C) obj).getClass();
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 182;
    }

    public final String toString() {
        return "DecimalStyle[0+-.]";
    }
}
