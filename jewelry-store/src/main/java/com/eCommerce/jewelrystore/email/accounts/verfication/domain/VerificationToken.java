package com.eCommerce.jewelrystore.email.accounts.verfication.domain;

import com.eCommerce.jewelrystore.accounts.models.User;
import org.graalvm.compiler.lir.CompositeValue;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name = "jVerificationToken")
public class VerificationToken {

    private static final int EXPIRATION = 60 * 24;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TokenId")
    private Long tokenId;

    @Column(name = "Token")
    private String token;
//
//    @Column(name = "UserId")
//    private Long userId;

    @OneToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "Id")
    private User user;

    @Column(name = "ExpiryDate")
    private Date expiryDate;

    public void addUser(User user){
        this.user=user;
    }

    private Date calculateExpiryDate(int expiryTimeInMinutes) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Timestamp(cal.getTime().getTime()));
        cal.add(Calendar.MINUTE, expiryTimeInMinutes);
        return new Date(cal.getTime().getTime());
    }

    public VerificationToken() {
    }

    public static int getEXPIRATION() {
        return EXPIRATION;
    }

    public Long getId() {
        return tokenId;
    }

    public void setId(Long tokenId) {
        this.tokenId = tokenId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

//    public Long getUserId() {
//        return userId;
//    }
//
//    public void setUserId(Long userId) {
//        this.userId = userId;
//    }
}