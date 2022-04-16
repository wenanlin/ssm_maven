package com.lin.maven.imperial.court.dao.api;

import com.lin.maven.imperial.court.entity.Emp;

public interface EmpDao {
    Emp selectEmpByLoginAccount(String loginAccount, String encodedLoginPassword);
}
