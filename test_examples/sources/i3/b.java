package i3;

import android.graphics.Rect;
import b3.g;
import i3.a;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class b {

    /* loaded from: classes.dex */
    public interface a<T> {
    }

    /* renamed from: i3.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0130b<T> implements Comparator<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f11702a = new Rect();

        /* renamed from: b  reason: collision with root package name */
        public final Rect f11703b = new Rect();
        public final boolean c;

        /* renamed from: d  reason: collision with root package name */
        public final a<T> f11704d;

        public C0130b(boolean z10, a.C0129a c0129a) {
            this.c = z10;
            this.f11704d = c0129a;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            a.C0129a c0129a = (a.C0129a) this.f11704d;
            c0129a.getClass();
            Rect rect = this.f11702a;
            ((g) t10).d(rect);
            c0129a.getClass();
            Rect rect2 = this.f11703b;
            ((g) t11).d(rect2);
            int i10 = rect.top;
            int i11 = rect2.top;
            if (i10 < i11) {
                return -1;
            }
            if (i10 > i11) {
                return 1;
            }
            int i12 = rect.left;
            int i13 = rect2.left;
            boolean z10 = this.c;
            if (i12 < i13) {
                if (!z10) {
                    return -1;
                }
                return 1;
            } else if (i12 > i13) {
                if (z10) {
                    return -1;
                }
                return 1;
            } else {
                int i14 = rect.bottom;
                int i15 = rect2.bottom;
                if (i14 < i15) {
                    return -1;
                }
                if (i14 > i15) {
                    return 1;
                }
                int i16 = rect.right;
                int i17 = rect2.right;
                if (i16 < i17) {
                    if (!z10) {
                        return -1;
                    }
                    return 1;
                } else if (i16 > i17) {
                    if (z10) {
                        return -1;
                    }
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
        if (r10.left >= r12.right) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(int i10, Rect rect, Rect rect2, Rect rect3) {
        boolean z10;
        int i11;
        int i12;
        boolean b5 = b(i10, rect, rect2);
        if (!b(i10, rect, rect3) && b5) {
            if (i10 != 17) {
                if (i10 != 33) {
                    if (i10 != 66) {
                        if (i10 == 130) {
                            if (rect.bottom <= rect3.top) {
                                z10 = true;
                            }
                            z10 = false;
                        } else {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                    } else {
                        if (rect.right <= rect3.left) {
                            z10 = true;
                        }
                        z10 = false;
                    }
                } else {
                    if (rect.top >= rect3.bottom) {
                        z10 = true;
                    }
                    z10 = false;
                }
            }
            if (z10 && i10 != 17 && i10 != 66) {
                int d5 = d(i10, rect, rect2);
                if (i10 != 17) {
                    if (i10 != 33) {
                        if (i10 != 66) {
                            if (i10 == 130) {
                                i11 = rect3.bottom;
                                i12 = rect.bottom;
                            } else {
                                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            }
                        } else {
                            i11 = rect3.right;
                            i12 = rect.right;
                        }
                    } else {
                        i11 = rect.top;
                        i12 = rect3.top;
                    }
                } else {
                    i11 = rect.left;
                    i12 = rect3.left;
                }
                if (d5 >= Math.max(1, i11 - i12)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public static boolean b(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static boolean c(int i10, Rect rect, Rect rect2) {
        if (i10 == 17) {
            int i11 = rect.right;
            int i12 = rect2.right;
            return (i11 > i12 || rect.left >= i12) && rect.left > rect2.left;
        } else if (i10 == 33) {
            int i13 = rect.bottom;
            int i14 = rect2.bottom;
            return (i13 > i14 || rect.top >= i14) && rect.top > rect2.top;
        } else if (i10 == 66) {
            int i15 = rect.left;
            int i16 = rect2.left;
            return (i15 < i16 || rect.right <= i16) && rect.right < rect2.right;
        } else if (i10 == 130) {
            int i17 = rect.top;
            int i18 = rect2.top;
            return (i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    public static int d(int i10, Rect rect, Rect rect2) {
        int i11;
        int i12;
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 == 130) {
                        i11 = rect2.top;
                        i12 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i11 = rect2.left;
                    i12 = rect.right;
                }
            } else {
                i11 = rect.top;
                i12 = rect2.bottom;
            }
        } else {
            i11 = rect.left;
            i12 = rect2.right;
        }
        return Math.max(0, i11 - i12);
    }

    public static int e(int i10, Rect rect, Rect rect2) {
        int height;
        int i11;
        int height2;
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            height = (rect.width() / 2) + rect.left;
            i11 = rect2.left;
            height2 = rect2.width();
            return Math.abs(height - ((height2 / 2) + i11));
        }
        height = (rect.height() / 2) + rect.top;
        i11 = rect2.top;
        height2 = rect2.height();
        return Math.abs(height - ((height2 / 2) + i11));
    }
}
