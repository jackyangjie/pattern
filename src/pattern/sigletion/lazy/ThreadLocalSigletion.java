package pattern.sigletion.lazy;

public class ThreadLocalSigletion {

    private ThreadLocal<ThreadLocalSigletion> sigletion = new ThreadLocal<ThreadLocalSigletion>(){
        @Override
        protected ThreadLocalSigletion initialValue() {
            return new ThreadLocalSigletion();
        }
    };

}
