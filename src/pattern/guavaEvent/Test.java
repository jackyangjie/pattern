package pattern.guavaEvent;

import com.google.common.eventbus.EventBus;

import java.util.Date;

public class Test {

    public static void main(String[] args) {
        EventBus bus = new EventBus();
        GuPaoTeacher tom = new GuPaoTeacher("tom");
        GuPaoTeacher mic = new GuPaoTeacher("mic");
        bus.register(tom);
        bus.register(mic);
        Question q = new Question("Spring 类找不到", "required a bean of type 'sinochem.zorro.core.common.dao.ICommonDao' that could not be found",
                new Date(), "小明");

        bus.post(q);
    }
}
