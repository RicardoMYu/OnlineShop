package com.ischoolbar.programmer.entity.wx;

public class wxUser {
public int id;
public String openid;
public String nickName;
public String gender;
public String avatarUrl;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getOpenid() {
	return openid;
}
public void setOpenid(String openid) {
	this.openid = openid;
}
public String getNickName() {
	return nickName;
}
public void setNickName(String nickName) {
	this.nickName = nickName;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getAvatarUrl() {
	return avatarUrl;
}
public void setAvatarUrl(String avatarUrl) {
	this.avatarUrl = avatarUrl;
}
@Override
public String toString() {
	return "User [id=" + id + ", openid=" + openid + ", nickName=" + nickName
			+ ", gender=" + gender + ", avatarUrl=" + avatarUrl + "]";
}

}
