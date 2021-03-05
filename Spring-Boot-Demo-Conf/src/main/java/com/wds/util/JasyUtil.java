package com.wds.util;

import org.jasypt.encryption.pbe.config.EnvironmentPBEConfig;
import org.jasypt.encryption.pbe.config.EnvironmentStringPBEConfig;
import org.jasypt.util.text.BasicTextEncryptor;

public class JasyUtil {

    public static void main(String[] args){

        EnvironmentStringPBEConfig config = new EnvironmentStringPBEConfig();
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPassword("123123#@!");
        String username = encryptor.decrypt("root");
        String password = encryptor.decrypt("123123");
        System.out.println(username+"\n"+password);

        //nvWQC1Hq/E+P7/gXre26kQ==
        //gJKJaRqW6GJglnp4U5nHTw==
    }
}
