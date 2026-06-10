package xa;

import androidx.datastore.preferences.protobuf.k;
import java.util.List;
import java.util.Map;
import qa.e;
import u7.l;
import v7.g;
import v7.i;
import wa.q;
import xa.a;

/* loaded from: classes.dex */
public final class b extends k {

    /* renamed from: i  reason: collision with root package name */
    public final Map<c8.b<?>, a> f18768i;

    /* renamed from: j  reason: collision with root package name */
    public final Map<c8.b<?>, Map<c8.b<?>, qa.b<?>>> f18769j;

    /* renamed from: k  reason: collision with root package name */
    public final Map<c8.b<?>, l<?, e<?>>> f18770k;

    /* renamed from: l  reason: collision with root package name */
    public final Map<c8.b<?>, Map<String, qa.b<?>>> f18771l;

    /* renamed from: m  reason: collision with root package name */
    public final Map<c8.b<?>, l<String, qa.a<?>>> f18772m;

    /* JADX WARN: Multi-variable type inference failed */
    public b(Map<c8.b<?>, ? extends a> map, Map<c8.b<?>, ? extends Map<c8.b<?>, ? extends qa.b<?>>> map2, Map<c8.b<?>, ? extends l<?, ? extends e<?>>> map3, Map<c8.b<?>, ? extends Map<String, ? extends qa.b<?>>> map4, Map<c8.b<?>, ? extends l<? super String, ? extends qa.a<?>>> map5) {
        this.f18768i = map;
        this.f18769j = map2;
        this.f18770k = map3;
        this.f18771l = map4;
        this.f18772m = map5;
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final void t0(q qVar) {
        for (Map.Entry<c8.b<?>, a> entry : this.f18768i.entrySet()) {
            c8.b<?> key = entry.getKey();
            a value = entry.getValue();
            if (value instanceof a.C0240a) {
                g.d(key, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                ((a.C0240a) value).getClass();
                g.d(null, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                throw null;
            } else if (value instanceof a.b) {
                ((a.b) value).getClass();
                qVar.a(key, null);
            }
        }
        for (Map.Entry<c8.b<?>, Map<c8.b<?>, qa.b<?>>> entry2 : this.f18769j.entrySet()) {
            c8.b<?> key2 = entry2.getKey();
            for (Map.Entry<c8.b<?>, qa.b<?>> entry3 : entry2.getValue().entrySet()) {
                c8.b<?> key3 = entry3.getKey();
                qa.b<?> value2 = entry3.getValue();
                g.d(key2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                g.d(key3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                g.d(value2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                qVar.b(key2, key3, value2);
            }
        }
        for (Map.Entry<c8.b<?>, l<?, e<?>>> entry4 : this.f18770k.entrySet()) {
            l<?, e<?>> value3 = entry4.getValue();
            g.d(entry4.getKey(), "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            g.d(value3, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'value')] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicSerializerProvider<kotlin.Any> }");
            v7.l.d(1, value3);
        }
        for (Map.Entry<c8.b<?>, l<String, qa.a<?>>> entry5 : this.f18772m.entrySet()) {
            l<String, qa.a<?>> value4 = entry5.getValue();
            g.d(entry5.getKey(), "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            g.d(value4, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'className')] kotlin.String?, kotlinx.serialization.DeserializationStrategy<out kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicDeserializerProvider<out kotlin.Any> }");
            v7.l.d(1, value4);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final <T> qa.b<T> w0(c8.b<T> bVar, List<? extends qa.b<?>> list) {
        g.f(bVar, "kClass");
        g.f(list, "typeArgumentsSerializers");
        a aVar = this.f18768i.get(bVar);
        qa.b<?> a10 = aVar != null ? aVar.a(list) : null;
        if (a10 instanceof qa.b) {
            return (qa.b<T>) a10;
        }
        return null;
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final qa.a y0(String str, c8.b bVar) {
        g.f(bVar, "baseClass");
        Map<String, qa.b<?>> map = this.f18771l.get(bVar);
        qa.b<?> bVar2 = map != null ? map.get(str) : null;
        if (!(bVar2 instanceof qa.b)) {
            bVar2 = null;
        }
        if (bVar2 != null) {
            return bVar2;
        }
        l<String, qa.a<?>> lVar = this.f18772m.get(bVar);
        l<String, qa.a<?>> lVar2 = v7.l.e(1, lVar) ? lVar : null;
        if (lVar2 != null) {
            return lVar2.U(str);
        }
        return null;
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final <T> e<T> z0(c8.b<? super T> bVar, T t10) {
        g.f(bVar, "baseClass");
        g.f(t10, "value");
        if (bVar.c(t10)) {
            Map<c8.b<?>, qa.b<?>> map = this.f18769j.get(bVar);
            qa.b<?> bVar2 = map != null ? map.get(i.a(t10.getClass())) : null;
            if (!(bVar2 instanceof e)) {
                bVar2 = null;
            }
            if (bVar2 != null) {
                return bVar2;
            }
            l<?, e<?>> lVar = this.f18770k.get(bVar);
            l<?, e<?>> lVar2 = v7.l.e(1, lVar) ? lVar : null;
            if (lVar2 != null) {
                return (e<T>) lVar2.U(t10);
            }
            return null;
        }
        return null;
    }
}
