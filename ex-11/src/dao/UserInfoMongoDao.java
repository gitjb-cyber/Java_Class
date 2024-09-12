package dao;

public class UserInfoMongoDao implements UserInfoDao{
    @Override
    public void insertUserInfo(UserInfo userInfo){
        System.out.println("insert into Mongo DB userId = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo){
        System.out.println("update into Mongo DB userId = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo){
        System.out.println("delete from Mongo DB userId = " + userInfo.getUserId());
    }

}
