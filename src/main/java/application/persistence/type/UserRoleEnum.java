package application.persistence.type;

public enum UserRoleEnum {

    ROLE_ADMIN,
    ROLE_CUSTOMER;

    public final String getRoleName() {
        return this.name();
    }

}
