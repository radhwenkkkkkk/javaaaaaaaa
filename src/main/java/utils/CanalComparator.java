package utils;

import models.Canal;

public class CanalComparator {

	public int compare(Canal o1, Canal o2) {
		return o1.getOrdre() - o2.getOrdre();
	}
}
