package pattern.adapter;

import java.util.Map;

public class JsonAdapter extends AnalysisXml {

    //把以前之返回 Map的数据
    //现在 改成可以返回json格式的数据 还兼容 以前的 数据格式
    public String analysisJosn(String xml){
        Map<String,Object> map = super.analysis(xml);
        return mapToJSON(map);
    }

    private String mapToJSON(Map<String, Object> map) {
        return null;
    }
}
