package ha;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.text.MatcherMatchResult$groups$1;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Matcher f11611a;

    /* renamed from: b  reason: collision with root package name */
    public a f11612b;

    /* loaded from: classes.dex */
    public static final class a extends n7.a<String> {
        public a() {
        }

        @Override // kotlin.collections.AbstractCollection
        public final int c() {
            return d.this.f11611a.groupCount() + 1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return super.contains((String) obj);
        }

        @Override // n7.a, java.util.List
        public final Object get(int i10) {
            String group = d.this.f11611a.group(i10);
            if (group == null) {
                return "";
            }
            return group;
        }

        @Override // n7.a, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return super.indexOf((String) obj);
        }

        @Override // n7.a, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return super.lastIndexOf((String) obj);
        }
    }

    public d(Matcher matcher, String str) {
        this.f11611a = matcher;
        new MatcherMatchResult$groups$1(this);
    }

    public final List<String> a() {
        if (this.f11612b == null) {
            this.f11612b = new a();
        }
        a aVar = this.f11612b;
        v7.g.c(aVar);
        return aVar;
    }
}
