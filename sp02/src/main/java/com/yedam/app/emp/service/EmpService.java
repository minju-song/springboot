package com.yedam.app.emp.service;

import java.util.List;

public interface EmpService {
	
	//전체조회
	public List<EmpVO> getEmpAllList();
	
	//단건조회
	public EmpVO getEmpInfo();
	
	//등록
	public int insertEmpInfo(EmpVO empVO);
}
