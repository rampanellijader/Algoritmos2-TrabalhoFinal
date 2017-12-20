package comparators;

import java.util.Comparator;

import model.Aluno;

public class SearchByName implements Comparator<Aluno> {

	public SearchByName(String name) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Aluno o1, Aluno o2) {
		if( o1.getName().equals(o2.getName())) {
			return 0;
		}
		
		return -1;
	}

}
