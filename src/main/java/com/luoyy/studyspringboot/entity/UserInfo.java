package com.luoyy.studyspringboot.entity;

import lombok.Data;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Proxy(lazy = false)
public class UserInfo implements Serializable {
    @Id
    @GeneratedValue
    private Integer uid;
    @Column(unique =true)
    private String username;
    /** 名称（昵称或者真实姓名，不同系统不同定义）*/
    private String name;
    /** 密码; */
    private String password;
    /** 加密密码的盐 */
    private String salt;
    /** 用户状态,0:创建未认证（比如没有激活，没有输入验证码等等）--等待验证的用户 , 1:正常状态,2：用户被锁定. */
    private byte state;
    @ManyToMany(fetch= FetchType.EAGER)
    @JoinTable(name = "SysUserRole", joinColumns = { @JoinColumn(name = "uid") }, inverseJoinColumns ={@JoinColumn(name = "roleId") })
    /** 立即从数据库中进行加载数据;
     一个用户具有多个角色 */
    private List<SysRole> roleList;
    /**
     * 密码盐.
     * @return
     */
    public String getCredentialsSalt(){
        return this.username+this.salt;
    }
    //重新对盐重新进行了定义，用户名+salt，这样就更加不容易被破解

}
