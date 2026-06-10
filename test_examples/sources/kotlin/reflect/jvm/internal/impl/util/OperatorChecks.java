package kotlin.reflect.jvm.internal.impl.util;

import da.i;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.util.ReturnsCheck;
import kotlin.reflect.jvm.internal.impl.util.f;
import kotlin.reflect.jvm.internal.impl.util.h;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class OperatorChecks extends a {

    /* renamed from: a  reason: collision with root package name */
    public static final OperatorChecks f15083a = new OperatorChecks();

    /* renamed from: b  reason: collision with root package name */
    public static final List<d> f15084b;

    static {
        h9.e eVar = i.f10494i;
        f.b bVar = f.b.f15106b;
        b[] bVarArr = {bVar, new h.a(1)};
        h9.e eVar2 = i.f10495j;
        b[] bVarArr2 = {bVar, new h.a(2)};
        h9.e eVar3 = i.f10487a;
        g gVar = g.f15107a;
        e eVar4 = e.f15103a;
        b[] bVarArr3 = {bVar, gVar, new h.a(2), eVar4};
        h9.e eVar5 = i.f10488b;
        b[] bVarArr4 = {bVar, gVar, new h.a(3), eVar4};
        h9.e eVar6 = i.c;
        b[] bVarArr5 = {bVar, gVar, new h.b(), eVar4};
        h9.e eVar7 = i.f10492g;
        b[] bVarArr6 = {bVar};
        h9.e eVar8 = i.f10491f;
        h.d dVar = h.d.f15112b;
        ReturnsCheck.ReturnsBoolean returnsBoolean = ReturnsCheck.ReturnsBoolean.c;
        b[] bVarArr7 = {bVar, dVar, gVar, returnsBoolean};
        h9.e eVar9 = i.f10493h;
        h.c cVar = h.c.f15111b;
        b[] bVarArr8 = {bVar, cVar};
        h9.e eVar10 = i.f10496k;
        b[] bVarArr9 = {bVar, cVar};
        h9.e eVar11 = i.f10497l;
        b[] bVarArr10 = {bVar, cVar, returnsBoolean};
        h9.e eVar12 = i.f10500p;
        b[] bVarArr11 = {bVar, dVar, gVar};
        h9.e eVar13 = i.f10501q;
        b[] bVarArr12 = {bVar, dVar, gVar};
        h9.e eVar14 = i.f10489d;
        b[] bVarArr13 = {f.a.f15105b};
        h9.e eVar15 = i.f10490e;
        b[] bVarArr14 = {bVar, ReturnsCheck.ReturnsInt.c, dVar, gVar};
        Set<h9.e> set = i.f10504t;
        b[] bVarArr15 = {bVar, dVar, gVar};
        Set<h9.e> set2 = i.f10503s;
        b[] bVarArr16 = {bVar, cVar};
        List O0 = a1.c.O0(i.n, i.f10499o);
        b[] bVarArr17 = {bVar};
        Set<h9.e> set3 = i.f10505u;
        b[] bVarArr18 = {bVar, ReturnsCheck.ReturnsUnit.c, dVar, gVar};
        Regex regex = i.f10498m;
        b[] bVarArr19 = {bVar, cVar};
        Checks$3 checks$3 = Checks$3.f15081j;
        v7.g.f(regex, "regex");
        v7.g.f(checks$3, "additionalChecks");
        f15084b = a1.c.O0(new d(eVar, bVarArr), new d(eVar2, bVarArr2, OperatorChecks$checks$1.f15085j), new d(eVar3, bVarArr3), new d(eVar5, bVarArr4), new d(eVar6, bVarArr5), new d(eVar7, bVarArr6), new d(eVar8, bVarArr7), new d(eVar9, bVarArr8), new d(eVar10, bVarArr9), new d(eVar11, bVarArr10), new d(eVar12, bVarArr11), new d(eVar13, bVarArr12), new d(eVar14, bVarArr13, OperatorChecks$checks$2.f15086j), new d(eVar15, bVarArr14), new d(set, bVarArr15), new d(set2, bVarArr16), new d(O0, bVarArr17, OperatorChecks$checks$3.f15087j), new d(set3, bVarArr18), new d(null, regex, null, checks$3, (b[]) Arrays.copyOf(bVarArr19, 2)));
    }
}
