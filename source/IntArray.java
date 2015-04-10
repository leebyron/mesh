package megamu.mesh;

import processing.core.*;

public class IntArray {

	int[] data;
	int length;

	public IntArray(){
		this(1);
	}

	public IntArray( int l ){
		data = new int[l];
		length = 0;
	}

	public void add( int d ){
		if( length==data.length )
			data = PApplet.expand(data);
		data[length++] = d;
	}

	public int get( int i ){
		return data[i];
	}

	public boolean contains( int d ){
		for(int i=0; i<length; i++)
			if(data[i]==d)
				return true;
		return false;
	}

}