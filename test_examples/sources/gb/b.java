package gb;

import androidx.fragment.app.g0;
import java.util.ArrayList;
import kotlin.collections.c;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.error.InstanceCreationException;
import org.koin.core.logger.Level;
import v7.g;

/* loaded from: classes.dex */
public abstract class b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final BeanDefinition<T> f11319a;

    public b(BeanDefinition<T> beanDefinition) {
        this.f11319a = beanDefinition;
    }

    public T a(g0 g0Var) {
        String className;
        g.f(g0Var, "context");
        org.koin.core.a aVar = (org.koin.core.a) g0Var.f5159b;
        boolean c = aVar.c.c(Level.DEBUG);
        BeanDefinition<T> beanDefinition = this.f11319a;
        if (c) {
            aVar.c.a(g.k(beanDefinition, "| create instance for "));
        }
        try {
            jb.a aVar2 = (jb.a) g0Var.f5160d;
            if (aVar2 == null) {
                aVar2 = new jb.a(0);
            }
            return beanDefinition.f16508d.R((org.koin.core.scope.a) g0Var.c, aVar2);
        } catch (Exception e10) {
            StringBuilder sb = new StringBuilder();
            sb.append(e10);
            sb.append("\n\t");
            StackTraceElement[] stackTrace = e10.getStackTrace();
            g.e(stackTrace, "e.stackTrace");
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                g.e(stackTraceElement.getClassName(), "it.className");
                if (!(!kotlin.text.b.Y0(className, "sun.reflect", false))) {
                    break;
                }
                arrayList.add(stackTraceElement);
            }
            sb.append(c.t2(arrayList, "\n\t", null, null, null, 62));
            String sb2 = sb.toString();
            hb.b bVar = aVar.c;
            String str = "Instance creation error : could not create instance for " + beanDefinition + ": " + sb2;
            bVar.getClass();
            g.f(str, "msg");
            bVar.b(str, Level.ERROR);
            throw new InstanceCreationException(g.k(beanDefinition, "Could not create instance for "), e10);
        }
    }

    public abstract T b(g0 g0Var);
}
