package pattern.sigletion.lazy;

/**
 * 双检查 单例
 */
public class DoubleCheckSigletion {

    private static DoubleCheckSigletion INSTANS = null;

    private DoubleCheckSigletion() {
    }

    public static DoubleCheckSigletion getInstance() {
        if (INSTANS == null)
            synchronized (DoubleCheckSigletion.class) {
                if (INSTANS == null) {
                    INSTANS = new DoubleCheckSigletion();
                }
            }
        return INSTANS;
    }
}
