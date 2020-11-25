package com.poc.bem.demo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;

@Document(collection = "users")
@Getter
@NoArgsConstructor
@Slf4j
public class AppUser {

    @Id
    private String id;

    private String firstName;
    private String lastName;

    @Indexed(name = "IDX_EMAIL", unique = true)
    private String email;

    @Indexed(name = "IDX_PHONE", unique = true)
    private String phone;

    private String ipAddress;
    private String createProgramId;
    private String modifyProgramId;
    private Timestamp createTimestamp;
    private Timestamp modifyTimestamp;
    private String createUserId;
    private String modifyUserId;

    public AppUser(@NonNull AppUserBuilder builder) {
        this.id = builder.getId();
        this.firstName = builder.getFirstName();
        this.lastName = builder.getLastName();
        this.email = builder.getEmail();
        this.phone = builder.getPhone();
        this.ipAddress = builder.getIpAddress();
        this.createProgramId = builder.getCreateProgramId();
        this.modifyProgramId = builder.getModifyProgramId();
        this.createTimestamp = builder.getCreateTimestamp();
        this.modifyTimestamp = builder.getModifyTimestamp();
        this.createUserId = builder.getCreateUserId();
        this.modifyUserId = builder.getModifyUserId();
    }

    public AppUser(@NonNull AppUser user) {
        this.id = user.getId();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.email = user.getEmail();
        this.phone = user.getPhone();
        this.ipAddress = user.getIpAddress();
        this.createProgramId = user.getCreateProgramId();
        this.modifyProgramId = user.getModifyProgramId();
        this.createTimestamp = user.getCreateTimestamp();
        this.modifyTimestamp = user.getModifyTimestamp();
        this.createUserId = user.getCreateUserId();
        this.modifyUserId = user.getModifyUserId();
    }

    public AppUser(@NonNull AppUserDTO user) {
        this.id = user.getId();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.email = user.getEmail();
        this.phone = user.getPhone();
        this.ipAddress = user.getIpAddress();
        this.createProgramId = user.getCreateProgramId();
        this.modifyProgramId = user.getModifyProgramId();
        this.createTimestamp = user.getCreateTimestamp();
        this.modifyTimestamp = user.getModifyTimestamp();
        this.createUserId = user.getCreateUserId();
        this.modifyUserId = user.getModifyUserId();
    }

    public AppUserBuilder builder() {
        return new AppUserBuilder();
    }

    @Override
    public String toString() {
        return "{"
                + "\"id\": \"" + id + "\","
                + "\"firstName\": \"" + firstName + "\","
                + "\"lastName\": \"" + lastName + "\","
                + "\"email\": \"" + email + "\","
                + "\"phone\": \"" + phone + "\","
                + "\"ipAddress\": \"" + ipAddress + "\","
                + "\"createProgramId\": \"" + createProgramId + "\","
                + "\"modifyProgramId\": \"" + modifyProgramId + "\","
                + "\"createTimestamp\": \"" + createTimestamp + "\","
                + "\"modifyTimestamp\": \"" + modifyTimestamp + "\","
                + "\"createUserId\": \"" + createUserId + "\","
                + "\"modifyUserId\": \"" + modifyUserId + "\""
                + "}";
    }
}
