package d.generic;

import java.io.Serializable;

public class CastingGenericDTO<T> implements Serializable {

	private T object;
	public void setObject(T obj){
		this.object=obj;
		
	}
	
	public Object getObject(){
		return object;
	}

}
