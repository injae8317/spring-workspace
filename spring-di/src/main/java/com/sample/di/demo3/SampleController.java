package com.sample.di.demo3;

public class SampleController {
	
	private SampleDao sampleDao;
	
	public void setSampleDao(SampleDao sampleDao) {
		this.sampleDao = sampleDao;
	}
	
	public void add(String id, String password) {
		// ����۾� ó��
		// SampleDao�� insert��� ����Ѵ�.
		sampleDao.insert(id, password);
		
	}

}
