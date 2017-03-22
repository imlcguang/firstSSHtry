package com.ixs.mvctry.service;

import java.util.Map;
import java.util.Set;

public interface ICollectionService {

	
	/**
	 * 建立书籍-用户map
	 * @return key:bookid ;value:readeridset 的map
	 */
	public Map<String, Set<String>> findBUser();
	
	
	/**
	 * 建立用户-书籍map
	 * 
	 * @return key:readid ;value:bookidset 的map
	 */
	public Map<String, Set<String>> findUBook();
}
