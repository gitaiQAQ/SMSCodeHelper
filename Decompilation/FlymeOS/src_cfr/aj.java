/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 */
public class aj
implements ah {
    public static final ai a = ai.q;

    @Override
    public m a(int n2, l[] object) {
        if (object == null) {
            throw new IllegalArgumentException("\u8fd0\u7b97\u64cd\u4f5c\u7b26\u53c2\u6570\u4e3a\u7a7a");
        }
        if (object.length != 2) {
            throw new i("\u64cd\u4f5c\u7b26\"" + a.a() + "\"\u53c2\u6570\u4e22\u5931", a.a(), n2);
        }
        l l2 = object[1];
        object = object[0];
        if (l2 == null || object == null) {
            throw new NullPointerException("\u64cd\u4f5c\u7b26\"" + a.a() + "\"\u53c2\u6570\u4e3a\u7a7a");
        }
        if (l.a.c == l2.a() && l.a.c == object.a()) {
            return new m(l.a.c, (Object)Boolean.FALSE);
        }
        throw new i("\u64cd\u4f5c\u7b26\"" + a.a() + "\"\u53c2\u6570\u7c7b\u578b\u9519\u8bef", a.a(), n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public m a(m[] object) {
        if (object == null) throw new IllegalArgumentException("\u64cd\u4f5c\u7b26\"" + a.a() + "\u64cd\u4f5c\u7f3a\u5c11\u53c2\u6570");
        if (object.length != 2) {
            throw new IllegalArgumentException("\u64cd\u4f5c\u7b26\"" + a.a() + "\u64cd\u4f5c\u7f3a\u5c11\u53c2\u6570");
        }
        Object object2 = object[1];
        if (object2 == null) throw new NullPointerException("\u64cd\u4f5c\u7b26\"" + a.a() + "\"\u53c2\u6570\u4e3a\u7a7a");
        if (object2.b() == null) {
            throw new NullPointerException("\u64cd\u4f5c\u7b26\"" + a.a() + "\"\u53c2\u6570\u4e3a\u7a7a");
        }
        Object object3 = object[0];
        if (object3 == null) throw new NullPointerException("\u64cd\u4f5c\u7b26\"" + a.a() + "\"\u53c2\u6570\u4e3a\u7a7a");
        if (object3.b() == null) {
            throw new NullPointerException("\u64cd\u4f5c\u7b26\"" + a.a() + "\"\u53c2\u6570\u4e3a\u7a7a");
        }
        object = object2;
        if (object2.p()) {
            object = ((n)object2.b()).b();
        }
        if (l.a.c != object.a()) {
            throw new IllegalArgumentException("\u64cd\u4f5c\u7b26\"" + a.a() + "\"\u7b2c\u4e00\u53c2\u6570\u7c7b\u578b\u9519\u8bef");
        }
        object2 = object;
        if (object.e() == false) return object2;
        object = object3.p() ? ((n)object3.b()).b() : object3;
        if (l.a.c == object.a()) return object;
        throw new IllegalArgumentException("\u64cd\u4f5c\u7b26\"" + a.a() + "\"\u7b2c\u4e8c\u53c2\u6570\u7c7b\u578b\u9519\u8bef");
    }
}
