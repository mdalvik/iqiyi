package com.wzb.bean;

/**
 * Created by Administrator on 2016/6/6 0006.
 */
public class IqiyiInfo {


    /**
     * guid : {"privilege_content":"绑定手机号，可以更好地保护您的账号安全，保护个人信息和记录不被侵害。","bind_type":3,"choose_content":"吊","accept_notice":0}
     * qiyi_vip_info : {"name":"Felicity1234","level":"1","vipType":"1","autoRenew":"0","payType":"0","status":"3","type":"0","mobile":"13888888888","surplus":"","deadline":{"t":1465116712000,"date":"2020年06月05日"}}
     * authcookie : a1MlsMw4A4kMWQnqZvb5eLsAVtNzWbAjskKm3YzZx1Uua2wUPXhzIH2HnQwZS2rzdHO11
     * token : null
     * level_info : null
     * pps_vip_info : {"vip_expire":"","vip_type":0,"level_moon":"00","level_star":"01","level_sun":"00","pps_bean":0,"pps_level":1,"vip_remain_day":0,"user_id":1285396897,"skip_ad":1}
     * userinfo : {"city":null,"province":null,"self_intro":null,"passwdPin":null,"gender":1,"edu":null,"income":null,"industry":null,"idCard":null,"pru":1285396897,"birthday":null,"jointime":"1463967025","regip":"183.14.223.133","suid":"1285396897","real_name":null,"work":null,"pwdScore":35,"activated":0,"accountType":11,"pwdUptime":1463967025,"email":"","phone":"13888888888","uid":"1285396897","user_name":"13888888888","macid":null,"nickname":"Felicity1234","find_pass_email":null,"icon":"http://www.qiyipic.com/common/fix/headicons/male-70.png","status":null}
     * guide_to_bind_phone : false
     * insecure_account : 0
     */

    private DataBean data;
    /**
     * data : {"guid":{"privilege_content":"绑定手机号，可以更好地保护您的账号安全，保护个人信息和记录不被侵害。","bind_type":3,"choose_content":"吊","accept_notice":0},"qiyi_vip_info":{"name":"Felicity1234","level":"1","vipType":"1","autoRenew":"0","payType":"0","status":"3","type":"0","mobile":"13888888888","surplus":"","deadline":{"t":1465116712000,"date":"2020年06月05日"}},"authcookie":"a1MlsMw4A4kMWQnqZvb5eLsAVtNzWbAjskKm3YzZx1Uua2wUPXhzIH2HnQwZS2rzdHO11","token":null,"level_info":null,"pps_vip_info":{"vip_expire":"","vip_type":0,"level_moon":"00","level_star":"01","level_sun":"00","pps_bean":0,"pps_level":1,"vip_remain_day":0,"user_id":1285396897,"skip_ad":1},"userinfo":{"city":null,"province":null,"self_intro":null,"passwdPin":null,"gender":1,"edu":null,"income":null,"industry":null,"idCard":null,"pru":1285396897,"birthday":null,"jointime":"1463967025","regip":"183.14.223.133","suid":"1285396897","real_name":null,"work":null,"pwdScore":35,"activated":0,"accountType":11,"pwdUptime":1463967025,"email":"","phone":"13888888888","uid":"1285396897","user_name":"13888888888","macid":null,"nickname":"Felicity1234","find_pass_email":null,"icon":"http://www.qiyipic.com/common/fix/headicons/male-70.png","status":null},"guide_to_bind_phone":false,"insecure_account":0}
     * code : A00000
     * msg : null
     */

    private String code;
    private Object msg;

    @Override
    public String toString() {
        return "IqiyiInfo{" +
                "data=" + data +
                ", code='" + code + '\'' +
                ", msg=" + msg +
                '}';
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getMsg() {
        return msg;
    }

    public void setMsg(Object msg) {
        this.msg = msg;
    }

    public static class DataBean {

        @Override
        public String toString() {
            return "DataBean{" +
                    "guid=" + guid +
                    ", qiyi_vip_info=" + qiyi_vip_info +
                    ", authcookie='" + authcookie + '\'' +
                    ", token=" + token +
                    ", level_info=" + level_info +
                    ", pps_vip_info=" + pps_vip_info +
                    ", userinfo=" + userinfo +
                    ", guide_to_bind_phone=" + guide_to_bind_phone +
                    ", insecure_account=" + insecure_account +
                    '}';
        }

        /**
         * privilege_content : 绑定手机号，可以更好地保护您的账号安全，保护个人信息和记录不被侵害。
         * bind_type : 3
         * choose_content : 吊
         * accept_notice : 0
         */

        private GuidBean guid;
        /**
         * name : Felicity1234
         * level : 1
         * vipType : 1
         * autoRenew : 0
         * payType : 0
         * status : 3
         * type : 0
         * mobile : 13888888888
         * surplus :
         * deadline : {"t":1465116712000,"date":"2020年06月05日"}
         */

        private QiyiVipInfoBean qiyi_vip_info;
        private String authcookie;
        private Object token;
        private Object level_info;
        /**
         * vip_expire :
         * vip_type : 0
         * level_moon : 00
         * level_star : 01
         * level_sun : 00
         * pps_bean : 0
         * pps_level : 1
         * vip_remain_day : 0
         * user_id : 1285396897
         * skip_ad : 1
         */

        private PpsVipInfoBean pps_vip_info;
        /**
         * city : null
         * province : null
         * self_intro : null
         * passwdPin : null
         * gender : 1
         * edu : null
         * income : null
         * industry : null
         * idCard : null
         * pru : 1285396897
         * birthday : null
         * jointime : 1463967025
         * regip : 183.14.223.133
         * suid : 1285396897
         * real_name : null
         * work : null
         * pwdScore : 35
         * activated : 0
         * accountType : 11
         * pwdUptime : 1463967025
         * email :
         * phone : 13888888888
         * uid : 1285396897
         * user_name : 13888888888
         * macid : null
         * nickname : Felicity1234
         * find_pass_email : null
         * icon : http://www.qiyipic.com/common/fix/headicons/male-70.png
         * status : null
         */

        private UserinfoBean userinfo;
        private boolean guide_to_bind_phone;
        private int insecure_account;

        public GuidBean getGuid() {
            return guid;
        }

        public void setGuid(GuidBean guid) {
            this.guid = guid;
        }

        public QiyiVipInfoBean getQiyi_vip_info() {
            return qiyi_vip_info;
        }

        public void setQiyi_vip_info(QiyiVipInfoBean qiyi_vip_info) {
            this.qiyi_vip_info = qiyi_vip_info;
        }

        public String getAuthcookie() {
            return authcookie;
        }

        public void setAuthcookie(String authcookie) {
            this.authcookie = authcookie;
        }

        public Object getToken() {
            return token;
        }

        public void setToken(Object token) {
            this.token = token;
        }

        public Object getLevel_info() {
            return level_info;
        }

        public void setLevel_info(Object level_info) {
            this.level_info = level_info;
        }

        public PpsVipInfoBean getPps_vip_info() {
            return pps_vip_info;
        }

        public void setPps_vip_info(PpsVipInfoBean pps_vip_info) {
            this.pps_vip_info = pps_vip_info;
        }

        public UserinfoBean getUserinfo() {
            return userinfo;
        }

        public void setUserinfo(UserinfoBean userinfo) {
            this.userinfo = userinfo;
        }

        public boolean isGuide_to_bind_phone() {
            return guide_to_bind_phone;
        }

        public void setGuide_to_bind_phone(boolean guide_to_bind_phone) {
            this.guide_to_bind_phone = guide_to_bind_phone;
        }

        public int getInsecure_account() {
            return insecure_account;
        }

        public void setInsecure_account(int insecure_account) {
            this.insecure_account = insecure_account;
        }

        public static class GuidBean {
            @Override
            public String toString() {
                return "GuidBean{" +
                        "privilege_content='" + privilege_content + '\'' +
                        ", bind_type=" + bind_type +
                        ", choose_content='" + choose_content + '\'' +
                        ", accept_notice=" + accept_notice +
                        '}';
            }

            private String privilege_content;
            private int bind_type;
            private String choose_content;
            private int accept_notice;

            public String getPrivilege_content() {
                return privilege_content;
            }

            public void setPrivilege_content(String privilege_content) {
                this.privilege_content = privilege_content;
            }

            public int getBind_type() {
                return bind_type;
            }

            public void setBind_type(int bind_type) {
                this.bind_type = bind_type;
            }

            public String getChoose_content() {
                return choose_content;
            }

            public void setChoose_content(String choose_content) {
                this.choose_content = choose_content;
            }

            public int getAccept_notice() {
                return accept_notice;
            }

            public void setAccept_notice(int accept_notice) {
                this.accept_notice = accept_notice;
            }
        }

        public static class QiyiVipInfoBean {
            @Override
            public String toString() {
                return "QiyiVipInfoBean{" +
                        "name='" + name + '\'' +
                        ", level='" + level + '\'' +
                        ", vipType='" + vipType + '\'' +
                        ", autoRenew='" + autoRenew + '\'' +
                        ", payType='" + payType + '\'' +
                        ", status='" + status + '\'' +
                        ", type='" + type + '\'' +
                        ", mobile='" + mobile + '\'' +
                        ", surplus='" + surplus + '\'' +
                        ", deadline=" + deadline +
                        '}';
            }

            private String name;
            private String level;
            private String vipType;
            private String autoRenew;
            private String payType;
            private String status;
            private String type;
            private String mobile;
            private String surplus;
            /**
             * t : 1465116712000
             * date : 2020年06月05日
             */

            private DeadlineBean deadline;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getLevel() {
                return level;
            }

            public void setLevel(String level) {
                this.level = level;
            }

            public String getVipType() {
                return vipType;
            }

            public void setVipType(String vipType) {
                this.vipType = vipType;
            }

            public String getAutoRenew() {
                return autoRenew;
            }

            public void setAutoRenew(String autoRenew) {
                this.autoRenew = autoRenew;
            }

            public String getPayType() {
                return payType;
            }

            public void setPayType(String payType) {
                this.payType = payType;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getMobile() {
                return mobile;
            }

            public void setMobile(String mobile) {
                this.mobile = mobile;
            }

            public String getSurplus() {
                return surplus;
            }

            public void setSurplus(String surplus) {
                this.surplus = surplus;
            }

            public DeadlineBean getDeadline() {
                return deadline;
            }

            public void setDeadline(DeadlineBean deadline) {
                this.deadline = deadline;
            }

            public static class DeadlineBean {
                private long t;
                private String date;

                public long getT() {
                    return t;
                }

                public void setT(long t) {
                    this.t = t;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }
            }
        }

        public static class PpsVipInfoBean {
            @Override
            public String toString() {
                return "PpsVipInfoBean{" +
                        "vip_expire='" + vip_expire + '\'' +
                        ", vip_type=" + vip_type +
                        ", level_moon='" + level_moon + '\'' +
                        ", level_star='" + level_star + '\'' +
                        ", level_sun='" + level_sun + '\'' +
                        ", pps_bean=" + pps_bean +
                        ", pps_level=" + pps_level +
                        ", vip_remain_day=" + vip_remain_day +
                        ", user_id=" + user_id +
                        ", skip_ad=" + skip_ad +
                        '}';
            }

            private String vip_expire;
            private int vip_type;
            private String level_moon;
            private String level_star;
            private String level_sun;
            private int pps_bean;
            private int pps_level;
            private int vip_remain_day;
            private int user_id;
            private int skip_ad;

            public String getVip_expire() {
                return vip_expire;
            }

            public void setVip_expire(String vip_expire) {
                this.vip_expire = vip_expire;
            }

            public int getVip_type() {
                return vip_type;
            }

            public void setVip_type(int vip_type) {
                this.vip_type = vip_type;
            }

            public String getLevel_moon() {
                return level_moon;
            }

            public void setLevel_moon(String level_moon) {
                this.level_moon = level_moon;
            }

            public String getLevel_star() {
                return level_star;
            }

            public void setLevel_star(String level_star) {
                this.level_star = level_star;
            }

            public String getLevel_sun() {
                return level_sun;
            }

            public void setLevel_sun(String level_sun) {
                this.level_sun = level_sun;
            }

            public int getPps_bean() {
                return pps_bean;
            }

            public void setPps_bean(int pps_bean) {
                this.pps_bean = pps_bean;
            }

            public int getPps_level() {
                return pps_level;
            }

            public void setPps_level(int pps_level) {
                this.pps_level = pps_level;
            }

            public int getVip_remain_day() {
                return vip_remain_day;
            }

            public void setVip_remain_day(int vip_remain_day) {
                this.vip_remain_day = vip_remain_day;
            }

            public int getUser_id() {
                return user_id;
            }

            public void setUser_id(int user_id) {
                this.user_id = user_id;
            }

            public int getSkip_ad() {
                return skip_ad;
            }

            public void setSkip_ad(int skip_ad) {
                this.skip_ad = skip_ad;
            }
        }

        public static class UserinfoBean {
            @Override
            public String toString() {
                return "UserinfoBean{" +
                        "city=" + city +
                        ", province=" + province +
                        ", self_intro=" + self_intro +
                        ", passwdPin=" + passwdPin +
                        ", gender=" + gender +
                        ", edu=" + edu +
                        ", income=" + income +
                        ", industry=" + industry +
                        ", idCard=" + idCard +
                        ", pru=" + pru +
                        ", birthday=" + birthday +
                        ", jointime='" + jointime + '\'' +
                        ", regip='" + regip + '\'' +
                        ", suid='" + suid + '\'' +
                        ", real_name=" + real_name +
                        ", work=" + work +
                        ", pwdScore=" + pwdScore +
                        ", activated=" + activated +
                        ", accountType=" + accountType +
                        ", pwdUptime=" + pwdUptime +
                        ", email='" + email + '\'' +
                        ", phone='" + phone + '\'' +
                        ", uid='" + uid + '\'' +
                        ", user_name='" + user_name + '\'' +
                        ", macid=" + macid +
                        ", nickname='" + nickname + '\'' +
                        ", find_pass_email=" + find_pass_email +
                        ", icon='" + icon + '\'' +
                        ", status=" + status +
                        '}';
            }

            private Object city;
            private Object province;
            private Object self_intro;
            private Object passwdPin;
            private int gender;
            private Object edu;
            private Object income;
            private Object industry;
            private Object idCard;
            private int pru;
            private Object birthday;
            private String jointime;
            private String regip;
            private String suid;
            private Object real_name;
            private Object work;
            private int pwdScore;
            private int activated;
            private int accountType;
            private int pwdUptime;
            private String email;
            private String phone;
            private String uid;
            private String user_name;
            private Object macid;
            private String nickname;
            private Object find_pass_email;
            private String icon;
            private Object status;

            public Object getCity() {
                return city;
            }

            public void setCity(Object city) {
                this.city = city;
            }

            public Object getProvince() {
                return province;
            }

            public void setProvince(Object province) {
                this.province = province;
            }

            public Object getSelf_intro() {
                return self_intro;
            }

            public void setSelf_intro(Object self_intro) {
                this.self_intro = self_intro;
            }

            public Object getPasswdPin() {
                return passwdPin;
            }

            public void setPasswdPin(Object passwdPin) {
                this.passwdPin = passwdPin;
            }

            public int getGender() {
                return gender;
            }

            public void setGender(int gender) {
                this.gender = gender;
            }

            public Object getEdu() {
                return edu;
            }

            public void setEdu(Object edu) {
                this.edu = edu;
            }

            public Object getIncome() {
                return income;
            }

            public void setIncome(Object income) {
                this.income = income;
            }

            public Object getIndustry() {
                return industry;
            }

            public void setIndustry(Object industry) {
                this.industry = industry;
            }

            public Object getIdCard() {
                return idCard;
            }

            public void setIdCard(Object idCard) {
                this.idCard = idCard;
            }

            public int getPru() {
                return pru;
            }

            public void setPru(int pru) {
                this.pru = pru;
            }

            public Object getBirthday() {
                return birthday;
            }

            public void setBirthday(Object birthday) {
                this.birthday = birthday;
            }

            public String getJointime() {
                return jointime;
            }

            public void setJointime(String jointime) {
                this.jointime = jointime;
            }

            public String getRegip() {
                return regip;
            }

            public void setRegip(String regip) {
                this.regip = regip;
            }

            public String getSuid() {
                return suid;
            }

            public void setSuid(String suid) {
                this.suid = suid;
            }

            public Object getReal_name() {
                return real_name;
            }

            public void setReal_name(Object real_name) {
                this.real_name = real_name;
            }

            public Object getWork() {
                return work;
            }

            public void setWork(Object work) {
                this.work = work;
            }

            public int getPwdScore() {
                return pwdScore;
            }

            public void setPwdScore(int pwdScore) {
                this.pwdScore = pwdScore;
            }

            public int getActivated() {
                return activated;
            }

            public void setActivated(int activated) {
                this.activated = activated;
            }

            public int getAccountType() {
                return accountType;
            }

            public void setAccountType(int accountType) {
                this.accountType = accountType;
            }

            public int getPwdUptime() {
                return pwdUptime;
            }

            public void setPwdUptime(int pwdUptime) {
                this.pwdUptime = pwdUptime;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getUser_name() {
                return user_name;
            }

            public void setUser_name(String user_name) {
                this.user_name = user_name;
            }

            public Object getMacid() {
                return macid;
            }

            public void setMacid(Object macid) {
                this.macid = macid;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public Object getFind_pass_email() {
                return find_pass_email;
            }

            public void setFind_pass_email(Object find_pass_email) {
                this.find_pass_email = find_pass_email;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public Object getStatus() {
                return status;
            }

            public void setStatus(Object status) {
                this.status = status;
            }
        }
    }

}
