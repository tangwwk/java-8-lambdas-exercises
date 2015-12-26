package annotation.imooc;

/**
 * Created with IntelliJ IDEA.
 * User: TangWenWu
 * Date: 2015/12/26
 * Time: 10:00
 * CopyRight:HuiMei Engine
 */
@Table("person")
public class Person {

    @Column("id")
    private Integer id;
    @Column(value = "user_name",useLike = true)
    private String userName;
    @Column("nick_name")
    private String nickName;
    @Column(value = "email",useLike = true)
    private String email;
    @Column("age")
    private Integer age;
    @Column("mobile")
    private String mobile;

    private String fullName;

    public String getFullName() {

        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
