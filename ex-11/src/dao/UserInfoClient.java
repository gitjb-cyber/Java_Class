package dao;

import java.util.Scanner;

public class UserInfoClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("DB 선택");
        String dbType = sc.next();

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("100");
        userInfo.setUserName("이순신");
        userInfo.setPasswd("a1234");

        UserInfoDao userInfoDao = null;

        if(dbType.equals("ORACLE")){
            userInfoDao = new UserInfoOracleDao();
        } else if (dbType.equals("MySql")) {
            userInfoDao = new UserInfoMysqlDao();
        }else if (dbType.equals("Mongo")) {
            userInfoDao = new UserInfoMongoDao();
        }else{
            System.out.println("db support error");
            return;
        }
        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);


    }

}
