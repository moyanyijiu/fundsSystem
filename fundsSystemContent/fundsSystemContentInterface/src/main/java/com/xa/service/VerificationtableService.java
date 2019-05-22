package com.xa.service;

import com.xa.pojo.Verificationtable;

import java.util.List;

public interface VerificationtableService {

    /*4号自写*/
    int updateVerificationtable4(Verificationtable verificationtable);


    int   insertVerificationtable4(Verificationtable verificationtable);

    /*获取所有*/
    List<Verificationtable> getAllVerificationtable();

    Verificationtable selectOneVerificationtable(Verificationtable verificationtable);

}
