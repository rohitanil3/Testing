package com.onesolvent.api;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService {

	public List<String> retrieveToDos(String uname) {
		// TODO Auto-generated method stub
		return Arrays.asList("Product Spring","Service spring");
	}

}
