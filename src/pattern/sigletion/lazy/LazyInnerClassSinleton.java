package pattern.sigletion.lazy;

import java.io.Serializable;

public class LazyInnerClassSinleton implements Serializable {
    private LazyInnerClassSinleton() {
        if (LazyHoder.sinleton != null) {
            throw new RuntimeException("该对象 已经初始化！");
        }
    }
    public static final LazyInnerClassSinleton getInstents() {

        return LazyHoder.sinleton;
    }

    private static class LazyHoder {
        private final static LazyInnerClassSinleton sinleton = new LazyInnerClassSinleton();
    }

    private Object readResolve(){
        return LazyHoder.sinleton;
    }

}
