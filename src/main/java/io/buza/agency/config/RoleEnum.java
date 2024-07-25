package io.buza.agency.config;

public enum RoleEnum {

    NORMAL(Authority.NORMAL),  // 일반 관리자 권한
    USER(Authority.USER),  // 사용자 권한
    ADMIN(Authority.ADMIN);  // 관리자 권한

    private final String authority;

    RoleEnum(String authority) {
        this.authority = authority;
    }

    public String getAuthority() {
        return this.authority;
    }

    public static class Authority {
        public static final String NORMAL = "ROLE_NORMAL";
        public static final String USER = "ROLE_USER";
        public static final String ADMIN = "ROLE_ADMIN";
    }

}
