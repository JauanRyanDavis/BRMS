package gov.dhs.fema.ndgrants_rules.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

import java.util.Map;
import java.util.HashMap;

public class MappedIOValues implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    protected Map<String, Object> map = null;
	
    public MappedIOValues()
    {
       map = new HashMap<String, Object>();
    }
   
    public void setValue(String key, Object element)
	{
		if(map == null)
		{
			map = new HashMap<String, Object>();
		}
		this.map.put(key, element);
	}
    
    public Map<String, Object> getMap()
	{
		return map;
	}

}