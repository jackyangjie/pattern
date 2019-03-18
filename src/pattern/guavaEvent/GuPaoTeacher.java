package pattern.guavaEvent;

import com.google.common.eventbus.Subscribe;

public class GuPaoTeacher {

    private String teacherName;

    public GuPaoTeacher(String teacherName) {
        this.teacherName =teacherName;
    }

    @Subscribe
    String question(Question question){
        StringBuilder sb = new StringBuilder("@"+teacherName+"\n\r");
         sb.append(question.toString());
        return null;
    }
}
