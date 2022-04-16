package com.lin.maven.imperial.court.service.api;

import com.lin.maven.imperial.court.entity.Emp;

public interface EmpService {
    Emp getEmpByLoginAccount(String loginAccount, String loginPassword);
}
