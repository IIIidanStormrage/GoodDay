package zxb.advance.model.dao;

import java.io.Serializable;
import java.util.Date;

public class TopicUser implements Serializable {
    private Integer id;

    private Integer topicid;

    private String name;

    private String mobile;

    private Boolean sex;

    private String email;

    private String series;

    private String intentcar;

    private String buytime;

    private String buybudget;

    private String province;

    private String city;

    private String dealer;

    private Boolean isdrive;

    private String remark;

    private Boolean platform;

    private String ip;

    private Integer pvareaid;

    private String typeid;

    private String pageloadid;

    private String referrer;

    private String sessionid;

    private Boolean status;

    private String extend1;

    private Integer extend2;

    private Integer extend3;

    private Date updatetime;

    private Date createtime;

    private String pvid;

    private String encryptname;

    private String encryptmobile;

    private String encryptemail;

    private String hashmobile;

    private String hashname;

    private String hashemail;

    private Integer keysupplybusinessid;

    private String keyinsidelinkidid;

    private String keyoutsidepvareaidid;

    private Byte keyneedbusinessid;

    private String keyuniqueid;

    private Integer keyactivityid;

    private Integer keyreleaseid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTopicid() {
        return topicid;
    }

    public void setTopicid(Integer topicid) {
        this.topicid = topicid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series == null ? null : series.trim();
    }

    public String getIntentcar() {
        return intentcar;
    }

    public void setIntentcar(String intentcar) {
        this.intentcar = intentcar == null ? null : intentcar.trim();
    }

    public String getBuytime() {
        return buytime;
    }

    public void setBuytime(String buytime) {
        this.buytime = buytime == null ? null : buytime.trim();
    }

    public String getBuybudget() {
        return buybudget;
    }

    public void setBuybudget(String buybudget) {
        this.buybudget = buybudget == null ? null : buybudget.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDealer() {
        return dealer;
    }

    public void setDealer(String dealer) {
        this.dealer = dealer == null ? null : dealer.trim();
    }

    public Boolean getIsdrive() {
        return isdrive;
    }

    public void setIsdrive(Boolean isdrive) {
        this.isdrive = isdrive;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Boolean getPlatform() {
        return platform;
    }

    public void setPlatform(Boolean platform) {
        this.platform = platform;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Integer getPvareaid() {
        return pvareaid;
    }

    public void setPvareaid(Integer pvareaid) {
        this.pvareaid = pvareaid;
    }

    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid == null ? null : typeid.trim();
    }

    public String getPageloadid() {
        return pageloadid;
    }

    public void setPageloadid(String pageloadid) {
        this.pageloadid = pageloadid == null ? null : pageloadid.trim();
    }

    public String getReferrer() {
        return referrer;
    }

    public void setReferrer(String referrer) {
        this.referrer = referrer == null ? null : referrer.trim();
    }

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid == null ? null : sessionid.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getExtend1() {
        return extend1;
    }

    public void setExtend1(String extend1) {
        this.extend1 = extend1 == null ? null : extend1.trim();
    }

    public Integer getExtend2() {
        return extend2;
    }

    public void setExtend2(Integer extend2) {
        this.extend2 = extend2;
    }

    public Integer getExtend3() {
        return extend3;
    }

    public void setExtend3(Integer extend3) {
        this.extend3 = extend3;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getPvid() {
        return pvid;
    }

    public void setPvid(String pvid) {
        this.pvid = pvid == null ? null : pvid.trim();
    }

    public String getEncryptname() {
        return encryptname;
    }

    public void setEncryptname(String encryptname) {
        this.encryptname = encryptname == null ? null : encryptname.trim();
    }

    public String getEncryptmobile() {
        return encryptmobile;
    }

    public void setEncryptmobile(String encryptmobile) {
        this.encryptmobile = encryptmobile == null ? null : encryptmobile.trim();
    }

    public String getEncryptemail() {
        return encryptemail;
    }

    public void setEncryptemail(String encryptemail) {
        this.encryptemail = encryptemail == null ? null : encryptemail.trim();
    }

    public String getHashmobile() {
        return hashmobile;
    }

    public void setHashmobile(String hashmobile) {
        this.hashmobile = hashmobile == null ? null : hashmobile.trim();
    }

    public String getHashname() {
        return hashname;
    }

    public void setHashname(String hashname) {
        this.hashname = hashname == null ? null : hashname.trim();
    }

    public String getHashemail() {
        return hashemail;
    }

    public void setHashemail(String hashemail) {
        this.hashemail = hashemail == null ? null : hashemail.trim();
    }

    public Integer getKeysupplybusinessid() {
        return keysupplybusinessid;
    }

    public void setKeysupplybusinessid(Integer keysupplybusinessid) {
        this.keysupplybusinessid = keysupplybusinessid;
    }

    public String getKeyinsidelinkidid() {
        return keyinsidelinkidid;
    }

    public void setKeyinsidelinkidid(String keyinsidelinkidid) {
        this.keyinsidelinkidid = keyinsidelinkidid == null ? null : keyinsidelinkidid.trim();
    }

    public String getKeyoutsidepvareaidid() {
        return keyoutsidepvareaidid;
    }

    public void setKeyoutsidepvareaidid(String keyoutsidepvareaidid) {
        this.keyoutsidepvareaidid = keyoutsidepvareaidid == null ? null : keyoutsidepvareaidid.trim();
    }

    public Byte getKeyneedbusinessid() {
        return keyneedbusinessid;
    }

    public void setKeyneedbusinessid(Byte keyneedbusinessid) {
        this.keyneedbusinessid = keyneedbusinessid;
    }

    public String getKeyuniqueid() {
        return keyuniqueid;
    }

    public void setKeyuniqueid(String keyuniqueid) {
        this.keyuniqueid = keyuniqueid == null ? null : keyuniqueid.trim();
    }

    public Integer getKeyactivityid() {
        return keyactivityid;
    }

    public void setKeyactivityid(Integer keyactivityid) {
        this.keyactivityid = keyactivityid;
    }

    public Integer getKeyreleaseid() {
        return keyreleaseid;
    }

    public void setKeyreleaseid(Integer keyreleaseid) {
        this.keyreleaseid = keyreleaseid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", topicid=").append(topicid);
        sb.append(", name=").append(name);
        sb.append(", mobile=").append(mobile);
        sb.append(", sex=").append(sex);
        sb.append(", email=").append(email);
        sb.append(", series=").append(series);
        sb.append(", intentcar=").append(intentcar);
        sb.append(", buytime=").append(buytime);
        sb.append(", buybudget=").append(buybudget);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", dealer=").append(dealer);
        sb.append(", isdrive=").append(isdrive);
        sb.append(", remark=").append(remark);
        sb.append(", platform=").append(platform);
        sb.append(", ip=").append(ip);
        sb.append(", pvareaid=").append(pvareaid);
        sb.append(", typeid=").append(typeid);
        sb.append(", pageloadid=").append(pageloadid);
        sb.append(", referrer=").append(referrer);
        sb.append(", sessionid=").append(sessionid);
        sb.append(", status=").append(status);
        sb.append(", extend1=").append(extend1);
        sb.append(", extend2=").append(extend2);
        sb.append(", extend3=").append(extend3);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", createtime=").append(createtime);
        sb.append(", pvid=").append(pvid);
        sb.append(", encryptname=").append(encryptname);
        sb.append(", encryptmobile=").append(encryptmobile);
        sb.append(", encryptemail=").append(encryptemail);
        sb.append(", hashmobile=").append(hashmobile);
        sb.append(", hashname=").append(hashname);
        sb.append(", hashemail=").append(hashemail);
        sb.append(", keysupplybusinessid=").append(keysupplybusinessid);
        sb.append(", keyinsidelinkidid=").append(keyinsidelinkidid);
        sb.append(", keyoutsidepvareaidid=").append(keyoutsidepvareaidid);
        sb.append(", keyneedbusinessid=").append(keyneedbusinessid);
        sb.append(", keyuniqueid=").append(keyuniqueid);
        sb.append(", keyactivityid=").append(keyactivityid);
        sb.append(", keyreleaseid=").append(keyreleaseid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}