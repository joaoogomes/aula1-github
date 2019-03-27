package aplicacao;

import java.util.ArrayList;
import java.util.List;

import entidades.ContaObj;

public class ArrayFunc {

	public static void main(String[] args) {

		List<ContaObj> lista = new ArrayList<>();
		lista.add(new ContaObj(10,"joao",1000));
		System.out.println(lista);
	}

}
