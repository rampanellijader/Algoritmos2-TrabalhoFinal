package comparators;

import java.util.Comparator;

import model.Aluno;

public class SearchByAgeAndCity implements Comparator<Aluno> {

	public SearchByAgeAndCity(int idade, String cidade) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Aluno o1, Aluno o2) {
		int retorne = 0;
 		if (o1.getIdade() != o2.getIdade())
 			retorne = Integer.toString(o1.getIdade()).compareTo(Integer.toString(o2.getIdade()));
 		else retorne = o1.getCidade().compareTo(o2.getCidade());
 		
 		return retorne;
	
}

}