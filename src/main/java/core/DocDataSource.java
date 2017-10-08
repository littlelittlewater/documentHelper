package core;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by MoEr on 2017/10/8.
 */
public class DocDataSource {
    private Map map  = new HashMap();
    public Map getData(){
        return this.map;
    }

    public void DocDateSource(Map map){
        this.map = map ;
    }

}
