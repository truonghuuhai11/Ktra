package advance.dev.dao;

import advance.dev.model.CanBo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Manager implements IManager {
	private List<CanBo> canBoList = new ArrayList<>();

	@Override
	public void add(CanBo cb) {
		canBoList.add(cb);
	}

	@Override
	public void print() {
		for (CanBo cb : canBoList) {
			System.out.println(cb.getTen() + ", " + cb.getTuoi() + ", " + cb.getGioiTinh() + ", " + cb.getDiaChi());
		}
	}

	@Override
	public void sortByName(int order) {
		if (order == 1) {
			Collections.sort(canBoList, Comparator.comparing(CanBo::getTen));
		} else if (order == -1) {
			Collections.sort(canBoList, Comparator.comparing(CanBo::getTen).reversed());
		}
	}
}
