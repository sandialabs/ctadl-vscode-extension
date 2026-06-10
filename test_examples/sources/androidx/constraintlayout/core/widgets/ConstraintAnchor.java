package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.datastore.preferences.PreferencesProto$Value;
import g2.j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ConstraintAnchor {

    /* renamed from: b  reason: collision with root package name */
    public int f4221b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final ConstraintWidget f4222d;

    /* renamed from: e  reason: collision with root package name */
    public final Type f4223e;

    /* renamed from: f  reason: collision with root package name */
    public ConstraintAnchor f4224f;

    /* renamed from: i  reason: collision with root package name */
    public SolverVariable f4227i;

    /* renamed from: a  reason: collision with root package name */
    public HashSet<ConstraintAnchor> f4220a = null;

    /* renamed from: g  reason: collision with root package name */
    public int f4225g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f4226h = Integer.MIN_VALUE;

    /* loaded from: classes.dex */
    public enum Type {
        /* JADX INFO: Fake field, exist only in values array */
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.f4222d = constraintWidget;
        this.f4223e = type;
    }

    public final void a(ConstraintAnchor constraintAnchor, int i10) {
        b(constraintAnchor, i10, Integer.MIN_VALUE, false);
    }

    public final boolean b(ConstraintAnchor constraintAnchor, int i10, int i11, boolean z10) {
        if (constraintAnchor == null) {
            j();
            return true;
        } else if (z10 || i(constraintAnchor)) {
            this.f4224f = constraintAnchor;
            if (constraintAnchor.f4220a == null) {
                constraintAnchor.f4220a = new HashSet<>();
            }
            HashSet<ConstraintAnchor> hashSet = this.f4224f.f4220a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f4225g = i10;
            this.f4226h = i11;
            return true;
        } else {
            return false;
        }
    }

    public final void c(int i10, j jVar, ArrayList arrayList) {
        HashSet<ConstraintAnchor> hashSet = this.f4220a;
        if (hashSet != null) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                g2.g.a(it.next().f4222d, i10, arrayList, jVar);
            }
        }
    }

    public final int d() {
        if (this.c) {
            return this.f4221b;
        }
        return 0;
    }

    public final int e() {
        ConstraintAnchor constraintAnchor;
        if (this.f4222d.f4253j0 == 8) {
            return 0;
        }
        int i10 = this.f4226h;
        if (i10 != Integer.MIN_VALUE && (constraintAnchor = this.f4224f) != null && constraintAnchor.f4222d.f4253j0 == 8) {
            return i10;
        }
        return this.f4225g;
    }

    public final ConstraintAnchor f() {
        Type type = this.f4223e;
        int ordinal = type.ordinal();
        ConstraintWidget constraintWidget = this.f4222d;
        switch (ordinal) {
            case 0:
            case 5:
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                return null;
            case 1:
                return constraintWidget.M;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                return constraintWidget.N;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                return constraintWidget.K;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                return constraintWidget.L;
            default:
                throw new AssertionError(type.name());
        }
    }

    public final boolean g() {
        HashSet<ConstraintAnchor> hashSet = this.f4220a;
        if (hashSet == null) {
            return false;
        }
        Iterator<ConstraintAnchor> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f4224f != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(ConstraintAnchor constraintAnchor) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (constraintAnchor == null) {
            return false;
        }
        Type type = Type.BASELINE;
        Type type2 = this.f4223e;
        ConstraintWidget constraintWidget = constraintAnchor.f4222d;
        Type type3 = constraintAnchor.f4223e;
        if (type3 == type2) {
            if (type2 == type && (!constraintWidget.F || !this.f4222d.F)) {
                return false;
            }
            return true;
        }
        int ordinal = type2.ordinal();
        Type type4 = Type.CENTER_Y;
        Type type5 = Type.RIGHT;
        Type type6 = Type.CENTER_X;
        Type type7 = Type.LEFT;
        switch (ordinal) {
            case 0:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                return false;
            case 1:
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                if (type3 != type7 && type3 != type5) {
                    z10 = false;
                    if (!(constraintWidget instanceof f)) {
                        return (z10 || type3 == type6) ? true : true;
                    }
                    return z10;
                }
                z10 = true;
                if (!(constraintWidget instanceof f)) {
                }
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                if (type3 != Type.TOP && type3 != Type.BOTTOM) {
                    z11 = false;
                    if (!(constraintWidget instanceof f)) {
                        return (z11 || type3 == type4) ? true : true;
                    }
                    return z11;
                }
                z11 = true;
                if (!(constraintWidget instanceof f)) {
                }
                break;
            case 5:
                if (type3 == type7 || type3 == type5) {
                    return false;
                }
                return true;
            case 6:
                if (type3 == type || type3 == type6 || type3 == type4) {
                    return false;
                }
                return true;
            default:
                throw new AssertionError(type2.name());
        }
    }

    public final void j() {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor = this.f4224f;
        if (constraintAnchor != null && (hashSet = constraintAnchor.f4220a) != null) {
            hashSet.remove(this);
            if (this.f4224f.f4220a.size() == 0) {
                this.f4224f.f4220a = null;
            }
        }
        this.f4220a = null;
        this.f4224f = null;
        this.f4225g = 0;
        this.f4226h = Integer.MIN_VALUE;
        this.c = false;
        this.f4221b = 0;
    }

    public final void k() {
        SolverVariable solverVariable = this.f4227i;
        if (solverVariable == null) {
            this.f4227i = new SolverVariable(SolverVariable.Type.UNRESTRICTED);
        } else {
            solverVariable.i();
        }
    }

    public final void l(int i10) {
        this.f4221b = i10;
        this.c = true;
    }

    public final String toString() {
        return this.f4222d.f4255k0 + ":" + this.f4223e.toString();
    }
}
